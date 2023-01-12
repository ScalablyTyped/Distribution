package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.AutoRacks
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.CoalBulk
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.FuelSurcharge
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Intermodal
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Kilometers
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Miles
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Practical
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Shortest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailRouteOptions extends StObject {
  
  var amtrakRoutes: js.UndefOr[Boolean] = js.undefined
  
  var distUnit: Miles | Kilometers
  
  var intermodalOnlyStations: js.UndefOr[Boolean] = js.undefined
  
  var routingPreference: Shortest | CoalBulk | Intermodal | AutoRacks | Practical | FuelSurcharge
  
  var terminalSwitching: js.UndefOr[Boolean] = js.undefined
}
object RailRouteOptions {
  
  inline def apply(
    distUnit: Miles | Kilometers,
    routingPreference: Shortest | CoalBulk | Intermodal | AutoRacks | Practical | FuelSurcharge
  ): RailRouteOptions = {
    val __obj = js.Dynamic.literal(distUnit = distUnit.asInstanceOf[js.Any], routingPreference = routingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailRouteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RailRouteOptions] (val x: Self) extends AnyVal {
    
    inline def setAmtrakRoutes(value: Boolean): Self = StObject.set(x, "amtrakRoutes", value.asInstanceOf[js.Any])
    
    inline def setAmtrakRoutesUndefined: Self = StObject.set(x, "amtrakRoutes", js.undefined)
    
    inline def setDistUnit(value: Miles | Kilometers): Self = StObject.set(x, "distUnit", value.asInstanceOf[js.Any])
    
    inline def setIntermodalOnlyStations(value: Boolean): Self = StObject.set(x, "intermodalOnlyStations", value.asInstanceOf[js.Any])
    
    inline def setIntermodalOnlyStationsUndefined: Self = StObject.set(x, "intermodalOnlyStations", js.undefined)
    
    inline def setRoutingPreference(value: Shortest | CoalBulk | Intermodal | AutoRacks | Practical | FuelSurcharge): Self = StObject.set(x, "routingPreference", value.asInstanceOf[js.Any])
    
    inline def setTerminalSwitching(value: Boolean): Self = StObject.set(x, "terminalSwitching", value.asInstanceOf[js.Any])
    
    inline def setTerminalSwitchingUndefined: Self = StObject.set(x, "terminalSwitching", js.undefined)
  }
}
