package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlayHintLabelPart")
@js.native
open class InlayHintLabelPart protected () extends StObject {
  /**
  		 * Creates a new inlay hint label part.
  		 *
  		 * @param value The value of the part.
  		 */
  def this(value: String) = this()
  
  /**
  		 * An optional command for this label part.
  		 *
  		 * The editor renders parts with commands as clickable links. The command is added to the context menu
  		 * when a label part defines {@link InlayHintLabelPart.location location} and {@link InlayHintLabelPart.command command} .
  		 *
  		 * *Note* that this property can be set late during
  		 * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
  		 */
  var command: js.UndefOr[Command] = js.native
  
  /**
  		 * An optional {@link Location source code location} that represents this label
  		 * part.
  		 *
  		 * The editor will use this location for the hover and for code navigation features: This
  		 * part will become a clickable link that resolves to the definition of the symbol at the
  		 * given location (not necessarily the location itself), it shows the hover that shows at
  		 * the given location, and it shows a context menu with further code navigation commands.
  		 *
  		 * *Note* that this property can be set late during
  		 * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
  		 */
  var location: js.UndefOr[Location] = js.native
  
  /**
  		 * The tooltip text when you hover over this label part.
  		 *
  		 * *Note* that this property can be set late during
  		 * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
  		 */
  var tooltip: js.UndefOr[String | MarkdownString] = js.native
  
  /**
  		 * The value of this label part.
  		 */
  var value: String = js.native
}
