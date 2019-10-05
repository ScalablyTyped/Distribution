package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlightKind
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentHighlight")
@js.native
object DocumentHighlight extends js.Object {
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  def create(range: Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight = js.native
  def create(range: Range, kind: DocumentHighlightKind): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight = js.native
}

