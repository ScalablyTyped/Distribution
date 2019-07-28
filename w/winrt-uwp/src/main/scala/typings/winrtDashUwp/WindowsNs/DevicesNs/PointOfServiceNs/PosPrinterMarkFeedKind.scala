package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait toCurrentTopOfForm extends PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the cutting position for the automatic cutter. */
  @js.native
  sealed trait toCutter extends PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the top of the form for the next paper. */
  @js.native
  sealed trait toNextTopOfForm extends PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the paper take-up position. */
  @js.native
  sealed trait toTakeUp extends PosPrinterMarkFeedKind
  
  /* 2 */ val toCurrentTopOfForm: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind.toCurrentTopOfForm with Double = js.native
  /* 1 */ val toCutter: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind.toCutter with Double = js.native
  /* 3 */ val toNextTopOfForm: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind.toNextTopOfForm with Double = js.native
  /* 0 */ val toTakeUp: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMarkFeedKind.toTakeUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMarkFeedKind with Double] = js.native
}

