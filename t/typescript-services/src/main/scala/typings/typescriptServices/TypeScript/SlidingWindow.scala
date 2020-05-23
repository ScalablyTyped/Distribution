package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidingWindow extends js.Object {
  var _pinCount: js.Any
  var currentRelativeItemIndex: Double
  var defaultValue: js.Any
  var firstPinnedAbsoluteIndex: js.Any
  var source: js.Any
  var sourceLength: js.Any
  var window: js.Array[_]
  var windowAbsoluteStartIndex: Double
  var windowCount: Double
  def absoluteIndex(): Double
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any
  def currentItem(argument: js.Any): js.Any
  def disgardAllItemsFromCurrentIndexOnwards(): Unit
  def getAndPinAbsoluteIndex(): Double
  def isAtEndOfSource(): Boolean
  def moveToNextItem(): Unit
  def peekItemN(n: Double): js.Any
  def pinCount(): Double
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit
  def rewindToPinnedIndex(absoluteIndex: Double): Unit
  def setAbsoluteIndex(absoluteIndex: Double): Unit
  /* private */ def tryShiftOrGrowWindow(): js.Any
  /* private */ def windowAbsoluteEndIndex(): js.Any
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
    window: js.Array[_],
    windowAbsoluteEndIndex: () => js.Any,
    windowAbsoluteStartIndex: Double,
    windowCount: Double
  ): SlidingWindow = {
    val __obj = js.Dynamic.literal(_pinCount = _pinCount.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), addMoreItemsToWindow = js.Any.fromFunction1(addMoreItemsToWindow), currentItem = js.Any.fromFunction1(currentItem), currentRelativeItemIndex = currentRelativeItemIndex.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], disgardAllItemsFromCurrentIndexOnwards = js.Any.fromFunction0(disgardAllItemsFromCurrentIndexOnwards), firstPinnedAbsoluteIndex = firstPinnedAbsoluteIndex.asInstanceOf[js.Any], getAndPinAbsoluteIndex = js.Any.fromFunction0(getAndPinAbsoluteIndex), isAtEndOfSource = js.Any.fromFunction0(isAtEndOfSource), moveToNextItem = js.Any.fromFunction0(moveToNextItem), peekItemN = js.Any.fromFunction1(peekItemN), pinCount = js.Any.fromFunction0(pinCount), releaseAndUnpinAbsoluteIndex = js.Any.fromFunction1(releaseAndUnpinAbsoluteIndex), rewindToPinnedIndex = js.Any.fromFunction1(rewindToPinnedIndex), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), source = source.asInstanceOf[js.Any], sourceLength = sourceLength.asInstanceOf[js.Any], tryShiftOrGrowWindow = js.Any.fromFunction0(tryShiftOrGrowWindow), window = window.asInstanceOf[js.Any], windowAbsoluteEndIndex = js.Any.fromFunction0(windowAbsoluteEndIndex), windowAbsoluteStartIndex = windowAbsoluteStartIndex.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingWindow]
  }
}

