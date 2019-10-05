package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFilter extends js.Object {
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.undefined
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.undefined
}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentFilter")
@js.native
object DocumentFilter extends js.Object {
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.DocumentFilter */ Boolean = js.native
}

