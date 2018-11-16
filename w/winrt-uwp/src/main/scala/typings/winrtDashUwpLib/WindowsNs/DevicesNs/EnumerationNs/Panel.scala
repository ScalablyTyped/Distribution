package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

/** Indicates the location of a panel on a computer. This enumeration is used for indicating the physical location of a device. */
@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  /** The back panel of the computer. */
  @js.native
  sealed trait back
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The bottom panel of the computer. */
  @js.native
  sealed trait bottom
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The front panel of the computer. */
  @js.native
  sealed trait front
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The left panel of the computer. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The right panel of the computer. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The top panel of the computer. */
  @js.native
  sealed trait top
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  /** The location of the panel is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel
  
  val back: back with java.lang.String = js.native
  val bottom: bottom with java.lang.String = js.native
  val front: front with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val top: top with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.Panel with java.lang.String] = js.native
}

