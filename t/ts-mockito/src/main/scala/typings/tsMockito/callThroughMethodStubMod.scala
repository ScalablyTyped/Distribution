package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callThroughMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/CallThroughMethodStub", "CallThroughMethodStub")
  @js.native
  class CallThroughMethodStub protected ()
    extends StObject
       with MethodStub {
    def this(instance: js.Any, method: js.Function) = this()
    
    /* CompleteClass */
    override def execute(args: js.Array[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def getGroupIndex(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    
    var instance: js.Any = js.native
    
    /* CompleteClass */
    override def isApplicable(args: js.Array[js.Any]): Boolean = js.native
    
    var method: js.Any = js.native
    
    var result: js.Any = js.native
  }
}
