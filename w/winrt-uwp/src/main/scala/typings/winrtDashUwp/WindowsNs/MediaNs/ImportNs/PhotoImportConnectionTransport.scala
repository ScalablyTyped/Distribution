package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

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
  sealed trait bluetooth extends PhotoImportConnectionTransport
  
  /** The connection transport is Internet Protocol. */
  @js.native
  sealed trait ip extends PhotoImportConnectionTransport
  
  /** The connection transport is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportConnectionTransport
  
  /** The connection transport is USB. */
  @js.native
  sealed trait usb extends PhotoImportConnectionTransport
  
  /* 3 */ val bluetooth: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport.bluetooth with Double = js.native
  /* 2 */ val ip: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport.ip with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport.unknown with Double = js.native
  /* 1 */ val usb: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportConnectionTransport.usb with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportConnectionTransport with Double] = js.native
}

