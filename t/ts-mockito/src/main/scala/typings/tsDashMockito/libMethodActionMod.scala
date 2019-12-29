package typings.tsDashMockito

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodAction", JSImport.Namespace)
@js.native
object libMethodActionMod extends js.Object {
  @js.native
  class MethodAction protected () extends js.Object {
    def this(methodName: String, args: js.Array[_]) = this()
    var args: js.Array[_] = js.native
    var callIndex: js.Any = js.native
    var methodName: String = js.native
    def getCallIndex(): Double = js.native
    def hasBeenCalledBefore(action: MethodAction): Boolean = js.native
    def isApplicable(methodName: String, matchers: js.Array[Matcher]): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MethodAction extends js.Object {
    var globalCallIndex: js.Any = js.native
  }
  
}

