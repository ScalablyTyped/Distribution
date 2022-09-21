package typings.webpackBlocksCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Test extends StObject {
    
    var test: js.RegExp | js.Array[js.RegExp]
  }
  object Test {
    
    inline def apply(test: js.RegExp | js.Array[js.RegExp]): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setTest(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: js.RegExp*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
}
