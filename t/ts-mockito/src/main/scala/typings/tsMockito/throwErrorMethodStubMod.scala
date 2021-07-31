package typings.tsMockito

import typings.std.Error
import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throwErrorMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ThrowErrorMethodStub", "ThrowErrorMethodStub")
  @js.native
  class ThrowErrorMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], error: Error) = this()
    
    var error: js.Any = js.native
    
    /* CompleteClass */
    override def execute(args: js.Array[js.Any]): Unit = js.native
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    
    /* CompleteClass */
    override def isApplicable(args: js.Array[js.Any]): Boolean = js.native
    
    var matchers: js.Any = js.native
    
    var validator: js.Any = js.native
  }
}
