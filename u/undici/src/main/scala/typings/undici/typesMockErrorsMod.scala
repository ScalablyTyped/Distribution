package typings.undici

import typings.undici.typesErrorsMod.default.UndiciError
import typings.undici.undiciStrings.UND_MOCK_ERR_MOCK_NOT_MATCHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockErrorsMod {
  
  object default {
    
    @JSImport("undici/types/mock-errors", "default.MockNotMatchedError")
    @js.native
    open class MockNotMatchedError ()
      extends typings.undici.typesMockErrorsMod.MockErrors.MockNotMatchedError {
      def this(message: String) = this()
    }
  }
  
  object MockErrors {
    
    @js.native
    trait MockNotMatchedError extends UndiciError {
      
      var code: UND_MOCK_ERR_MOCK_NOT_MATCHED = js.native
      
      @JSName("name")
      var name_MockNotMatchedError: typings.undici.undiciStrings.MockNotMatchedError = js.native
    }
  }
}
