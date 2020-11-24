package typings.typeCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOf extends js.Object {
  
  var typeOf: String = js.native
  
  def validate(x: js.Any): js.Any = js.native
}
object TypeOf {
  
  @scala.inline
  def apply(typeOf: String, validate: js.Any => js.Any): TypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[TypeOf]
  }
  
  @scala.inline
  implicit class TypeOfOps[Self <: TypeOf] (val x: Self) extends AnyVal {
    
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
    def setTypeOf(value: String): Self = this.set("typeOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: js.Any => js.Any): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
