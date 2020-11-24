package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<vue.vue/types/vnode.VNodeDirective> */
@js.native
trait DirectiveBinding extends js.Object {
  
  val arg: js.UndefOr[String] = js.native
  
  val expression: js.UndefOr[js.Any] = js.native
  
  val modifiers: StringDictionary[Boolean] = js.native
  
  val name: String = js.native
  
  val oldArg: js.UndefOr[String] = js.native
  
  val oldValue: js.UndefOr[js.Any] = js.native
  
  val value: js.UndefOr[js.Any] = js.native
}
object DirectiveBinding {
  
  @scala.inline
  def apply(modifiers: StringDictionary[Boolean], name: String): DirectiveBinding = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveBinding]
  }
  
  @scala.inline
  implicit class DirectiveBindingOps[Self <: DirectiveBinding] (val x: Self) extends AnyVal {
    
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
    def setModifiers(value: StringDictionary[Boolean]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setExpression(value: js.Any): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setOldArg(value: String): Self = this.set("oldArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldArg: Self = this.set("oldArg", js.undefined)
    
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
