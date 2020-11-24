package typings.tsMockito

import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubCollectionMod.MethodStubCollection
import typings.tsMockito.mockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/MethodToStub", JSImport.Namespace)
@js.native
object methodToStubMod extends js.Object {
  
  @js.native
  class MethodToStub protected () extends js.Object {
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
