package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): obj
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  @JSImport("webix", "Scrollable")
  @js.native
  val ^ : Scrollable = js.native
  
  extension [Self <: Scrollable](x: Self) {
    
    inline def setGetScrollState(value: () => obj): Self = StObject.set(x, "getScrollState", js.Any.fromFunction0(value))
    
    inline def setScrollTo(value: (Double, Double) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
  }
}
