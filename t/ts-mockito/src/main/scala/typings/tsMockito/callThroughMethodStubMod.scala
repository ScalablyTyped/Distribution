package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/stub/CallThroughMethodStub", JSImport.Namespace)
@js.native
object callThroughMethodStubMod extends js.Object {
  @js.native
  class CallThroughMethodStub protected () extends MethodStub {
    def this(instance: js.Any, method: js.Function) = this()
    var instance: js.Any = js.native
    var method: js.Any = js.native
    var result: js.Any = js.native
    /* CompleteClass */
    override def execute(args: js.Array[_]): Unit = js.native
    /* CompleteClass */
    override def getGroupIndex(): Double = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    /* CompleteClass */
    override def isApplicable(args: js.Array[_]): Boolean = js.native
  }
  
}

