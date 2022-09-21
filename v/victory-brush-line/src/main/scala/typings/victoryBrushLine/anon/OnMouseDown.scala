package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMouseDown extends StObject {
  
  def onMouseDown(evt: Any, targetProps: Any): js.Array[`0` | `1` | `2`]
  
  def onMouseEnter(evt: Any, targetProps: Any): js.Array[Mutation]
  
  def onMouseLeave(evt: Any, targetProps: Any): js.Array[`6`]
  
  def onMouseMove(evt: Any, targetProps: Any): js.Array[`3` | `4` | Mutation]
  
  def onMouseUp(evt: Any, targetProps: Any): js.Array[`5`]
}
object OnMouseDown {
  
  inline def apply(
    onMouseDown: (Any, Any) => js.Array[`0` | `1` | `2`],
    onMouseEnter: (Any, Any) => js.Array[Mutation],
    onMouseLeave: (Any, Any) => js.Array[`6`],
    onMouseMove: (Any, Any) => js.Array[`3` | `4` | Mutation],
    onMouseUp: (Any, Any) => js.Array[`5`]
  ): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseEnter = js.Any.fromFunction2(onMouseEnter), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), onMouseUp = js.Any.fromFunction2(onMouseUp))
    __obj.asInstanceOf[OnMouseDown]
  }
  
  extension [Self <: OnMouseDown](x: Self) {
    
    inline def setOnMouseDown(value: (Any, Any) => js.Array[`0` | `1` | `2`]): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
    
    inline def setOnMouseEnter(value: (Any, Any) => js.Array[Mutation]): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
    
    inline def setOnMouseLeave(value: (Any, Any) => js.Array[`6`]): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
    
    inline def setOnMouseMove(value: (Any, Any) => js.Array[`3` | `4` | Mutation]): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
    
    inline def setOnMouseUp(value: (Any, Any) => js.Array[`5`]): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2(value))
  }
}
