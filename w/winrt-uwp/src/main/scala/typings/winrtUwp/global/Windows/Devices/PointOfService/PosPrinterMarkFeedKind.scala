package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the ways the receipt printer station should feed the mark-sensed paper when you call the ReceiptPrintJob.MarkFeed method. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedKind")
@js.native
object PosPrinterMarkFeedKind extends js.Object {
  /* 2 */ val toCurrentTopOfForm: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCurrentTopOfForm with Double = js.native
  /* 1 */ val toCutter: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toCutter with Double = js.native
  /* 3 */ val toNextTopOfForm: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toNextTopOfForm with Double = js.native
  /* 0 */ val toTakeUp: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind.toTakeUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedKind with Double
  ] = js.native
}

