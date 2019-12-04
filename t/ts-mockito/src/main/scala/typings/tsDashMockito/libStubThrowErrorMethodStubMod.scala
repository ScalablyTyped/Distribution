package typings.tsDashMockito

import typings.std.Error
import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsDashMockito.libStubAbstractMethodStubMod.AbstractMethodStub
import typings.tsDashMockito.libStubMethodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/ThrowErrorMethodStub", JSImport.Namespace)
@js.native
object libStubThrowErrorMethodStubMod extends js.Object {
  @js.native
  class ThrowErrorMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], error: Error) = this()
    var error: js.Any = js.native
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

