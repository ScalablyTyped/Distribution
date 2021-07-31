package typings.tsMockito

import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolvePromiseMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ResolvePromiseMethodStub", "ResolvePromiseMethodStub")
  @js.native
  class ResolvePromiseMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], value: js.Any) = this()
    
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
    
    var value: js.Any = js.native
  }
}
