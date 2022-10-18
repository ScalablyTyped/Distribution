package typings.tsMockito

import typings.tsMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsMockito.libStubAbstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.libStubMethodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStubThrowErrorMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ThrowErrorMethodStub", "ThrowErrorMethodStub")
  @js.native
  open class ThrowErrorMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], error: js.Error) = this()
    
    /* private */ var error: Any = js.native
    
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
  }
}
