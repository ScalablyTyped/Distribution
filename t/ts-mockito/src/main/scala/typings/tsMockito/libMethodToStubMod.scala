package typings.tsMockito

import typings.tsMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsMockito.libMethodStubCollectionMod.MethodStubCollection
import typings.tsMockito.libMockMod.Mocker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMethodToStubMod {
  
  @JSImport("ts-mockito/lib/MethodToStub", "MethodToStub")
  @js.native
  open class MethodToStub protected () extends StObject {
    def this(
      methodStubCollection: MethodStubCollection,
      matchers: js.Array[Matcher],
      mocker: Mocker,
      name: String
    ) = this()
    
    var matchers: js.Array[Matcher] = js.native
    
    var methodStubCollection: MethodStubCollection = js.native
    
    var mocker: Mocker = js.native
    
    var name: String = js.native
  }
}
