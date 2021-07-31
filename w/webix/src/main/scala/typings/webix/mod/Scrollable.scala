package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): js.Any
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  @JSImport("webix", "Scrollable")
  @js.native
  val ^ : Scrollable = js.native
  
  @scala.inline
  implicit class ScrollableMutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetScrollState(value: () => js.Any): Self = StObject.set(x, "getScrollState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollTo(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
  }
}
