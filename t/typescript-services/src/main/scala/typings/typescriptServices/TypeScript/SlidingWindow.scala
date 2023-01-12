package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingWindow extends StObject {
  
  /* private */ var _pinCount: Any
  
  def absoluteIndex(): Double
  
  /* private */ def addMoreItemsToWindow(argument: Any): Any
  
  def currentItem(argument: Any): Any
  
  var currentRelativeItemIndex: Double
  
  /* private */ var defaultValue: Any
  
  def disgardAllItemsFromCurrentIndexOnwards(): Unit
  
  /* private */ var firstPinnedAbsoluteIndex: Any
  
  def getAndPinAbsoluteIndex(): Double
  
  def isAtEndOfSource(): Boolean
  
  def moveToNextItem(): Unit
  
  def peekItemN(n: Double): Any
  
  def pinCount(): Double
  
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit
  
  def rewindToPinnedIndex(absoluteIndex: Double): Unit
  
  def setAbsoluteIndex(absoluteIndex: Double): Unit
  
  /* private */ var source: Any
  
  /* private */ var sourceLength: Any
  
  /* private */ def tryShiftOrGrowWindow(): Any
  
  var window: js.Array[Any]
  
  /* private */ def windowAbsoluteEndIndex(): Any
  
  var windowAbsoluteStartIndex: Double
  
  var windowCount: Double
}
object SlidingWindow {
  
  inline def apply(
    _pinCount: Any,
    absoluteIndex: () => Double,
    addMoreItemsToWindow: Any => Any,
    currentItem: Any => Any,
    currentRelativeItemIndex: Double,
    defaultValue: Any,
    disgardAllItemsFromCurrentIndexOnwards: () => Unit,
    firstPinnedAbsoluteIndex: Any,
    getAndPinAbsoluteIndex: () => Double,
    isAtEndOfSource: () => Boolean,
    moveToNextItem: () => Unit,
    peekItemN: Double => Any,
    pinCount: () => Double,
    releaseAndUnpinAbsoluteIndex: Double => Unit,
    rewindToPinnedIndex: Double => Unit,
    setAbsoluteIndex: Double => Unit,
    source: Any,
    sourceLength: Any,
    tryShiftOrGrowWindow: () => Any,
    window: js.Array[Any],
    windowAbsoluteEndIndex: () => Any,
    windowAbsoluteStartIndex: Double,
    windowCount: Double
  ): SlidingWindow = {
    val __obj = js.Dynamic.literal(_pinCount = _pinCount.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), addMoreItemsToWindow = js.Any.fromFunction1(addMoreItemsToWindow), currentItem = js.Any.fromFunction1(currentItem), currentRelativeItemIndex = currentRelativeItemIndex.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disgardAllItemsFromCurrentIndexOnwards = js.Any.fromFunction0(disgardAllItemsFromCurrentIndexOnwards), firstPinnedAbsoluteIndex = firstPinnedAbsoluteIndex.asInstanceOf[js.Any], getAndPinAbsoluteIndex = js.Any.fromFunction0(getAndPinAbsoluteIndex), isAtEndOfSource = js.Any.fromFunction0(isAtEndOfSource), moveToNextItem = js.Any.fromFunction0(moveToNextItem), peekItemN = js.Any.fromFunction1(peekItemN), pinCount = js.Any.fromFunction0(pinCount), releaseAndUnpinAbsoluteIndex = js.Any.fromFunction1(releaseAndUnpinAbsoluteIndex), rewindToPinnedIndex = js.Any.fromFunction1(rewindToPinnedIndex), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), source = source.asInstanceOf[js.Any], sourceLength = sourceLength.asInstanceOf[js.Any], tryShiftOrGrowWindow = js.Any.fromFunction0(tryShiftOrGrowWindow), window = window.asInstanceOf[js.Any], windowAbsoluteEndIndex = js.Any.fromFunction0(windowAbsoluteEndIndex), windowAbsoluteStartIndex = windowAbsoluteStartIndex.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlidingWindow] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteIndex(value: () => Double): Self = StObject.set(x, "absoluteIndex", js.Any.fromFunction0(value))
    
    inline def setAddMoreItemsToWindow(value: Any => Any): Self = StObject.set(x, "addMoreItemsToWindow", js.Any.fromFunction1(value))
    
    inline def setCurrentItem(value: Any => Any): Self = StObject.set(x, "currentItem", js.Any.fromFunction1(value))
    
    inline def setCurrentRelativeItemIndex(value: Double): Self = StObject.set(x, "currentRelativeItemIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisgardAllItemsFromCurrentIndexOnwards(value: () => Unit): Self = StObject.set(x, "disgardAllItemsFromCurrentIndexOnwards", js.Any.fromFunction0(value))
    
    inline def setFirstPinnedAbsoluteIndex(value: Any): Self = StObject.set(x, "firstPinnedAbsoluteIndex", value.asInstanceOf[js.Any])
    
    inline def setGetAndPinAbsoluteIndex(value: () => Double): Self = StObject.set(x, "getAndPinAbsoluteIndex", js.Any.fromFunction0(value))
    
    inline def setIsAtEndOfSource(value: () => Boolean): Self = StObject.set(x, "isAtEndOfSource", js.Any.fromFunction0(value))
    
    inline def setMoveToNextItem(value: () => Unit): Self = StObject.set(x, "moveToNextItem", js.Any.fromFunction0(value))
    
    inline def setPeekItemN(value: Double => Any): Self = StObject.set(x, "peekItemN", js.Any.fromFunction1(value))
    
    inline def setPinCount(value: () => Double): Self = StObject.set(x, "pinCount", js.Any.fromFunction0(value))
    
    inline def setReleaseAndUnpinAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "releaseAndUnpinAbsoluteIndex", js.Any.fromFunction1(value))
    
    inline def setRewindToPinnedIndex(value: Double => Unit): Self = StObject.set(x, "rewindToPinnedIndex", js.Any.fromFunction1(value))
    
    inline def setSetAbsoluteIndex(value: Double => Unit): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1(value))
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLength(value: Any): Self = StObject.set(x, "sourceLength", value.asInstanceOf[js.Any])
    
    inline def setTryShiftOrGrowWindow(value: () => Any): Self = StObject.set(x, "tryShiftOrGrowWindow", js.Any.fromFunction0(value))
    
    inline def setWindow(value: js.Array[Any]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowAbsoluteEndIndex(value: () => Any): Self = StObject.set(x, "windowAbsoluteEndIndex", js.Any.fromFunction0(value))
    
    inline def setWindowAbsoluteStartIndex(value: Double): Self = StObject.set(x, "windowAbsoluteStartIndex", value.asInstanceOf[js.Any])
    
    inline def setWindowCount(value: Double): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
    
    inline def setWindowVarargs(value: Any*): Self = StObject.set(x, "window", js.Array(value*))
    
    inline def set_pinCount(value: Any): Self = StObject.set(x, "_pinCount", value.asInstanceOf[js.Any])
  }
}
