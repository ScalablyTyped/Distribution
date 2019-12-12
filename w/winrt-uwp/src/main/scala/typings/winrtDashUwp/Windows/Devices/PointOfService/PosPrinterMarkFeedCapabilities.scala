package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.none
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCurrentTopOfForm
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCutter
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toNextTopOfForm
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toTakeUp
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMarkFeedCapabilities with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object toCurrentTopOfForm extends TopLevel[toCurrentTopOfForm with Double]
  
  /* 2 */ @js.native
  object toCutter extends TopLevel[toCutter with Double]
  
  /* 4 */ @js.native
  object toNextTopOfForm extends TopLevel[toNextTopOfForm with Double]
  
  /* 1 */ @js.native
  object toTakeUp extends TopLevel[toTakeUp with Double]
  
}

