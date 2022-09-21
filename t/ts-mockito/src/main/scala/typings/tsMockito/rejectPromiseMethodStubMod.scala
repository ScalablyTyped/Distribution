package typings.tsMockito

import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rejectPromiseMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/RejectPromiseMethodStub", "RejectPromiseMethodStub")
  @js.native
  open class RejectPromiseMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], value: Any) = this()
    
    /* CompleteClass */
    override def execute(args: js.Array[Any]): Unit = js.native
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def isApplicable(args: js.Array[Any]): Boolean = js.native
    
    /* private */ var matchers: Any = js.native
    
    /* private */ var validator: Any = js.native
    
    /* private */ var value: Any = js.native
  }
}
