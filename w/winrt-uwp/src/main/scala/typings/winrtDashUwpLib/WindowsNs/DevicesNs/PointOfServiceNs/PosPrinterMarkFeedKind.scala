package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterMarkFeedKind extends js.Object

/** Describes the ways the receipt printer station should feed the mark-sensed paper when you call the ReceiptPrintJob.MarkFeed method. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedKind")
@js.native
object PosPrinterMarkFeedKind extends js.Object {
  /** Feeds the mark-sensed paper to the top of the form for the present paper, reverse feeding the paper if required. */
  @js.native
  sealed trait toCurrentTopOfForm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the cutting position for the automatic cutter. */
  @js.native
  sealed trait toCutter
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the top of the form for the next paper. */
  @js.native
  sealed trait toNextTopOfForm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the paper take-up position. */
  @js.native
  sealed trait toTakeUp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind
  
  val toCurrentTopOfForm: toCurrentTopOfForm with java.lang.String = js.native
  val toCutter: toCutter with java.lang.String = js.native
  val toNextTopOfForm: toNextTopOfForm with java.lang.String = js.native
  val toTakeUp: toTakeUp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind with java.lang.String
  ] = js.native
}

