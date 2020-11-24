package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.useScrollToTopMod.ScrollOptions
import typings.tuyaPanelKit.useScrollToTopMod.ScrollableView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollResponderScrollTo extends ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit = js.native
}
object ScrollResponderScrollTo {
  
  @scala.inline
  def apply(scrollResponderScrollTo: ScrollOptions => Unit): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  @scala.inline
  implicit class ScrollResponderScrollToOps[Self <: ScrollResponderScrollTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScrollResponderScrollTo(value: ScrollOptions => Unit): Self = this.set("scrollResponderScrollTo", js.Any.fromFunction1(value))
  }
}
