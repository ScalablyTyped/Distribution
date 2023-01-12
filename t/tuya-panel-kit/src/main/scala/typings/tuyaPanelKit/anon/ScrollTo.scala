package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollOptions
import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollTo(options: ScrollOptions): Unit
}
object ScrollTo {
  
  inline def apply(scrollTo: ScrollOptions => Unit): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollTo] (val x: Self) extends AnyVal {
    
    inline def setScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
  }
}
