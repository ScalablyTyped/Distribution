package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SlidingWindow")
@js.native
class SlidingWindow protected () extends js.Object {
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any) = this()
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any, sourceLength: Double) = this()
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

