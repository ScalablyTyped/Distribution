package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  sealed trait none extends PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the top of the form for the present paper, reverse feeding the paper if required. */
  @js.native
  sealed trait toCurrentTopOfForm extends PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the cutting position for the automatic cutter. */
  @js.native
  sealed trait toCutter extends PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the top of the form for the next paper. */
  @js.native
  sealed trait toNextTopOfForm extends PosPrinterMarkFeedCapabilities
  
  /** The receipt printer station can feed the mark-sensed paper to the paper take-up position. */
  @js.native
  sealed trait toTakeUp extends PosPrinterMarkFeedCapabilities
  
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.none with Double = js.native
  /* 3 */ val toCurrentTopOfForm: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCurrentTopOfForm with Double = js.native
  /* 2 */ val toCutter: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCutter with Double = js.native
  /* 4 */ val toNextTopOfForm: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toNextTopOfForm with Double = js.native
  /* 1 */ val toTakeUp: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toTakeUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMarkFeedCapabilities with Double] = js.native
}

