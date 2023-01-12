package typings.victoryCore.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-label`: Requireable[String]
  
  var children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var circleComponent: Requireable[ReactElementLike]
  
  var className: Requireable[String]
  
  var clipHeight: Requireable[js.UndefOr[Double]]
  
  var clipId: Requireable[String | Double]
  
  var clipPadding: Requireable[InferProps[Bottom]]
  
  var clipPathComponent: Requireable[ReactElementLike]
  
  var clipWidth: Requireable[js.UndefOr[Double]]
  
  var events: Requireable[js.Object]
  
  var groupComponent: Requireable[ReactElementLike]
  
  var origin: Requireable[InferProps[X]]
  
  var polar: Requireable[Boolean]
  
  var radius: Requireable[js.UndefOr[Double]]
  
  var style: Requireable[js.Object]
  
  var tabIndex: Requireable[Double]
  
  var transform: Requireable[String]
  
  var translateX: Requireable[Double]
  
  var translateY: Requireable[Double]
}
object Arialabel {
  
  inline def apply(
    `aria-label`: Requireable[String],
    children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    circleComponent: Requireable[ReactElementLike],
    className: Requireable[String],
    clipHeight: Requireable[js.UndefOr[Double]],
    clipId: Requireable[String | Double],
    clipPadding: Requireable[InferProps[Bottom]],
    clipPathComponent: Requireable[ReactElementLike],
    clipWidth: Requireable[js.UndefOr[Double]],
    events: Requireable[js.Object],
    groupComponent: Requireable[ReactElementLike],
    origin: Requireable[InferProps[X]],
    polar: Requireable[Boolean],
    radius: Requireable[js.UndefOr[Double]],
    style: Requireable[js.Object],
    tabIndex: Requireable[Double],
    transform: Requireable[String],
    translateX: Requireable[Double],
    translateY: Requireable[Double]
  ): Arialabel = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], circleComponent = circleComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clipHeight = clipHeight.asInstanceOf[js.Any], clipId = clipId.asInstanceOf[js.Any], clipPadding = clipPadding.asInstanceOf[js.Any], clipPathComponent = clipPathComponent.asInstanceOf[js.Any], clipWidth = clipWidth.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: Requireable[String]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setCircleComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "circleComponent", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClipHeight(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
    
    inline def setClipId(value: Requireable[String | Double]): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
    
    inline def setClipPadding(value: Requireable[InferProps[Bottom]]): Self = StObject.set(x, "clipPadding", value.asInstanceOf[js.Any])
    
    inline def setClipPathComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "clipPathComponent", value.asInstanceOf[js.Any])
    
    inline def setClipWidth(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Requireable[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Requireable[InferProps[X]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPolar(value: Requireable[Boolean]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Requireable[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Requireable[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: Requireable[Double]): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: Requireable[Double]): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
