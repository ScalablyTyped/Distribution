package typings.swipeview

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeView extends StObject {
  
  var currentMasterPage: Double
  
  def destroy(): Unit
  
  def goToPage(p: Double): Unit
  
  def handleEvent(e: Event): Unit
  
  var masterPages: js.Array[HTMLElement]
  
  def next(): Unit
  
  def onFlip(fn: js.Function): Unit
  @JSName("onFlip")
  var onFlip_Original: SwipeViewEvent
  
  def onMoveIn(fn: js.Function): Unit
  @JSName("onMoveIn")
  var onMoveIn_Original: SwipeViewEvent
  
  def onMoveOut(fn: js.Function): Unit
  @JSName("onMoveOut")
  var onMoveOut_Original: SwipeViewEvent
  
  def onTouchStart(fn: js.Function): Unit
  @JSName("onTouchStart")
  var onTouchStart_Original: SwipeViewEvent
  
  def prev(): Unit
  
  def refreshSize(): Unit
  
  var slider: HTMLElement
  
  def updatePageCount(n: Double): Unit
  
  var wrapper: HTMLElement
  
  var wrapperHeight: Double
}
object SwipeView {
  
  inline def apply(
    currentMasterPage: Double,
    destroy: () => Unit,
    goToPage: Double => Unit,
    handleEvent: Event => Unit,
    masterPages: js.Array[HTMLElement],
    next: () => Unit,
    onFlip: /* fn */ js.Function => Unit,
    onMoveIn: /* fn */ js.Function => Unit,
    onMoveOut: /* fn */ js.Function => Unit,
    onTouchStart: /* fn */ js.Function => Unit,
    prev: () => Unit,
    refreshSize: () => Unit,
    slider: HTMLElement,
    updatePageCount: Double => Unit,
    wrapper: HTMLElement,
    wrapperHeight: Double
  ): SwipeView = {
    val __obj = js.Dynamic.literal(currentMasterPage = currentMasterPage.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), goToPage = js.Any.fromFunction1(goToPage), handleEvent = js.Any.fromFunction1(handleEvent), masterPages = masterPages.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), onFlip = js.Any.fromFunction1(onFlip), onMoveIn = js.Any.fromFunction1(onMoveIn), onMoveOut = js.Any.fromFunction1(onMoveOut), onTouchStart = js.Any.fromFunction1(onTouchStart), prev = js.Any.fromFunction0(prev), refreshSize = js.Any.fromFunction0(refreshSize), slider = slider.asInstanceOf[js.Any], updatePageCount = js.Any.fromFunction1(updatePageCount), wrapper = wrapper.asInstanceOf[js.Any], wrapperHeight = wrapperHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeView]
  }
  
  extension [Self <: SwipeView](x: Self) {
    
    inline def setCurrentMasterPage(value: Double): Self = StObject.set(x, "currentMasterPage", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGoToPage(value: Double => Unit): Self = StObject.set(x, "goToPage", js.Any.fromFunction1(value))
    
    inline def setHandleEvent(value: Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    
    inline def setMasterPages(value: js.Array[HTMLElement]): Self = StObject.set(x, "masterPages", value.asInstanceOf[js.Any])
    
    inline def setMasterPagesVarargs(value: HTMLElement*): Self = StObject.set(x, "masterPages", js.Array(value :_*))
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setOnFlip(value: /* fn */ js.Function => Unit): Self = StObject.set(x, "onFlip", js.Any.fromFunction1(value))
    
    inline def setOnMoveIn(value: /* fn */ js.Function => Unit): Self = StObject.set(x, "onMoveIn", js.Any.fromFunction1(value))
    
    inline def setOnMoveOut(value: /* fn */ js.Function => Unit): Self = StObject.set(x, "onMoveOut", js.Any.fromFunction1(value))
    
    inline def setOnTouchStart(value: /* fn */ js.Function => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setRefreshSize(value: () => Unit): Self = StObject.set(x, "refreshSize", js.Any.fromFunction0(value))
    
    inline def setSlider(value: HTMLElement): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageCount(value: Double => Unit): Self = StObject.set(x, "updatePageCount", js.Any.fromFunction1(value))
    
    inline def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperHeight(value: Double): Self = StObject.set(x, "wrapperHeight", value.asInstanceOf[js.Any])
  }
}
