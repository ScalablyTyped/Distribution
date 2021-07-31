package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterMarkFeedKind extends StObject
/** Describes the ways the receipt printer station should feed the mark-sensed paper when you call the ReceiptPrintJob.MarkFeed method. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedKind")
@js.native
object PosPrinterMarkFeedKind extends StObject {
  
  /** Feeds the mark-sensed paper to the top of the form for the present paper, reverse feeding the paper if required. */
  @js.native
  sealed trait toCurrentTopOfForm
    extends StObject
       with PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the cutting position for the automatic cutter. */
  @js.native
  sealed trait toCutter
    extends StObject
       with PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the top of the form for the next paper. */
  @js.native
  sealed trait toNextTopOfForm
    extends StObject
       with PosPrinterMarkFeedKind
  
  /** Feeds the mark-sensed paper to the paper take-up position. */
  @js.native
  sealed trait toTakeUp
    extends StObject
       with PosPrinterMarkFeedKind
}
