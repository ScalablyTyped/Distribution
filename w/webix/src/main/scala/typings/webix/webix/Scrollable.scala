package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): js.Any
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  @scala.inline
  def apply(getScrollState: () => js.Any, scrollTo: (Double, Double) => Unit): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = js.Any.fromFunction0(getScrollState), scrollTo = js.Any.fromFunction2(scrollTo))
    __obj.asInstanceOf[Scrollable]
  }
  
  @scala.inline
  implicit class ScrollableMutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScrollState(value: () => js.Any): Self = StObject.set(x, "getScrollState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollTo(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
  }
}
