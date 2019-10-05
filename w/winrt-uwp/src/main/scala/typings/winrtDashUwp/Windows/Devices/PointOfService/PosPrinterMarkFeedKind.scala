package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 2 */ val toCurrentTopOfForm: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCurrentTopOfForm with Double = js.native
  /* 1 */ val toCutter: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCutter with Double = js.native
  /* 3 */ val toNextTopOfForm: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toNextTopOfForm with Double = js.native
  /* 0 */ val toTakeUp: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toTakeUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMarkFeedKind with Double] = js.native
}

