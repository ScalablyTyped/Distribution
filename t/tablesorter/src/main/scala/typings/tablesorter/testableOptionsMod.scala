package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testableOptionsMod {
  
  trait TestableOptions extends StObject {
    
    /**
      * A value indicating whether tests should be skipped.
      */
    var skipTest: js.UndefOr[Boolean] = js.undefined
  }
  object TestableOptions {
    
    @scala.inline
    def apply(): TestableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestableOptions]
    }
    
    @scala.inline
    implicit class TestableOptionsMutableBuilder[Self <: TestableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipTest(value: Boolean): Self = StObject.set(x, "skipTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipTestUndefined: Self = StObject.set(x, "skipTest", js.undefined)
    }
  }
}
