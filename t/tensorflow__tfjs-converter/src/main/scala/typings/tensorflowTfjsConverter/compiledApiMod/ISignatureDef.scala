package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignatureDef extends StObject {
  
  /** SignatureDef inputs */
  var inputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.undefined
  
  /** SignatureDef methodName */
  var methodName: js.UndefOr[String | Null] = js.undefined
  
  /** SignatureDef outputs */
  var outputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.undefined
}
object ISignatureDef {
  
  @scala.inline
  def apply(): ISignatureDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISignatureDef]
  }
  
  @scala.inline
  implicit class ISignatureDefMutableBuilder[Self <: ISignatureDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: StringDictionary[ITensorInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameNull: Self = StObject.set(x, "methodName", null)
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setOutputs(value: StringDictionary[ITensorInfo]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsNull: Self = StObject.set(x, "outputs", null)
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
  }
}
