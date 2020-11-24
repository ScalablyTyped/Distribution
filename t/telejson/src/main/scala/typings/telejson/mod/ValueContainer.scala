package typings.telejson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueContainer
  extends /* keys */ StringDictionary[js.Any] {
  
  var `_constructor-name_`: js.UndefOr[String] = js.native
}
object ValueContainer {
  
  @scala.inline
  def apply(): ValueContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueContainer]
  }
  
  @scala.inline
  implicit class ValueContainerOps[Self <: ValueContainer] (val x: Self) extends AnyVal {
    
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
    def `set_constructor-name_`(value: String): Self = this.set("_constructor-name_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete_constructor-name_`: Self = this.set("_constructor-name_", js.undefined)
  }
}
