package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISlidingWindowSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SlidingWindow")
@js.native
open class SlidingWindow protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.SlidingWindow {
  def this(source: ISlidingWindowSource, window: js.Array[Any], defaultValue: Any) = this()
  def this(source: ISlidingWindowSource, window: js.Array[Any], defaultValue: Any, sourceLength: Double) = this()
  
  /* private */ /* CompleteClass */
  var _pinCount: Any = js.native
  
  /* CompleteClass */
  override def absoluteIndex(): Double = js.native
  
  /* private */ /* CompleteClass */
  override def addMoreItemsToWindow(argument: Any): Any = js.native
  
  /* CompleteClass */
  override def currentItem(argument: Any): Any = js.native
  
  /* CompleteClass */
  var currentRelativeItemIndex: Double = js.native
  
  /* private */ /* CompleteClass */
  var defaultValue: Any = js.native
  
  /* CompleteClass */
  override def disgardAllItemsFromCurrentIndexOnwards(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var firstPinnedAbsoluteIndex: Any = js.native
  
  /* CompleteClass */
  override def getAndPinAbsoluteIndex(): Double = js.native
  
  /* CompleteClass */
  override def isAtEndOfSource(): Boolean = js.native
  
  /* CompleteClass */
  override def moveToNextItem(): Unit = js.native
  
  /* CompleteClass */
  override def peekItemN(n: Double): Any = js.native
  
  /* CompleteClass */
  override def pinCount(): Double = js.native
  
  /* CompleteClass */
  override def releaseAndUnpinAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def rewindToPinnedIndex(absoluteIndex: Double): Unit = js.native
  
  /* CompleteClass */
  override def setAbsoluteIndex(absoluteIndex: Double): Unit = js.native
  
  /* private */ /* CompleteClass */
  var source: Any = js.native
  
  /* private */ /* CompleteClass */
  var sourceLength: Any = js.native
  
  /* private */ /* CompleteClass */
  override def tryShiftOrGrowWindow(): Any = js.native
  
  /* CompleteClass */
  var window: js.Array[Any] = js.native
  
  /* private */ /* CompleteClass */
  override def windowAbsoluteEndIndex(): Any = js.native
  
  /* CompleteClass */
  var windowAbsoluteStartIndex: Double = js.native
  
  /* CompleteClass */
  var windowCount: Double = js.native
}
