package typings.terminalKit.anon

import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shrink extends js.Object {
  var shrink: js.UndefOr[Height] = js.native
  @JSName("terminal")
  var terminal_Original: Terminal = js.native
  def terminal(): Terminal = js.native
  def terminal(args: js.Any*): Terminal = js.native
  def terminal(str: String): Terminal = js.native
}

