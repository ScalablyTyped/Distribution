package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAction extends StObject {
  
  /*
    * A function that is executed when users click the action item.
    */
  var action: js.UndefOr[js.Function1[/* context */ js.UndefOr[Any], Unit]] = js.undefined
  
  /*
    * Specifies whether the action item is active.
    * Use it as a flag to specify different action item appearances in different states.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Specifies the name of a component used to render the action item.
    */
  var component: js.UndefOr[String] = js.undefined
  
  /*
    * One or several CSS classes that you want to apply to the outer `<div>` element.
    * In the markup, an action item is rendered as an `<input>` wrapped in a `<div>`. The `css` property applies classes to the `<div>`.
    * To apply several classes, separate them with a space character: "myclass1 myclass2".
    */
  var css: js.UndefOr[String] = js.undefined
  
  /*
    * The action item's data object. Use it to pass required data to a custom template or component.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  var disableHide: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Set this property to `true` if you want the item's `title` to be always visible.
    * If you set it to `false`, the `title` hides when the screen space is limited, and the item displays only the icon.
    */
  var disableShrink: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Set this property to `true` if you want to disable keyboard navigation for the action item (sets the `tabIndex` attribute to -1).
    */
  var disableTabStop: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Specifies whether users can interact with the action item.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /*
    * The action item's icon name.
    */
  var iconName: js.UndefOr[String] = js.undefined
  
  /*
    * The action item's icon size in pixels.
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /*
    * A unique action item identifier.
    */
  var id: String
  
  /*
    * One or several CSS classes that you want to apply to the inner `<input>` element.
    * In the markup, an action item is rendered as an `<input>` wrapped in a `<div>`. The `innerCss` property applies classes to the `<input>`.
    * To apply several classes, separate them with a space character: "myclass1 myclass2".
    */
  var innerCss: js.UndefOr[String] = js.undefined
  
  var locTitle: js.UndefOr[Any] = js.undefined
  
  var locTitleName: js.UndefOr[String] = js.undefined
  
  var locTooltipName: js.UndefOr[String] = js.undefined
  
  /*
    * The action item's location in a matrix question's row.
    * 
    * The following values are available:
    * 
    * - `"start"` - The action item is located at the beginning of the row.
    * - `"end"` - The action is located at the end of the row.
    */
  var location: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Any] = js.undefined
  
  var needSeparator: js.UndefOr[Boolean] = js.undefined
  
  var needSpace: js.UndefOr[Boolean] = js.undefined
  
  var popupModel: js.UndefOr[Any] = js.undefined
  
  var pressed: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Specifies the visibility of the action item's title.
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Specifies the name of a template used to render the action item.
    */
  var template: js.UndefOr[String] = js.undefined
  
  /*
    * The action item's title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /*
    * The action item's tooltip.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  
  /*
    * Specifies the action item's visibility.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var visibleIndex: js.UndefOr[Double] = js.undefined
}
object IAction {
  
  inline def apply(id: String): IAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
  
  extension [Self <: IAction](x: Self) {
    
    inline def setAction(value: /* context */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisableHide(value: Boolean): Self = StObject.set(x, "disableHide", value.asInstanceOf[js.Any])
    
    inline def setDisableHideUndefined: Self = StObject.set(x, "disableHide", js.undefined)
    
    inline def setDisableShrink(value: Boolean): Self = StObject.set(x, "disableShrink", value.asInstanceOf[js.Any])
    
    inline def setDisableShrinkUndefined: Self = StObject.set(x, "disableShrink", js.undefined)
    
    inline def setDisableTabStop(value: Boolean): Self = StObject.set(x, "disableTabStop", value.asInstanceOf[js.Any])
    
    inline def setDisableTabStopUndefined: Self = StObject.set(x, "disableTabStop", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    inline def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInnerCss(value: String): Self = StObject.set(x, "innerCss", value.asInstanceOf[js.Any])
    
    inline def setInnerCssUndefined: Self = StObject.set(x, "innerCss", js.undefined)
    
    inline def setLocTitle(value: Any): Self = StObject.set(x, "locTitle", value.asInstanceOf[js.Any])
    
    inline def setLocTitleName(value: String): Self = StObject.set(x, "locTitleName", value.asInstanceOf[js.Any])
    
    inline def setLocTitleNameUndefined: Self = StObject.set(x, "locTitleName", js.undefined)
    
    inline def setLocTitleUndefined: Self = StObject.set(x, "locTitle", js.undefined)
    
    inline def setLocTooltipName(value: String): Self = StObject.set(x, "locTooltipName", value.asInstanceOf[js.Any])
    
    inline def setLocTooltipNameUndefined: Self = StObject.set(x, "locTooltipName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMode(value: Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNeedSeparator(value: Boolean): Self = StObject.set(x, "needSeparator", value.asInstanceOf[js.Any])
    
    inline def setNeedSeparatorUndefined: Self = StObject.set(x, "needSeparator", js.undefined)
    
    inline def setNeedSpace(value: Boolean): Self = StObject.set(x, "needSpace", value.asInstanceOf[js.Any])
    
    inline def setNeedSpaceUndefined: Self = StObject.set(x, "needSpace", js.undefined)
    
    inline def setPopupModel(value: Any): Self = StObject.set(x, "popupModel", value.asInstanceOf[js.Any])
    
    inline def setPopupModelUndefined: Self = StObject.set(x, "popupModel", js.undefined)
    
    inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
