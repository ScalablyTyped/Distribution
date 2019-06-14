package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterMarkFeedCapabilities extends js.Object

/** Describes the capabilities of a receipt printer station for handling mark-sensed paper. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities")
@js.native
object PosPrinterMarkFeedCapabilities extends js.Object {
  /** The receipt printer station cannot feed the mark-sensed paper. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the top of the form for the present paper, reverse feeding the paper if required. */
  @js.native
  sealed trait toCurrentTopOfForm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the cutting position for the automatic cutter. */
  @js.native
  sealed trait toCutter
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the top of the form for the next paper. */
  @js.native
  sealed trait toNextTopOfForm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the paper take-up position. */
  @js.native
  sealed trait toTakeUp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val toCurrentTopOfForm: toCurrentTopOfForm with scala.Double = js.native
  /* 2 */ val toCutter: toCutter with scala.Double = js.native
  /* 4 */ val toNextTopOfForm: toNextTopOfForm with scala.Double = js.native
  /* 1 */ val toTakeUp: toTakeUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedCapabilities with scala.Double
  ] = js.native
}

