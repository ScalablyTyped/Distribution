package typings.tuyaPanelKit.useScrollToTopMod

import typings.tuyaPanelKit.anon.Animated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.tuyaPanelKit.anon.ScrollToTop
  - typings.tuyaPanelKit.anon.ScrollTo
  - typings.tuyaPanelKit.anon.ScrollToOffset
  - typings.tuyaPanelKit.anon.ScrollResponderScrollTo
*/
trait ScrollableView extends ScrollableWrapper
object ScrollableView {
  
  @scala.inline
  def ScrollToTop(scrollToTop: () => Unit): ScrollableView = {
    val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
    __obj.asInstanceOf[ScrollableView]
  }
  
  @scala.inline
  def ScrollTo(scrollTo: ScrollOptions => Unit): ScrollableView = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollableView]
  }
  
  @scala.inline
  def ScrollToOffset(scrollToOffset: Animated => Unit): ScrollableView = {
    val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
    __obj.asInstanceOf[ScrollableView]
  }
  
  @scala.inline
  def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): ScrollableView = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollableView]
  }
}
