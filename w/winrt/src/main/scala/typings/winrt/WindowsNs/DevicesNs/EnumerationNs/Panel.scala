package typings.winrt.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  @js.native
  sealed trait back extends Panel
  
  @js.native
  sealed trait bottom extends Panel
  
  @js.native
  sealed trait front extends Panel
  
  @js.native
  sealed trait left extends Panel
  
  @js.native
  sealed trait right extends Panel
  
  @js.native
  sealed trait top extends Panel
  
  @js.native
  sealed trait unknown extends Panel
  
  /* 2 */ val back: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.back with Double = js.native
  /* 4 */ val bottom: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.bottom with Double = js.native
  /* 1 */ val front: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.front with Double = js.native
  /* 5 */ val left: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.left with Double = js.native
  /* 6 */ val right: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.right with Double = js.native
  /* 3 */ val top: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.top with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.Panel.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Panel with Double] = js.native
}

