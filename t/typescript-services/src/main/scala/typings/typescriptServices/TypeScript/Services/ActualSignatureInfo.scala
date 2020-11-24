package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActualSignatureInfo extends js.Object {
  
  var currentParameter: Double = js.native
  
  var currentParameterIsTypeParameter: Boolean = js.native
  
  var parameterLimChar: Double = js.native
  
  var parameterMinChar: Double = js.native
}
object ActualSignatureInfo {
  
  @scala.inline
  def apply(
    currentParameter: Double,
    currentParameterIsTypeParameter: Boolean,
    parameterLimChar: Double,
    parameterMinChar: Double
  ): ActualSignatureInfo = {
    val __obj = js.Dynamic.literal(currentParameter = currentParameter.asInstanceOf[js.Any], currentParameterIsTypeParameter = currentParameterIsTypeParameter.asInstanceOf[js.Any], parameterLimChar = parameterLimChar.asInstanceOf[js.Any], parameterMinChar = parameterMinChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualSignatureInfo]
  }
  
  @scala.inline
  implicit class ActualSignatureInfoOps[Self <: ActualSignatureInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrentParameter(value: Double): Self = this.set("currentParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentParameterIsTypeParameter(value: Boolean): Self = this.set("currentParameterIsTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterLimChar(value: Double): Self = this.set("parameterLimChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterMinChar(value: Double): Self = this.set("parameterMinChar", value.asInstanceOf[js.Any])
  }
}
