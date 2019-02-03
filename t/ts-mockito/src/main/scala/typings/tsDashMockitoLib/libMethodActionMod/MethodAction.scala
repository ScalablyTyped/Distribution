package typings
package tsDashMockitoLib.libMethodActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodAction", "MethodAction")
@js.native
class MethodAction protected () extends js.Object {
  def this(methodName: java.lang.String, args: js.Array[_]) = this()
  var args: js.Array[_] = js.native
  var callIndex: js.Any = js.native
  var methodName: java.lang.String = js.native
  def getCallIndex(): scala.Double = js.native
  def hasBeenCalledBefore(action: MethodAction): scala.Boolean = js.native
  def isApplicable(
    methodName: java.lang.String,
    matchers: js.Array[tsDashMockitoLib.libMatcherTypeMatcherMod.Matcher]
  ): scala.Boolean = js.native
}

/* static members */
@JSImport("ts-mockito/lib/MethodAction", "MethodAction")
@js.native
object MethodAction extends js.Object {
  var globalCallIndex: js.Any = js.native
}

