package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired repeatedly as the view is being scrolled.
  */
@js.native
trait ScrollableViewScrollEvent extends ScrollableViewBaseEvent {
  
  /**
    * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
    */
  var currentPage: Double = js.native
  
  /**
    * Current page index that the view is scrolled to as a float. For
    * example, if the user is holding the `ScrollableView` in between
    * the first and second page, this will have a value of 0.5.
    */
  var currentPageAsFloat: Double = js.native
  
  /**
    * The currently visible view.
    */
  var view: View = js.native
}
object ScrollableViewScrollEvent {
  
  @scala.inline
  def apply(currentPage: Double, currentPageAsFloat: Double, source: ScrollableView, view: View): ScrollableViewScrollEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], currentPageAsFloat = currentPageAsFloat.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollEvent]
  }
  
  @scala.inline
  implicit class ScrollableViewScrollEventMutableBuilder[Self <: ScrollableViewScrollEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageAsFloat(value: Double): Self = StObject.set(x, "currentPageAsFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
