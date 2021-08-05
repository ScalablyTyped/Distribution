package typings.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictindex
  extends StObject
     with /* index */ StringDictionary[js.Any] {
  
  var activeRouteAutoSelection: js.UndefOr[Boolean] = js.undefined
  
  var boundsAutoApply: js.UndefOr[Boolean] = js.undefined
  
  var dragUpdateInterval: js.UndefOr[String | Double] = js.undefined
  
  var preventDragUpdate: js.UndefOr[Boolean] = js.undefined
  
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
}
object Dictindex {
  
  inline def apply(): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictindex]
  }
  
  extension [Self <: Dictindex](x: Self) {
    
    inline def setActiveRouteAutoSelection(value: Boolean): Self = StObject.set(x, "activeRouteAutoSelection", value.asInstanceOf[js.Any])
    
    inline def setActiveRouteAutoSelectionUndefined: Self = StObject.set(x, "activeRouteAutoSelection", js.undefined)
    
    inline def setBoundsAutoApply(value: Boolean): Self = StObject.set(x, "boundsAutoApply", value.asInstanceOf[js.Any])
    
    inline def setBoundsAutoApplyUndefined: Self = StObject.set(x, "boundsAutoApply", js.undefined)
    
    inline def setDragUpdateInterval(value: String | Double): Self = StObject.set(x, "dragUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setDragUpdateIntervalUndefined: Self = StObject.set(x, "dragUpdateInterval", js.undefined)
    
    inline def setPreventDragUpdate(value: Boolean): Self = StObject.set(x, "preventDragUpdate", value.asInstanceOf[js.Any])
    
    inline def setPreventDragUpdateUndefined: Self = StObject.set(x, "preventDragUpdate", js.undefined)
    
    inline def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
    
    inline def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
    
    inline def setZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    inline def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    inline def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "zoomMargin", js.Array(value :_*))
  }
}
