package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distModelTypesMod.SavedModelTensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var inputs: StringDictionary[SavedModelTensorInfo]
  
  var outputs: StringDictionary[SavedModelTensorInfo]
}
object Inputs {
  
  inline def apply(inputs: StringDictionary[SavedModelTensorInfo], outputs: StringDictionary[SavedModelTensorInfo]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: StringDictionary[SavedModelTensorInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[SavedModelTensorInfo]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
