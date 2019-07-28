package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreCursorType extends js.Object

@JSGlobal("Windows.UI.Core.CoreCursorType")
@js.native
object CoreCursorType extends js.Object {
  @js.native
  sealed trait arrow extends CoreCursorType
  
  @js.native
  sealed trait cross extends CoreCursorType
  
  @js.native
  sealed trait custom extends CoreCursorType
  
  @js.native
  sealed trait hand extends CoreCursorType
  
  @js.native
  sealed trait help extends CoreCursorType
  
  @js.native
  sealed trait iBeam extends CoreCursorType
  
  @js.native
  sealed trait sizeAll extends CoreCursorType
  
  @js.native
  sealed trait sizeNorthSouth extends CoreCursorType
  
  @js.native
  sealed trait sizeNortheastSouthwest extends CoreCursorType
  
  @js.native
  sealed trait sizeNorthwestSoutheast extends CoreCursorType
  
  @js.native
  sealed trait sizeWestEast extends CoreCursorType
  
  @js.native
  sealed trait universalNo extends CoreCursorType
  
  @js.native
  sealed trait upArrow extends CoreCursorType
  
  @js.native
  sealed trait wait extends CoreCursorType
  
  /* 0 */ val arrow: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.arrow with Double = js.native
  /* 1 */ val cross: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.cross with Double = js.native
  /* 2 */ val custom: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.custom with Double = js.native
  /* 3 */ val hand: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.hand with Double = js.native
  /* 4 */ val help: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.help with Double = js.native
  /* 5 */ val iBeam: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.iBeam with Double = js.native
  /* 6 */ val sizeAll: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.sizeAll with Double = js.native
  /* 8 */ val sizeNorthSouth: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.sizeNorthSouth with Double = js.native
  /* 7 */ val sizeNortheastSouthwest: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.sizeNortheastSouthwest with Double = js.native
  /* 9 */ val sizeNorthwestSoutheast: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.sizeNorthwestSoutheast with Double = js.native
  /* 10 */ val sizeWestEast: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.sizeWestEast with Double = js.native
  /* 11 */ val universalNo: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.universalNo with Double = js.native
  /* 12 */ val upArrow: typings.winrt.WindowsNs.UINs.CoreNs.CoreCursorType.upArrow with Double = js.native
  /* 13 */ @JSName("wait")
  val wait_FCoreCursorType: wait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreCursorType with Double] = js.native
}

