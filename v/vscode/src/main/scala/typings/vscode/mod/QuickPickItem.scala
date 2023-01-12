package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickPickItem extends StObject {
  
  /**
    * Always show this item.
    *
    * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
    */
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional buttons that will be rendered on this particular item. These buttons will trigger
    * an {@link QuickPickItemButtonEvent} when clicked. Buttons are only rendered when using a quickpick
    * created by the {@link window.createQuickPick createQuickPick()} API. Buttons are not rendered when using
    * the {@link window.showQuickPick showQuickPick()} API.
    *
    * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
    */
  var buttons: js.UndefOr[js.Array[QuickInputButton]] = js.undefined
  
  /**
    * A human-readable string which is rendered less prominent in the same line. Supports rendering of
    * {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
    *
    * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
    * {@link ThemeIcon theme icons} via the `$(<name>)`-syntax.
    *
    * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of QuickPickItem that will determine how this item is rendered in the quick pick. When not specified,
    * the default is {@link QuickPickItemKind.Default}.
    */
  var kind: js.UndefOr[QuickPickItemKind] = js.undefined
  
  /**
    * A human-readable string which is rendered prominent. Supports rendering of {@link ThemeIcon theme icons} via
    * the `$(<name>)`-syntax.
    */
  var label: String
  
  /**
    * Optional flag indicating if this item is picked initially. This is only honored when using
    * the {@link window.showQuickPick showQuickPick()} API. To do the same thing with
    * the {@link window.createQuickPick createQuickPick()} API, simply set the {@link QuickPick.selectedItems}
    * to the items you want picked initially.
    * (*Note:* This is only honored when the picker allows multiple selections.)
    *
    * @see {@link QuickPickOptions.canPickMany}
    *
    * Note: this property is ignored when {@link QuickPickItem.kind kind} is set to {@link QuickPickItemKind.Separator}
    */
  var picked: js.UndefOr[Boolean] = js.undefined
}
object QuickPickItem {
  
  inline def apply(label: String): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuickPickItem] (val x: Self) extends AnyVal {
    
    inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
    
    inline def setButtons(value: js.Array[QuickInputButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: QuickInputButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setKind(value: QuickPickItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPicked(value: Boolean): Self = StObject.set(x, "picked", value.asInstanceOf[js.Any])
    
    inline def setPickedUndefined: Self = StObject.set(x, "picked", js.undefined)
  }
}
