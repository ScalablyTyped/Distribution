package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignatureDef extends js.Object {
  
  /** SignatureDef inputs */
  var inputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.native
  
  /** SignatureDef methodName */
  var methodName: js.UndefOr[String | Null] = js.native
  
  /** SignatureDef outputs */
  var outputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.native
}
object ISignatureDef {
  
  @scala.inline
  def apply(): ISignatureDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISignatureDef]
  }
  
  @scala.inline
  implicit class ISignatureDefOps[Self <: ISignatureDef] (val x: Self) extends AnyVal {
    
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
    def setInputs(value: StringDictionary[ITensorInfo]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setInputsNull: Self = this.set("inputs", null)
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    
    @scala.inline
    def setMethodNameNull: Self = this.set("methodName", null)
    
    @scala.inline
    def setOutputs(value: StringDictionary[ITensorInfo]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setOutputsNull: Self = this.set("outputs", null)
  }
}
