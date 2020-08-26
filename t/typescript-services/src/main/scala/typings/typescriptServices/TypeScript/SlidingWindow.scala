package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlidingWindow extends js.Object {
  var _pinCount: js.Any = js.native
  var currentRelativeItemIndex: Double = js.native
  var defaultValue: js.Any = js.native
  var firstPinnedAbsoluteIndex: js.Any = js.native
  var source: js.Any = js.native
  var sourceLength: js.Any = js.native
  var window: js.Array[_] = js.native
  var windowAbsoluteStartIndex: Double = js.native
  var windowCount: Double = js.native
  def absoluteIndex(): Double = js.native
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any = js.native
  def currentItem(argument: js.Any): js.Any = js.native
  def disgardAllItemsFromCurrentIndexOnwards(): Unit = js.native
  def getAndPinAbsoluteIndex(): Double = js.native
  def isAtEndOfSource(): Boolean = js.native
  def moveToNextItem(): Unit = js.native
  def peekItemN(n: Double): js.Any = js.native
  def pinCount(): Double = js.native
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  def rewindToPinnedIndex(absoluteIndex: Double): Unit = js.native
  def setAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  /* private */ def tryShiftOrGrowWindow(): js.Any = js.native
  /* private */ def windowAbsoluteEndIndex(): js.Any = js.native
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
  @scala.inline
  implicit class SlidingWindowOps[Self <: SlidingWindow] (val x: Self) extends AnyVal {
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
    def set_pinCount(value: js.Any): Self = this.set("_pinCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteIndex(value: () => Double): Self = this.set("absoluteIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setAddMoreItemsToWindow(value: js.Any => js.Any): Self = this.set("addMoreItemsToWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentItem(value: js.Any => js.Any): Self = this.set("currentItem", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentRelativeItemIndex(value: Double): Self = this.set("currentRelativeItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisgardAllItemsFromCurrentIndexOnwards(value: () => Unit): Self = this.set("disgardAllItemsFromCurrentIndexOnwards", js.Any.fromFunction0(value))
    @scala.inline
    def setFirstPinnedAbsoluteIndex(value: js.Any): Self = this.set("firstPinnedAbsoluteIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAndPinAbsoluteIndex(value: () => Double): Self = this.set("getAndPinAbsoluteIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAtEndOfSource(value: () => Boolean): Self = this.set("isAtEndOfSource", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToNextItem(value: () => Unit): Self = this.set("moveToNextItem", js.Any.fromFunction0(value))
    @scala.inline
    def setPeekItemN(value: Double => js.Any): Self = this.set("peekItemN", js.Any.fromFunction1(value))
    @scala.inline
    def setPinCount(value: () => Double): Self = this.set("pinCount", js.Any.fromFunction0(value))
    @scala.inline
    def setReleaseAndUnpinAbsoluteIndex(value: Double => Unit): Self = this.set("releaseAndUnpinAbsoluteIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRewindToPinnedIndex(value: Double => Unit): Self = this.set("rewindToPinnedIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAbsoluteIndex(value: Double => Unit): Self = this.set("setAbsoluteIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLength(value: js.Any): Self = this.set("sourceLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryShiftOrGrowWindow(value: () => js.Any): Self = this.set("tryShiftOrGrowWindow", js.Any.fromFunction0(value))
    @scala.inline
    def setWindowVarargs(value: js.Any*): Self = this.set("window", js.Array(value :_*))
    @scala.inline
    def setWindow(value: js.Array[_]): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowAbsoluteEndIndex(value: () => js.Any): Self = this.set("windowAbsoluteEndIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setWindowAbsoluteStartIndex(value: Double): Self = this.set("windowAbsoluteStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowCount(value: Double): Self = this.set("windowCount", value.asInstanceOf[js.Any])
  }
  
}

