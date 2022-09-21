package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callThroughMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/CallThroughMethodStub", "CallThroughMethodStub")
  @js.native
  open class CallThroughMethodStub protected ()
    extends StObject
       with MethodStub {
    def this(instance: Any, method: js.Function) = this()
    
    /* CompleteClass */
    override def execute(args: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def getGroupIndex(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* private */ var instance: Any = js.native
    
    /* CompleteClass */
    override def isApplicable(args: js.Array[Any]): Boolean = js.native
    
    /* private */ var method: Any = js.native
    
    /* private */ var result: Any = js.native
  }
}
