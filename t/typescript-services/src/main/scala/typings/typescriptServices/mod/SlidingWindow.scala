package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISlidingWindowSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SlidingWindow")
@js.native
class SlidingWindow protected ()
  extends typings.typescriptServices.TypeScript.SlidingWindow {
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any) = this()
  def this(source: ISlidingWindowSource, window: js.Array[_], defaultValue: js.Any, sourceLength: Double) = this()
  /* CompleteClass */
  override var _pinCount: js.Any = js.native
  /* CompleteClass */
  override var currentRelativeItemIndex: Double = js.native
  /* CompleteClass */
  override var defaultValue: js.Any = js.native
  /* CompleteClass */
  override var firstPinnedAbsoluteIndex: js.Any = js.native
  /* CompleteClass */
  override var source: js.Any = js.native
  /* CompleteClass */
  override var sourceLength: js.Any = js.native
  /* CompleteClass */
  override var window: js.Array[_] = js.native
  /* CompleteClass */
  override var windowAbsoluteStartIndex: Double = js.native
  /* CompleteClass */
  override var windowCount: Double = js.native
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  /* CompleteClass */
  /* private */ override def addMoreItemsToWindow(argument: js.Any): js.Any = js.native
  /* CompleteClass */
  override def currentItem(argument: js.Any): js.Any = js.native
  /* CompleteClass */
  override def disgardAllItemsFromCurrentIndexOnwards(): Unit = js.native
  /* CompleteClass */
  override def getAndPinAbsoluteIndex(): Double = js.native
  /* CompleteClass */
  override def isAtEndOfSource(): Boolean = js.native
  /* CompleteClass */
  override def moveToNextItem(): Unit = js.native
  /* CompleteClass */
  override def peekItemN(n: Double): js.Any = js.native
  /* CompleteClass */
  override def pinCount(): Double = js.native
  /* CompleteClass */
  override def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  /* CompleteClass */
  override def rewindToPinnedIndex(absoluteIndex: Double): Unit = js.native
  /* CompleteClass */
  override def setAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  /* CompleteClass */
  /* private */ override def tryShiftOrGrowWindow(): js.Any = js.native
  /* CompleteClass */
  /* private */ override def windowAbsoluteEndIndex(): js.Any = js.native
}

