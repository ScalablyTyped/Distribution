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
  
  val back: back with java.lang.String = js.native
  val bottom: bottom with java.lang.String = js.native
  val front: front with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val top: top with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.Panel with java.lang.String] = js.native
}

