package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): obj
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  inline def apply(getScrollState: () => obj, scrollTo: (Double, Double) => Unit): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = js.Any.fromFunction0(getScrollState), scrollTo = js.Any.fromFunction2(scrollTo))
    __obj.asInstanceOf[Scrollable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
    
    inline def setGetScrollState(value: () => obj): Self = StObject.set(x, "getScrollState", js.Any.fromFunction0(value))
    
    inline def setScrollTo(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
  }
}
