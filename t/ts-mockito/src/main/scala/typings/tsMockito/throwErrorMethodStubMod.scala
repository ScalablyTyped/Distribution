package typings.tsMockito

import typings.std.Error
import typings.tsMockito.abstractMethodStubMod.AbstractMethodStub
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/ThrowErrorMethodStub", JSImport.Namespace)
@js.native
object throwErrorMethodStubMod extends js.Object {
  @js.native
  class ThrowErrorMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], error: Error) = this()
    var error: js.Any = js.native
    var matchers: js.Any = js.native
    var validator: js.Any = js.native
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
  }
  
}

