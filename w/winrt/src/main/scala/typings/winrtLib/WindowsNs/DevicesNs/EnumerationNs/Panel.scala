package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  @js.native
  sealed trait back
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait bottom
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait front
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait top
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /* 2 */ val back: back with scala.Double = js.native
  /* 4 */ val bottom: bottom with scala.Double = js.native
  /* 1 */ val front: front with scala.Double = js.native
  /* 5 */ val left: left with scala.Double = js.native
  /* 6 */ val right: right with scala.Double = js.native
  /* 3 */ val top: top with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel with scala.Double] = js.native
}

