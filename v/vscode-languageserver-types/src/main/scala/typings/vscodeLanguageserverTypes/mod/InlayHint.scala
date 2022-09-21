package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHint extends StObject {
  
  /**
    * A data entry field that is preserved on an inlay hint between
    * a `textDocument/inlayHint` and a `inlayHint/resolve` request.
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * The kind of this hint. Can be omitted in which case the client
    * should fall back to a reasonable default.
    */
  var kind: js.UndefOr[InlayHintKind] = js.undefined
  
  /**
    * The label of this hint. A human readable string or an array of
    * InlayHintLabelPart label parts.
    *
    * *Note* that neither the string nor the label part can be empty.
    */
  var label: String | js.Array[InlayHintLabelPart]
  
  /**
    * Render padding before the hint.
    *
    * Note: Padding should use the editor's background color, not the
    * background color of the hint itself. That means padding can be used
    * to visually align/separate an inlay hint.
    */
  var paddingLeft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render padding after the hint.
    *
    * Note: Padding should use the editor's background color, not the
    * background color of the hint itself. That means padding can be used
    * to visually align/separate an inlay hint.
    */
  var paddingRight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position of this hint.
    */
  var position: Position
  
  /**
    * Optional text edits that are performed when accepting this inlay hint.
    *
    * *Note* that edits are expected to change the document so that the inlay
    * hint (or its nearest variant) is now part of the document and the inlay
    * hint itself is now obsolete.
    */
  var textEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * The tooltip text when you hover over this item.
    */
  var tooltip: js.UndefOr[String | MarkupContent] = js.undefined
}
object InlayHint {
  
  inline def apply(label: String | js.Array[InlayHintLabelPart], position: Position): InlayHint = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHint]
  }
  
  @JSImport("vscode-languageserver-types", "InlayHint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(position: Position, label: String): InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[InlayHint]
  inline def create(position: Position, label: String, kind: InlayHintKind): InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[InlayHint]
  inline def create(position: Position, label: js.Array[InlayHintLabelPart]): InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[InlayHint]
  inline def create(position: Position, label: js.Array[InlayHintLabelPart], kind: InlayHintKind): InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[InlayHint]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean]
  
  extension [Self <: InlayHint](x: Self) {
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: InlayHintKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String | js.Array[InlayHintLabelPart]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelVarargs(value: InlayHintLabelPart*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setPaddingLeft(value: Boolean): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Boolean): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "textEdits", value.asInstanceOf[js.Any])
    
    inline def setTextEditsUndefined: Self = StObject.set(x, "textEdits", js.undefined)
    
    inline def setTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "textEdits", js.Array(value*))
    
    inline def setTooltip(value: String | MarkupContent): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
