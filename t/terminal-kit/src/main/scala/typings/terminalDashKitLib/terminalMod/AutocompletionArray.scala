package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/Terminal", "AutocompletionArray")
@js.native
class AutocompletionArray[T] ()
  extends stdLib.Array[T] {
  var postfix: js.UndefOr[java.lang.String] = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
}

