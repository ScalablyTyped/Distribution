package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.UI.Core.CoreCursorType.wait
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
  
  /* 0 */ val arrow: typings.winrt.Windows.UI.Core.CoreCursorType.arrow with Double = js.native
  /* 1 */ val cross: typings.winrt.Windows.UI.Core.CoreCursorType.cross with Double = js.native
  /* 2 */ val custom: typings.winrt.Windows.UI.Core.CoreCursorType.custom with Double = js.native
  /* 3 */ val hand: typings.winrt.Windows.UI.Core.CoreCursorType.hand with Double = js.native
  /* 4 */ val help: typings.winrt.Windows.UI.Core.CoreCursorType.help with Double = js.native
  /* 5 */ val iBeam: typings.winrt.Windows.UI.Core.CoreCursorType.iBeam with Double = js.native
  /* 6 */ val sizeAll: typings.winrt.Windows.UI.Core.CoreCursorType.sizeAll with Double = js.native
  /* 8 */ val sizeNorthSouth: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthSouth with Double = js.native
  /* 7 */ val sizeNortheastSouthwest: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNortheastSouthwest with Double = js.native
  /* 9 */ val sizeNorthwestSoutheast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthwestSoutheast with Double = js.native
  /* 10 */ val sizeWestEast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeWestEast with Double = js.native
  /* 11 */ val universalNo: typings.winrt.Windows.UI.Core.CoreCursorType.universalNo with Double = js.native
  /* 12 */ val upArrow: typings.winrt.Windows.UI.Core.CoreCursorType.upArrow with Double = js.native
  /* 13 */ @JSName("wait")
  val wait_FCoreCursorType: wait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreCursorType with Double] = js.native
}

