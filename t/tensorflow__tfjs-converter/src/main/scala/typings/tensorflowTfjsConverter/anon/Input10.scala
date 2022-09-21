package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input10 extends StObject {
  
  @JSName("input1:0")
  var input1Colon0: NameTensorShape
  
  @JSName("input2:0")
  var input2Colon0: NameTensorShape
  
  @JSName("input3:0")
  var input3Colon0: NameTensorShape
}
object Input10 {
  
  inline def apply(input1Colon0: NameTensorShape, input2Colon0: NameTensorShape, input3Colon0: NameTensorShape): Input10 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input1:0")(input1Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("input2:0")(input2Colon0.asInstanceOf[js.Any])
    __obj.updateDynamic("input3:0")(input3Colon0.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input10]
  }
  
  extension [Self <: Input10](x: Self) {
    
    inline def setInput1Colon0(value: NameTensorShape): Self = StObject.set(x, "input1:0", value.asInstanceOf[js.Any])
    
    inline def setInput2Colon0(value: NameTensorShape): Self = StObject.set(x, "input2:0", value.asInstanceOf[js.Any])
    
    inline def setInput3Colon0(value: NameTensorShape): Self = StObject.set(x, "input3:0", value.asInstanceOf[js.Any])
  }
}
