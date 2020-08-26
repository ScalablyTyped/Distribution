package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationLink extends js.Object {
  /**
    * Span of the origin of this link.
    *
    * Used as the underlined span for mouse definition hover. Defaults to the word range at
    * the definition position.
    */
  var originSelectionRange: js.UndefOr[Range] = js.native
  /**
    * The full target range of this link. If the target for example is a symbol then target range is the
    * range enclosing this symbol not including leading/trailing whitespace but everything else
    * like comments. This information is typically used to highlight the range in the editor.
    */
  var targetRange: Range = js.native
  /**
    * The range that should be selected and revealed when this link is being followed, e.g the name of a function.
    * Must be contained by the the `targetRange`. See also `DocumentSymbol#range`
    */
  var targetSelectionRange: Range = js.native
  /**
    * The target resource identifier of this link.
    */
  var targetUri: DocumentUri = js.native
}

@JSImport("vscode-languageserver-types", "LocationLink")
@js.native
object LocationLink extends js.Object {
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  def create(targetUri: DocumentUri, targetRange: Range, targetSelectionRange: Range): LocationLink = js.native
  def create(
    targetUri: DocumentUri,
    targetRange: Range,
    targetSelectionRange: Range,
    originSelectionRange: Range
  ): LocationLink = js.native
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
}

