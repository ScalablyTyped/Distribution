package typings.tsMockito

import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object returnValueMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/ReturnValueMethodStub", "ReturnValueMethodStub")
  @js.native
  class ReturnValueMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], returns: js.Any) = this()
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    var matchers: js.Any = js.native
    
    var returns: js.Any = js.native
    
    var validator: js.Any = js.native
  }
}
