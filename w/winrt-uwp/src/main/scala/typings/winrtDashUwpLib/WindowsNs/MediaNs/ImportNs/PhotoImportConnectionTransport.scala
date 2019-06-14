package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportConnectionTransport extends js.Object

/** Specifies the connection transport used for photo import. */
@JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
@js.native
object PhotoImportConnectionTransport extends js.Object {
  /** The connection transport is Bluetooth. */
  @js.native
  sealed trait bluetooth
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport
  
  /** The connection transport is Internet Protocol. */
  @js.native
  sealed trait ip
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport
  
  /** The connection transport is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport
  
  /** The connection transport is USB. */
  @js.native
  sealed trait usb
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport
  
  /* 3 */ val bluetooth: bluetooth with scala.Double = js.native
  /* 2 */ val ip: ip with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 1 */ val usb: usb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport with scala.Double
  ] = js.native
}

