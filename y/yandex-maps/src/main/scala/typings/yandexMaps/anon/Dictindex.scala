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
  
  @scala.inline
  def apply(): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictindex]
  }
  
  @scala.inline
  implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveRouteAutoSelection(value: Boolean): Self = StObject.set(x, "activeRouteAutoSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveRouteAutoSelectionUndefined: Self = StObject.set(x, "activeRouteAutoSelection", js.undefined)
    
    @scala.inline
    def setBoundsAutoApply(value: Boolean): Self = StObject.set(x, "boundsAutoApply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsAutoApplyUndefined: Self = StObject.set(x, "boundsAutoApply", js.undefined)
    
    @scala.inline
    def setDragUpdateInterval(value: String | Double): Self = StObject.set(x, "dragUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUpdateIntervalUndefined: Self = StObject.set(x, "dragUpdateInterval", js.undefined)
    
    @scala.inline
    def setPreventDragUpdate(value: Boolean): Self = StObject.set(x, "preventDragUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDragUpdateUndefined: Self = StObject.set(x, "preventDragUpdate", js.undefined)
    
    @scala.inline
    def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
    
    @scala.inline
    def setZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "zoomMargin", js.Array(value :_*))
  }
}
