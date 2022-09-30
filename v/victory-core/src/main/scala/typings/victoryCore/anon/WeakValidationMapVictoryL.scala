package typings.victoryCore.anon

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.victoryCore.callbacksMod.CallbackArgs
import typings.victoryCore.callbacksMod.NumberOrCallback
import typings.victoryCore.callbacksMod.StringOrCallback
import typings.victoryCore.callbacksMod.StringOrNumberOrCallback
import typings.victoryCore.propTypesMod.ValueOrAccessor
import typings.victoryCore.victoryLabelMod.LabelOrientationType
import typings.victoryCore.victoryLabelMod.OriginType
import typings.victoryCore.victoryLabelMod.TextAnchorType
import typings.victoryCore.victoryThemeTypesMod.PaddingProps
import typings.victoryCore.victoryThemeTypesMod.VerticalAnchorType
import typings.victoryCore.victoryThemeTypesMod.VictoryLabelStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<victory-core.victory-core/lib/victory-label/victory-label.VictoryLabelProps> */
trait WeakValidationMapVictoryL extends StObject {
  
  var angle: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var ariaLabel: js.UndefOr[Validator[js.UndefOr[Null | StringOrCallback]]] = js.undefined
  
  var backgroundComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var backgroundPadding: js.UndefOr[Validator[js.UndefOr[js.Array[PaddingProps] | Null | PaddingProps]]] = js.undefined
  
  var backgroundStyle: js.UndefOr[
    Validator[js.UndefOr[js.Array[VictoryLabelStyleObject] | Null | VictoryLabelStyleObject]]
  ] = js.undefined
  
  var capHeight: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var data: js.UndefOr[Validator[js.UndefOr[js.Array[Any] | Null]]] = js.undefined
  
  var datum: js.UndefOr[Validator[js.UndefOr[Null | js.Object]]] = js.undefined
  
  var desc: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var direction: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var disableInlineStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var dx: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var dy: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var events: js.UndefOr[Validator[js.UndefOr[DOMAttributes[Any] | Null]]] = js.undefined
  
  var groupComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | StringOrNumberOrCallback]]] = js.undefined
  
  var `inline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var labelPlacement: js.UndefOr[Validator[js.UndefOr[LabelOrientationType | Null]]] = js.undefined
  
  var lineHeight: js.UndefOr[
    Validator[js.UndefOr[(js.Array[Double | String]) | Null | StringOrNumberOrCallback]]
  ] = js.undefined
  
  var origin: js.UndefOr[Validator[js.UndefOr[Null | OriginType]]] = js.undefined
  
  var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var renderInPortal: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var style: js.UndefOr[
    Validator[js.UndefOr[js.Array[VictoryLabelStyleObject] | Null | VictoryLabelStyleObject]]
  ] = js.undefined
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Null | NumberOrCallback]]] = js.undefined
  
  var text: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null | StringOrNumberOrCallback]]] = js.undefined
  
  var textAnchor: js.UndefOr[Validator[js.UndefOr[Null | (ValueOrAccessor[TextAnchorType, CallbackArgs])]]] = js.undefined
  
  var textComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var transform: js.UndefOr[
    Validator[js.UndefOr[Null | (ValueOrAccessor[js.Object | String, CallbackArgs])]]
  ] = js.undefined
  
  var tspanComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var verticalAnchor: js.UndefOr[
    Validator[js.UndefOr[Null | (ValueOrAccessor[VerticalAnchorType, CallbackArgs])]]
  ] = js.undefined
  
  var x: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var y: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}
object WeakValidationMapVictoryL {
  
  inline def apply(): WeakValidationMapVictoryL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapVictoryL]
  }
  
  extension [Self <: WeakValidationMapVictoryL](x: Self) {
    
    inline def setAngle(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAriaLabel(value: Validator[js.UndefOr[Null | StringOrCallback]]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setBackgroundComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
    
    inline def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
    
    inline def setBackgroundPadding(value: Validator[js.UndefOr[js.Array[PaddingProps] | Null | PaddingProps]]): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    inline def setBackgroundStyle(value: Validator[js.UndefOr[js.Array[VictoryLabelStyleObject] | Null | VictoryLabelStyleObject]]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    inline def setCapHeight(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
    
    inline def setChildren(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: Validator[js.UndefOr[js.Array[Any] | Null]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDatum(value: Validator[js.UndefOr[Null | js.Object]]): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setDesc(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDirection(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisableInlineStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
    
    inline def setDx(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setEvents(value: Validator[js.UndefOr[DOMAttributes[Any] | Null]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGroupComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setId(value: Validator[js.UndefOr[Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInline(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setLabelPlacement(value: Validator[js.UndefOr[LabelOrientationType | Null]]): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    inline def setLineHeight(value: Validator[js.UndefOr[(js.Array[Double | String]) | Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setOrigin(value: Validator[js.UndefOr[Null | OriginType]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRenderInPortal(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "renderInPortal", value.asInstanceOf[js.Any])
    
    inline def setRenderInPortalUndefined: Self = StObject.set(x, "renderInPortal", js.undefined)
    
    inline def setStyle(value: Validator[js.UndefOr[js.Array[VictoryLabelStyleObject] | Null | VictoryLabelStyleObject]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: Validator[js.UndefOr[Null | NumberOrCallback]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setText(value: Validator[js.UndefOr[js.Array[String] | Null | StringOrNumberOrCallback]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAnchor(value: Validator[js.UndefOr[Null | (ValueOrAccessor[TextAnchorType, CallbackArgs])]]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setTextComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
    
    inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransform(value: Validator[js.UndefOr[Null | (ValueOrAccessor[js.Object | String, CallbackArgs])]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTspanComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "tspanComponent", value.asInstanceOf[js.Any])
    
    inline def setTspanComponentUndefined: Self = StObject.set(x, "tspanComponent", js.undefined)
    
    inline def setVerticalAnchor(value: Validator[js.UndefOr[Null | (ValueOrAccessor[VerticalAnchorType, CallbackArgs])]]): Self = StObject.set(x, "verticalAnchor", value.asInstanceOf[js.Any])
    
    inline def setVerticalAnchorUndefined: Self = StObject.set(x, "verticalAnchor", js.undefined)
    
    inline def setX(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
