package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingWindow extends StObject {
  
  /* private */ var _pinCount: js.Any
  
  def absoluteIndex(): Double
  
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any
  
  def currentItem(argument: js.Any): js.Any
  
  var currentRelativeItemIndex: Double
  
  /* private */ var defaultValue: js.Any
  
  def disgardAllItemsFromCurrentIndexOnwards(): Unit
  
  /* private */ var firstPinnedAbsoluteIndex: js.Any
  
  def getAndPinAbsoluteIndex(): Double
  
  def isAtEndOfSource(): Boolean
  
  def moveToNextItem(): Unit
  
  def peekItemN(n: Double): js.Any
  
  def pinCount(): Double
  
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit
  
  def rewindToPinnedIndex(absoluteIndex: Double): Unit
  
  def setAbsoluteIndex(absoluteIndex: Double): Unit
  
  /* private */ var source: js.Any
  
  /* private */ var sourceLength: js.Any
  
  /* private */ def tryShiftOrGrowWindow(): js.Any
  
  var window: js.Array[js.Any]
  
  /* private */ def windowAbsoluteEndIndex(): js.Any
  
  var windowAbsoluteStartIndex: Double
  
  var windowCount: Double
}
object SlidingWindow {
  
  inline def apply(
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
  
  extension [Self <: SlidingWindow](x: Self) {
    
    inline def setAbsoluteIndex(value: () => Double): Self = StObject.set(x, "absoluteIndex", js.Any.fromFunction0(value))
    
    inline def setAddMoreItemsToWindow(value: js.Any => js.Any): Self = StObject.set(x, "addMoreItemsToWindow", js.Any.fromFunction1(value))
    
    inline def setCurrentItem(value: js.Any => js.Any): Self = StObject.set(x, "currentItem", js.Any.fromFunction1(value))
    
    inline def setCurrentRelativeItemIndex(value: Double): Self = StObject.set(x, "currentRelativeItemIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisgardAllItemsFromCurrentIndexOnwards(value: () => Unit): Self = StObject.set(x, "disgardAllItemsFromCurrentIndexOnwards", js.Any.fromFunction0(value))
    
    inline def setFirstPinnedAbsoluteIndex(value: js.Any): Self = StObject.set(x, "firstPinnedAbsoluteIndex", value.asInstanceOf[js.Any])
    
    inline def setGetAndPinAbsoluteIndex(value: () => Double): Self = StObject.set(x, "getAndPinAbsoluteIndex", js.Any.fromFunction0(value))
    
    inline def setIsAtEndOfSource(value: () => Boolean): Self = StObject.set(x, "isAtEndOfSource", js.Any.fromFunction0(value))
    
    inline def setMoveToNextItem(value: () => Unit): Self = StObject.set(x, "moveToNextItem", js.Any.fromFunction0(value))
    
    inline def setPeekItemN(value: Double => js.Any): Self = StObject.set(x, "peekItemN", js.Any.fromFunction1(value))
    
    inline def setPinCount(value: () => Double): Self = StObject.set(x, "pinCount", js.Any.fromFunction0(value))
    
    inline def setReleaseAndUnpinAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "releaseAndUnpinAbsoluteIndex", js.Any.fromFunction1(value))
    
    inline def setRewindToPinnedIndex(value: Double => Unit): Self = StObject.set(x, "rewindToPinnedIndex", js.Any.fromFunction1(value))
    
    inline def setSetAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1(value))
    
    inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLength(value: js.Any): Self = StObject.set(x, "sourceLength", value.asInstanceOf[js.Any])
    
    inline def setTryShiftOrGrowWindow(value: () => js.Any): Self = StObject.set(x, "tryShiftOrGrowWindow", js.Any.fromFunction0(value))
    
    inline def setWindow(value: js.Array[js.Any]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowAbsoluteEndIndex(value: () => js.Any): Self = StObject.set(x, "windowAbsoluteEndIndex", js.Any.fromFunction0(value))
    
    inline def setWindowAbsoluteStartIndex(value: Double): Self = StObject.set(x, "windowAbsoluteStartIndex", value.asInstanceOf[js.Any])
    
    inline def setWindowCount(value: Double): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
    
    inline def setWindowVarargs(value: js.Any*): Self = StObject.set(x, "window", js.Array(value :_*))
    
    inline def set_pinCount(value: js.Any): Self = StObject.set(x, "_pinCount", value.asInstanceOf[js.Any])
  }
}
