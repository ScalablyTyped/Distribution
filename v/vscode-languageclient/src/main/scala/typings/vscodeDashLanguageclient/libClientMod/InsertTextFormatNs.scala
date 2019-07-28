package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageclient.vscodeDashLanguageclientNumbers.`1`
import typings.vscodeDashLanguageclient.vscodeDashLanguageclientNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "InsertTextFormat")
@js.native
object InsertTextFormatNs extends js.Object {
  /**
    * The primary text to be inserted is treated as a plain string.
    */
  val PlainText: `1` = js.native
  /**
    * The primary text to be inserted is treated as a snippet.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    *
    * See also: https://github.com/Microsoft/vscode/blob/master/src/vs/editor/contrib/snippet/common/snippet.md
    */
  val Snippet: `2` = js.native
}

