package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlight extends js.Object {
  /**
    * The highlight kind, default is [text](#DocumentHighlightKind.Text).
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
  /**
    * The range this highlight applies to.
    */
  var range: Range
}

@JSImport("vscode-languageserver-types", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: Range): DocumentHighlight = js.native
  def create(range: Range, kind: DocumentHighlightKind): DocumentHighlight = js.native
}

