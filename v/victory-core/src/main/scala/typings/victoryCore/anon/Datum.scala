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

trait Datum extends StObject {
  
  var active: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var ariaLabel: js.UndefOr[Validator[js.UndefOr[StringOrCallback | Null]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var clipPath: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var data: js.UndefOr[Validator[Any]] = js.undefined
  
  var datum: Requireable[Any]
  
  var desc: js.UndefOr[Validator[js.UndefOr[String | js.Function | Null]]] = js.undefined
  
  var disableInlineStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var events: js.UndefOr[Validator[js.UndefOr[js.Object | Null]]] = js.undefined
  
  var id: js.UndefOr[Validator[js.UndefOr[String | Double | js.Function | Null]]] = js.undefined
  
  var index: js.UndefOr[Validator[js.UndefOr[String | Double | Null]]] = js.undefined
  
  var lineComponent: Requireable[ReactElementLike]
  
  var origin: js.UndefOr[Validator[js.UndefOr[OriginType | Null]]] = js.undefined
  
  var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var role: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var scale: js.UndefOr[Validator[Any]] = js.undefined
  
  var shapeRendering: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var style: js.UndefOr[Validator[Any]] = js.undefined
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[NumberOrCallback | Null]]] = js.undefined
  
  var transform: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var x1: Requireable[Double]
  
  var x2: Requireable[Double]
  
  var y1: Requireable[Double]
  
  var y2: Requireable[Double]
}
object Datum {
  
  inline def apply(
    datum: Requireable[Any],
    lineComponent: Requireable[ReactElementLike],
    x1: Requireable[Double],
    x2: Requireable[Double],
    y1: Requireable[Double],
    y2: Requireable[Double]
  ): Datum = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], lineComponent = lineComponent.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
    
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
    
    inline def setDatum(value: Requireable[Any]): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: Validator[js.UndefOr[String | js.Function | Null]]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDisableInlineStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
    
    inline def setEvents(value: Validator[js.UndefOr[js.Object | Null]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setId(value: Validator[js.UndefOr[String | Double | js.Function | Null]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Validator[js.UndefOr[String | Double | Null]]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLineComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Validator[js.UndefOr[OriginType | Null]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
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
    
    inline def setX1(value: Requireable[Double]): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Requireable[Double]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Requireable[Double]): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Requireable[Double]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
