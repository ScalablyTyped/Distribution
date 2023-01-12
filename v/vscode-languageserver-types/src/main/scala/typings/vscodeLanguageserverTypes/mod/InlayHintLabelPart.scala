package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintLabelPart extends StObject {
  
  /**
    * An optional command for this label part.
    *
    * Depending on the client capability `inlayHint.resolveSupport` clients
    * might resolve this property late using the resolve request.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * An optional source code location that represents this
    * label part.
    *
    * The editor will use this location for the hover and for code navigation
    * features: This part will become a clickable link that resolves to the
    * definition of the symbol at the given location (not necessarily the
    * location itself), it shows the hover that shows at the given location,
    * and it shows a context menu with further code navigation commands.
    *
    * Depending on the client capability `inlayHint.resolveSupport` clients
    * might resolve this property late using the resolve request.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The tooltip text when you hover over this label part. Depending on
    * the client capability `inlayHint.resolveSupport` clients might resolve
    * this property late using the resolve request.
    */
  var tooltip: js.UndefOr[String | MarkupContent] = js.undefined
  
  /**
    * The value of this label part.
    */
  var value: String
}
object InlayHintLabelPart {
  
  inline def apply(value: String): InlayHintLabelPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintLabelPart]
  }
  
  @JSImport("vscode-languageserver-types", "InlayHintLabelPart")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(value: String): InlayHintLabelPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[InlayHintLabelPart]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHintLabelPart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHintLabelPart */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHintLabelPart] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTooltip(value: String | MarkupContent): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
