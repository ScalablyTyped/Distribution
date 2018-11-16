package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SlidingWindow")
@js.native
class SlidingWindow protected () extends js.Object {
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any) = this()
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any, sourceLength: scala.Double) = this()
  var _pinCount: js.Any = js.native
  var currentRelativeItemIndex: scala.Double = js.native
  var defaultValue: js.Any = js.native
  var firstPinnedAbsoluteIndex: js.Any = js.native
  var source: js.Any = js.native
  var sourceLength: js.Any = js.native
  var window: js.Array[_] = js.native
  var windowAbsoluteStartIndex: scala.Double = js.native
  var windowCount: scala.Double = js.native
  def absoluteIndex(): scala.Double = js.native
  /* private */ def addMoreItemsToWindow(argument: js.Any): js.Any = js.native
  def currentItem(argument: js.Any): js.Any = js.native
  def disgardAllItemsFromCurrentIndexOnwards(): scala.Unit = js.native
  def getAndPinAbsoluteIndex(): scala.Double = js.native
  def isAtEndOfSource(): scala.Boolean = js.native
  def moveToNextItem(): scala.Unit = js.native
  def peekItemN(n: scala.Double): js.Any = js.native
  def pinCount(): scala.Double = js.native
  def releaseAndUnpinAbsoluteIndex(absoluteIndex: scala.Double): scala.Unit = js.native
  def rewindToPinnedIndex(absoluteIndex: scala.Double): scala.Unit = js.native
  def setAbsoluteIndex(absoluteIndex: scala.Double): scala.Unit = js.native
  /* private */ def tryShiftOrGrowWindow(): js.Any = js.native
  /* private */ def windowAbsoluteEndIndex(): js.Any = js.native
}

