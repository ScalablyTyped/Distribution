package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the capabilities of a receipt printer station for handling mark-sensed paper. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities")
@js.native
object PosPrinterMarkFeedCapabilities extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities & Double
  ] = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.none & Double = js.native
  
  /* 3 */ val toCurrentTopOfForm: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCurrentTopOfForm & Double = js.native
  
  /* 2 */ val toCutter: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toCutter & Double = js.native
  
  /* 4 */ val toNextTopOfForm: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toNextTopOfForm & Double = js.native
  
  /* 1 */ val toTakeUp: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities.toTakeUp & Double = js.native
}
