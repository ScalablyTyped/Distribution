package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlayHint")
@js.native
open class InlayHint protected () extends StObject {
  /**
    * Creates a new inlay hint.
    *
    * @param position The position of the hint.
    * @param label The label of the hint.
    * @param kind The {@link InlayHintKind kind} of the hint.
    */
  def this(position: Position, label: String) = this()
  def this(position: Position, label: js.Array[InlayHintLabelPart]) = this()
  def this(position: Position, label: String, kind: InlayHintKind) = this()
  def this(position: Position, label: js.Array[InlayHintLabelPart], kind: InlayHintKind) = this()
  
  /**
    * The kind of this hint. The inlay hint kind defines the appearance of this inlay hint.
    */
  var kind: js.UndefOr[InlayHintKind] = js.native
  
  /**
    * The label of this hint. A human readable string or an array of {@link InlayHintLabelPart label parts}.
    *
    * *Note* that neither the string nor the label part can be empty.
    */
  var label: String | js.Array[InlayHintLabelPart] = js.native
  
  /**
    * Render padding before the hint. Padding will use the editor's background color,
    * not the background color of the hint itself. That means padding can be used to visually
    * align/separate an inlay hint.
    */
  var paddingLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * Render padding after the hint. Padding will use the editor's background color,
    * not the background color of the hint itself. That means padding can be used to visually
    * align/separate an inlay hint.
    */
  var paddingRight: js.UndefOr[Boolean] = js.native
  
  /**
    * The position of this hint.
    */
  var position: Position = js.native
  
  /**
    * Optional {@link TextEdit text edits} that are performed when accepting this inlay hint. The default
    * gesture for accepting an inlay hint is the double click.
    *
    * *Note* that edits are expected to change the document so that the inlay hint (or its nearest variant) is
    * now part of the document and the inlay hint itself is now obsolete.
    *
    * *Note* that this property can be set late during
    * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
    */
  var textEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  /**
    * The tooltip text when you hover over this item.
    *
    * *Note* that this property can be set late during
    * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
    */
  var tooltip: js.UndefOr[String | MarkdownString] = js.native
}
