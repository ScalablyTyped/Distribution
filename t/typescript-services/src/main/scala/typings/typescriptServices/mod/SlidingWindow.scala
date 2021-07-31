package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISlidingWindowSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SlidingWindow")
@js.native
class SlidingWindow protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.SlidingWindow {
  def this(source: ISlidingWindowSource, window: js.Array[js.Any], defaultValue: js.Any) = this()
  def this(source: ISlidingWindowSource, window: js.Array[js.Any], defaultValue: js.Any, sourceLength: Double) = this()
  
  /* CompleteClass */
  var _pinCount: js.Any = js.native
  
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  
  /* CompleteClass */
  /* private */ override def addMoreItemsToWindow(argument: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def currentItem(argument: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var currentRelativeItemIndex: Double = js.native
  
  /* CompleteClass */
  var defaultValue: js.Any = js.native
  
  /* CompleteClass */
  override def disgardAllItemsFromCurrentIndexOnwards(): Unit = js.native
  
  /* CompleteClass */
  var firstPinnedAbsoluteIndex: js.Any = js.native
  
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
  var source: js.Any = js.native
  
  /* CompleteClass */
  var sourceLength: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def tryShiftOrGrowWindow(): js.Any = js.native
  
  /* CompleteClass */
  var window: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  /* private */ override def windowAbsoluteEndIndex(): js.Any = js.native
  
  /* CompleteClass */
  var windowAbsoluteStartIndex: Double = js.native
  
  /* CompleteClass */
  var windowCount: Double = js.native
}
