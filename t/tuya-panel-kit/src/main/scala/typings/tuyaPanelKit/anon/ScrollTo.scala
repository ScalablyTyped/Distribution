package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.useScrollToTopMod.ScrollOptions
import typings.tuyaPanelKit.useScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollTo(options: ScrollOptions): Unit
}
object ScrollTo {
  
  @scala.inline
  def apply(scrollTo: ScrollOptions => Unit): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollTo]
  }
  
  @scala.inline
  implicit class ScrollToMutableBuilder[Self <: ScrollTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollTo(value: ScrollOptions => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
  }
}
