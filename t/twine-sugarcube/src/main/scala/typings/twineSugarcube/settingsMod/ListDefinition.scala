package typings.twineSugarcube.settingsMod

import typings.twineSugarcube.extensionsMod.global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDefinition[T] extends SettingDefinition {
  
  /**
    * The default value for the setting and default state of the control. It should have the same value as one of the members of
    * the list array. Leaving it undefined means to use the first array member as the default.
    */
  var default: js.UndefOr[T] = js.native
  
  /**
    * The array of items.
    */
  var list: Array[T] = js.native
}
object ListDefinition {
  
  @scala.inline
  def apply[T](label: String, list: Array[T]): ListDefinition[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDefinition[T]]
  }
  
  @scala.inline
  implicit class ListDefinitionOps[Self <: ListDefinition[_], T] (val x: Self with ListDefinition[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setList(value: Array[T]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
