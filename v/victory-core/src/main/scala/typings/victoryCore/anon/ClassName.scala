package typings.victoryCore.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Validator
import typings.victoryCore.libTypesCallbacksMod.NumberOrCallback
import typings.victoryCore.libTypesCallbacksMod.StringOrCallback
import typings.victoryCore.libVictoryLabelVictoryLabelMod.OriginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var active: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var ariaLabel: js.UndefOr[Validator[js.UndefOr[StringOrCallback | Null]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var clipPath: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var data: js.UndefOr[Validator[Any]] = js.undefined
  
  var desc: js.UndefOr[Validator[js.UndefOr[String | js.Function | Null]]] = js.undefined
  
  var disableInlineStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var events: js.UndefOr[Validator[js.UndefOr[js.Object | Null]]] = js.undefined
  
  var height: Requireable[Double]
  
  var id: js.UndefOr[Validator[js.UndefOr[String | Double | js.Function | Null]]] = js.undefined
  
  var index: js.UndefOr[Validator[js.UndefOr[String | Double | Null]]] = js.undefined
  
  var origin: js.UndefOr[Validator[js.UndefOr[OriginType | Null]]] = js.undefined
  
  var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var rectComponent: Requireable[ReactElementLike]
  
  var role: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var scale: js.UndefOr[Validator[Any]] = js.undefined
  
  var shapeRendering: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var style: js.UndefOr[Validator[Any]] = js.undefined
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[NumberOrCallback | Null]]] = js.undefined
  
  var transform: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var width: Requireable[Double]
  
  var x: Requireable[Double]
  
  var y: Requireable[Double]
}
object ClassName {
  
  inline def apply(
    height: Requireable[Double],
    rectComponent: Requireable[ReactElementLike],
    width: Requireable[Double],
    x: Requireable[Double],
    y: Requireable[Double]
  ): ClassName = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rectComponent = rectComponent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setActive(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAriaLabel(value: Validator[js.UndefOr[StringOrCallback | Null]]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClipPath(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setData(value: Validator[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDesc(value: Validator[js.UndefOr[String | js.Function | Null]]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDisableInlineStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
    
    inline def setEvents(value: Validator[js.UndefOr[js.Object | Null]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[js.UndefOr[String | Double | js.Function | Null]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Validator[js.UndefOr[String | Double | Null]]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOrigin(value: Validator[js.UndefOr[OriginType | Null]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRectComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setScale(value: Validator[Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShapeRendering(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    inline def setStyle(value: Validator[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: Validator[js.UndefOr[NumberOrCallback | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTransform(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Requireable[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
