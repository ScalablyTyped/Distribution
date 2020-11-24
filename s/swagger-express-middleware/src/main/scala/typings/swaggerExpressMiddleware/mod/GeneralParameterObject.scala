package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
}
object GeneralParameterObject {
  
  @scala.inline
  def apply(exclusiveMaximum: Boolean, in: String, name: String, `type`: String): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(exclusiveMaximum = exclusiveMaximum.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralParameterObject]
  }
  
  @scala.inline
  implicit class GeneralParameterObjectOps[Self <: GeneralParameterObject] (val x: Self) extends AnyVal {
    
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
    def setAllowEmptyValue(value: Boolean): Self = this.set("allowEmptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmptyValue: Self = this.set("allowEmptyValue", js.undefined)
  }
}
