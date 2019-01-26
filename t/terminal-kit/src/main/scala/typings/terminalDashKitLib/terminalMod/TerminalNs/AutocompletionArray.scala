package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompletionArray[T]
  extends stdLib.Array[T] {
  var postfix: js.UndefOr[java.lang.String] = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
}

