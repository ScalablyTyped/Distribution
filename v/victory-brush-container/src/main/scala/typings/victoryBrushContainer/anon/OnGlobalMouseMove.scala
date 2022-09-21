package typings.victoryBrushContainer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGlobalMouseMove extends StObject {
  
  def onGlobalMouseMove(evt: Any, targetProps: Any): js.UndefOr[js.Object]
  
  def onGlobalMouseUp(evt: Any, targetProps: Any): js.Object
  
  def onGlobalTouchCancel(evt: Any, targetProps: Any): js.Object
  
  def onGlobalTouchEnd(evt: Any, targetProps: Any): js.Object
  
  def onGlobalTouchMove(evt: Any, targetProps: Any): js.UndefOr[js.Object]
  
  def onMouseDown(evt: Any, targetProps: Any): js.Object
  
  def onTouchStart(evt: Any, targetProps: Any): js.Object
}
object OnGlobalMouseMove {
  
  inline def apply(
    onGlobalMouseMove: (Any, Any) => js.UndefOr[js.Object],
    onGlobalMouseUp: (Any, Any) => js.Object,
    onGlobalTouchCancel: (Any, Any) => js.Object,
    onGlobalTouchEnd: (Any, Any) => js.Object,
    onGlobalTouchMove: (Any, Any) => js.UndefOr[js.Object],
    onMouseDown: (Any, Any) => js.Object,
    onTouchStart: (Any, Any) => js.Object
  ): OnGlobalMouseMove = {
    val __obj = js.Dynamic.literal(onGlobalMouseMove = js.Any.fromFunction2(onGlobalMouseMove), onGlobalMouseUp = js.Any.fromFunction2(onGlobalMouseUp), onGlobalTouchCancel = js.Any.fromFunction2(onGlobalTouchCancel), onGlobalTouchEnd = js.Any.fromFunction2(onGlobalTouchEnd), onGlobalTouchMove = js.Any.fromFunction2(onGlobalTouchMove), onMouseDown = js.Any.fromFunction2(onMouseDown), onTouchStart = js.Any.fromFunction2(onTouchStart))
    __obj.asInstanceOf[OnGlobalMouseMove]
  }
  
  extension [Self <: OnGlobalMouseMove](x: Self) {
    
    inline def setOnGlobalMouseMove(value: (Any, Any) => js.UndefOr[js.Object]): Self = StObject.set(x, "onGlobalMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnGlobalMouseUp(value: (Any, Any) => js.Object): Self = StObject.set(x, "onGlobalMouseUp", js.Any.fromFunction2(value))
    
    inline def setOnGlobalTouchCancel(value: (Any, Any) => js.Object): Self = StObject.set(x, "onGlobalTouchCancel", js.Any.fromFunction2(value))
    
    inline def setOnGlobalTouchEnd(value: (Any, Any) => js.Object): Self = StObject.set(x, "onGlobalTouchEnd", js.Any.fromFunction2(value))
    
    inline def setOnGlobalTouchMove(value: (Any, Any) => js.UndefOr[js.Object]): Self = StObject.set(x, "onGlobalTouchMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseDown(value: (Any, Any) => js.Object): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
    
    inline def setOnTouchStart(value: (Any, Any) => js.Object): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction2(value))
  }
}
