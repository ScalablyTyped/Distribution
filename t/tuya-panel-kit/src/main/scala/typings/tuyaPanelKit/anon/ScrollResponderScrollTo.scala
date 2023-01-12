package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollOptions
import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollResponderScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit
}
object ScrollResponderScrollTo {
  
  inline def apply(scrollResponderScrollTo: ScrollOptions => Unit): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollResponderScrollTo] (val x: Self) extends AnyVal {
    
    inline def setScrollResponderScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollResponderScrollTo", js.Any.fromFunction1(value))
  }
}
