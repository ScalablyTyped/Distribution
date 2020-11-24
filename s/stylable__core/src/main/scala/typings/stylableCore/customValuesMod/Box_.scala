package typings.stylableCore.customValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box_[Type /* <: String */, Value /* <: js.Any */] extends js.Object {
  
  var `type`: Type = js.native
  
  var value: Value = js.native
}
object Box_ {
  
  @scala.inline
  def apply[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box_[Type, Value]]
  }
  
  @scala.inline
  implicit class Box_Ops[Self <: Box_[_, _], Type /* <: String */, Value /* <: js.Any */] (val x: Self with (Box_[Type, Value])) extends AnyVal {
    
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
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
