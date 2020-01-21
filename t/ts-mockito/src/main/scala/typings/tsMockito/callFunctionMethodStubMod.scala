package typings.tsMockito

import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/CallFunctionMethodStub", JSImport.Namespace)
@js.native
object callFunctionMethodStubMod extends js.Object {
  @js.native
  class CallFunctionMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], func: js.Any) = this()
    var func: js.Any = js.native
    var functionResult: js.Any = js.native
    var matchers: js.Any = js.native
    var validator: js.Any = js.native
    /* CompleteClass */
    override def execute(args: js.Array[_]): Unit = js.native
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    /* CompleteClass */
    override def isApplicable(args: js.Array[_]): Boolean = js.native
  }
  
}

