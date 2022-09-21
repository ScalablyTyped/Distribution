package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageStatusItem extends StObject {
  
  /**
    * Accessibility information used when a screen reader interacts with this item
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.undefined
  
  /**
    * Controls whether the item is shown as "busy". Defaults to `false`.
    */
  var busy: Boolean
  
  /**
    * A {@linkcode Command command} for this item.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * Optional, human-readable details for this item.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Dispose and free associated resources.
    */
  def dispose(): Unit
  
  /**
    * The identifier of this item.
    */
  val id: String
  
  /**
    * The short name of this item, like 'Java Language Status', etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A {@link DocumentSelector selector} that defines for what editors
    * this item shows.
    */
  var selector: DocumentSelector
  
  /**
    * The severity of this item.
    *
    * Defaults to {@link LanguageStatusSeverity.Information information}. You can use this property to
    * signal to users that there is a problem that needs attention, like a missing executable or an
    * invalid configuration.
    */
  var severity: LanguageStatusSeverity
  
  /**
    * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
    *
    * `My text $(icon-name) contains icons like $(icon-name) this one.`
    *
    * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
    * `light-bulb`, `thumbsup`, `zap` etc.
    */
  var text: String
}
object LanguageStatusItem {
  
  inline def apply(
    busy: Boolean,
    dispose: () => Unit,
    id: String,
    selector: DocumentSelector,
    severity: LanguageStatusSeverity,
    text: String
  ): LanguageStatusItem = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStatusItem]
  }
  
  extension [Self <: LanguageStatusItem](x: Self) {
    
    inline def setAccessibilityInformation(value: AccessibilityInformation): Self = StObject.set(x, "accessibilityInformation", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityInformationUndefined: Self = StObject.set(x, "accessibilityInformation", js.undefined)
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelector(value: DocumentSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorVarargs(value: (DocumentFilter | String)*): Self = StObject.set(x, "selector", js.Array(value*))
    
    inline def setSeverity(value: LanguageStatusSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
