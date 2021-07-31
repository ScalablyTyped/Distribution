package typings.webpackBlocksCore

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Test extends StObject {
    
    var test: RegExp | js.Array[RegExp]
  }
  object Test {
    
    @scala.inline
    def apply(test: RegExp | js.Array[RegExp]): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTest(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestVarargs(value: RegExp*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
