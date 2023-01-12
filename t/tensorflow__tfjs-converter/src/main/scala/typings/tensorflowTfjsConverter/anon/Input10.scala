package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input10 extends StObject {
  
  @JSName("input1:0")
  var input1Colon0: TensorShape
  
  @JSName("input2:0")
  var input2Colon0: TensorShape
  
  @JSName("input3:0")
  var input3Colon0: TensorShape
}
object Input10 {
  
  inline def apply(input1Colon0: TensorShape, input2Colon0: TensorShape, input3Colon0: TensorShape): Input10 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input1:0")(input1Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("input2:0")(input2Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("input3:0")(input3Colon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input10]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input10] (val x: Self) extends AnyVal {
    
    inline def setInput1Colon0(value: TensorShape): Self = StObject.set(x, "input1:0", value.asInstanceOf[js.Any])
    
    inline def setInput2Colon0(value: TensorShape): Self = StObject.set(x, "input2:0", value.asInstanceOf[js.Any])
    
    inline def setInput3Colon0(value: TensorShape): Self = StObject.set(x, "input3:0", value.asInstanceOf[js.Any])
  }
}
