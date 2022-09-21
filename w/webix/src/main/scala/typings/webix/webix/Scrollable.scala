package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): Any
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  inline def apply(getScrollState: () => Any, scrollTo: (Double, Double) => Unit): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = js.Any.fromFunction0(getScrollState), scrollTo = js.Any.fromFunction2(scrollTo))
    __obj.asInstanceOf[Scrollable]
  }
  
  extension [Self <: Scrollable](x: Self) {
    
    inline def setGetScrollState(value: () => Any): Self = StObject.set(x, "getScrollState", js.Any.fromFunction0(value))
    
    inline def setScrollTo(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
  }
}
