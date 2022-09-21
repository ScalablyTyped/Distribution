package typings.victoryCursorContainer

import typings.lodash.mod.DebouncedFunc
import typings.victoryCursorContainer.anon.EventKey
import typings.victoryCursorContainer.anon.Mutation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cursorHelpersMod {
  
  @JSImport("victory-cursor-container/lib/cursor-helpers", "CursorHelpers")
  @js.native
  val CursorHelpers: CursorHelpersClass = js.native
  
  trait CursorHelpersClass extends StObject {
    
    def getDimension(props: Any): Any
    
    /* private */ var handleMouseMove: Any
    
    def onMouseLeave(evt: Any, targetProps: Any): js.Array[EventKey]
    
    var onMouseMove: DebouncedFunc[js.Function2[/* evt */ Any, /* targetProps */ Any, js.Array[EventKey]]]
    
    def onTouchEnd(evt: Any, targetProps: Any): js.Array[Mutation]
    
    def withinBounds(point: Any, bounds: Any): Boolean
  }
  object CursorHelpersClass {
    
    inline def apply(
      getDimension: Any => Any,
      handleMouseMove: Any,
      onMouseLeave: (Any, Any) => js.Array[EventKey],
      onMouseMove: DebouncedFunc[js.Function2[/* evt */ Any, /* targetProps */ Any, js.Array[EventKey]]],
      onTouchEnd: (Any, Any) => js.Array[Mutation],
      withinBounds: (Any, Any) => Boolean
    ): CursorHelpersClass = {
      val __obj = js.Dynamic.literal(getDimension = js.Any.fromFunction1(getDimension), handleMouseMove = handleMouseMove.asInstanceOf[js.Any], onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = onMouseMove.asInstanceOf[js.Any], onTouchEnd = js.Any.fromFunction2(onTouchEnd), withinBounds = js.Any.fromFunction2(withinBounds))
      __obj.asInstanceOf[CursorHelpersClass]
    }
    
    extension [Self <: CursorHelpersClass](x: Self) {
      
      inline def setGetDimension(value: Any => Any): Self = StObject.set(x, "getDimension", js.Any.fromFunction1(value))
      
      inline def setHandleMouseMove(value: Any): Self = StObject.set(x, "handleMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeave(value: (Any, Any) => js.Array[EventKey]): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseMove(value: DebouncedFunc[js.Function2[/* evt */ Any, /* targetProps */ Any, js.Array[EventKey]]]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEnd(value: (Any, Any) => js.Array[Mutation]): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction2(value))
      
      inline def setWithinBounds(value: (Any, Any) => Boolean): Self = StObject.set(x, "withinBounds", js.Any.fromFunction2(value))
    }
  }
}
