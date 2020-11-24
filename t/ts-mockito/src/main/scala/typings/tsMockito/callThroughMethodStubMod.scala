package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/stub/CallThroughMethodStub", JSImport.Namespace)
@js.native
object callThroughMethodStubMod extends js.Object {
  
  @js.native
  class CallThroughMethodStub protected () extends MethodStub {
    def this(instance: js.Any, method: js.Function) = this()
    
    var instance: js.Any = js.native
    
    var method: js.Any = js.native
    
    var result: js.Any = js.native
  }
}
