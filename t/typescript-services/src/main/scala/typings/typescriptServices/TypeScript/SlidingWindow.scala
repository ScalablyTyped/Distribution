package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingWindow extends StObject {
  
  var _pinCount: js.Any
  
  def absoluteIndex(): Double
  
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any
  
  def currentItem(argument: js.Any): js.Any
  
  var currentRelativeItemIndex: Double
  
  var defaultValue: js.Any
  
  def disgardAllItemsFromCurrentIndexOnwards(): Unit
  
  var firstPinnedAbsoluteIndex: js.Any
  
  def getAndPinAbsoluteIndex(): Double
  
  def isAtEndOfSource(): Boolean
  
  def moveToNextItem(): Unit
  
  def peekItemN(n: Double): js.Any
  
  def pinCount(): Double
  
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit
  
  def rewindToPinnedIndex(absoluteIndex: Double): Unit
  
  def setAbsoluteIndex(absoluteIndex: Double): Unit
  
  var source: js.Any
  
  var sourceLength: js.Any
  
  /* private */ def tryShiftOrGrowWindow(): js.Any
  
  var window: js.Array[js.Any]
  
  /* private */ def windowAbsoluteEndIndex(): js.Any
  
  var windowAbsoluteStartIndex: Double
  
  var windowCount: Double
}
object SlidingWindow {
  
  @scala.inline
  def apply(
    _pinCount: js.Any,
    absoluteIndex: () => Double,
    addMoreItemsToWindow: js.Any => js.Any,
    currentItem: js.Any => js.Any,
    currentRelativeItemIndex: Double,
    defaultValue: js.Any,
    disgardAllItemsFromCurrentIndexOnwards: () => Unit,
    firstPinnedAbsoluteIndex: js.Any,
    getAndPinAbsoluteIndex: () => Double,
    isAtEndOfSource: () => Boolean,
    moveToNextItem: () => Unit,
    peekItemN: Double => js.Any,
    pinCount: () => Double,
    releaseAndUnpinAbsoluteIndex: Double => Unit,
    rewindToPinnedIndex: Double => Unit,
    setAbsoluteIndex: Double => Unit,
    source: js.Any,
    sourceLength: js.Any,
    tryShiftOrGrowWindow: () => js.Any,
    window: js.Array[js.Any],
    windowAbsoluteEndIndex: () => js.Any,
    windowAbsoluteStartIndex: Double,
    windowCount: Double
  ): SlidingWindow = {
    val __obj = js.Dynamic.literal(_pinCount = _pinCount.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), addMoreItemsToWindow = js.Any.fromFunction1(addMoreItemsToWindow), currentItem = js.Any.fromFunction1(currentItem), currentRelativeItemIndex = currentRelativeItemIndex.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disgardAllItemsFromCurrentIndexOnwards = js.Any.fromFunction0(disgardAllItemsFromCurrentIndexOnwards), firstPinnedAbsoluteIndex = firstPinnedAbsoluteIndex.asInstanceOf[js.Any], getAndPinAbsoluteIndex = js.Any.fromFunction0(getAndPinAbsoluteIndex), isAtEndOfSource = js.Any.fromFunction0(isAtEndOfSource), moveToNextItem = js.Any.fromFunction0(moveToNextItem), peekItemN = js.Any.fromFunction1(peekItemN), pinCount = js.Any.fromFunction0(pinCount), releaseAndUnpinAbsoluteIndex = js.Any.fromFunction1(releaseAndUnpinAbsoluteIndex), rewindToPinnedIndex = js.Any.fromFunction1(rewindToPinnedIndex), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), source = source.asInstanceOf[js.Any], sourceLength = sourceLength.asInstanceOf[js.Any], tryShiftOrGrowWindow = js.Any.fromFunction0(tryShiftOrGrowWindow), window = window.asInstanceOf[js.Any], windowAbsoluteEndIndex = js.Any.fromFunction0(windowAbsoluteEndIndex), windowAbsoluteStartIndex = windowAbsoluteStartIndex.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingWindow]
  }
  
  @scala.inline
  implicit class SlidingWindowMutableBuilder[Self <: SlidingWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteIndex(value: () => Double): Self = StObject.set(x, "absoluteIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddMoreItemsToWindow(value: js.Any => js.Any): Self = StObject.set(x, "addMoreItemsToWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentItem(value: js.Any => js.Any): Self = StObject.set(x, "currentItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentRelativeItemIndex(value: Double): Self = StObject.set(x, "currentRelativeItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisgardAllItemsFromCurrentIndexOnwards(value: () => Unit): Self = StObject.set(x, "disgardAllItemsFromCurrentIndexOnwards", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstPinnedAbsoluteIndex(value: js.Any): Self = StObject.set(x, "firstPinnedAbsoluteIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAndPinAbsoluteIndex(value: () => Double): Self = StObject.set(x, "getAndPinAbsoluteIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAtEndOfSource(value: () => Boolean): Self = StObject.set(x, "isAtEndOfSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveToNextItem(value: () => Unit): Self = StObject.set(x, "moveToNextItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeekItemN(value: Double => js.Any): Self = StObject.set(x, "peekItemN", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPinCount(value: () => Double): Self = StObject.set(x, "pinCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReleaseAndUnpinAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "releaseAndUnpinAbsoluteIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRewindToPinnedIndex(value: Double => Unit): Self = StObject.set(x, "rewindToPinnedIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLength(value: js.Any): Self = StObject.set(x, "sourceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryShiftOrGrowWindow(value: () => js.Any): Self = StObject.set(x, "tryShiftOrGrowWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWindow(value: js.Array[js.Any]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowAbsoluteEndIndex(value: () => js.Any): Self = StObject.set(x, "windowAbsoluteEndIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWindowAbsoluteStartIndex(value: Double): Self = StObject.set(x, "windowAbsoluteStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowCount(value: Double): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowVarargs(value: js.Any*): Self = StObject.set(x, "window", js.Array(value :_*))
    
    @scala.inline
    def set_pinCount(value: js.Any): Self = StObject.set(x, "_pinCount", value.asInstanceOf[js.Any])
  }
}
