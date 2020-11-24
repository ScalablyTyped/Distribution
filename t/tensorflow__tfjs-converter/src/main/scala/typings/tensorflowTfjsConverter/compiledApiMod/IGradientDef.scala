package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGradientDef extends js.Object {
  
  /** GradientDef functionName */
  var functionName: js.UndefOr[String | Null] = js.native
  
  /** GradientDef gradientFunc */
  var gradientFunc: js.UndefOr[String | Null] = js.native
}
object IGradientDef {
  
  @scala.inline
  def apply(): IGradientDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientDef]
  }
  
  @scala.inline
  implicit class IGradientDefOps[Self <: IGradientDef] (val x: Self) extends AnyVal {
    
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
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setFunctionNameNull: Self = this.set("functionName", null)
    
    @scala.inline
    def setGradientFunc(value: String): Self = this.set("gradientFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientFunc: Self = this.set("gradientFunc", js.undefined)
    
    @scala.inline
    def setGradientFuncNull: Self = this.set("gradientFunc", null)
  }
}
