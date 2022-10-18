package typings.undici

import typings.undici.typesErrorsMod.UndiciError
import typings.undici.undiciStrings.UND_MOCK_ERR_MOCK_NOT_MATCHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMockErrorsMod {
  
  @JSImport("undici/types/mock-errors", "MockNotMatchedError")
  @js.native
  open class MockNotMatchedError () extends UndiciError {
    def this(message: String) = this()
    
    var code: UND_MOCK_ERR_MOCK_NOT_MATCHED = js.native
    
    @JSName("name")
    var name_MockNotMatchedError: typings.undici.undiciStrings.MockNotMatchedError = js.native
  }
}
