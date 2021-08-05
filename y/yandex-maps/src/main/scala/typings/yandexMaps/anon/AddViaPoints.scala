package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddViaPoints extends StObject {
  
  var addViaPoints: js.UndefOr[Boolean] = js.undefined
  
  var addWayPoints: js.UndefOr[Boolean] = js.undefined
  
  var editViaPoints: js.UndefOr[Boolean] = js.undefined
  
  var editWayPoints: js.UndefOr[Boolean] = js.undefined
  
  var removeViaPoints: js.UndefOr[Boolean] = js.undefined
  
  var removeWayPoints: js.UndefOr[Boolean] = js.undefined
}
object AddViaPoints {
  
  inline def apply(): AddViaPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddViaPoints]
  }
  
  extension [Self <: AddViaPoints](x: Self) {
    
    inline def setAddViaPoints(value: Boolean): Self = StObject.set(x, "addViaPoints", value.asInstanceOf[js.Any])
    
    inline def setAddViaPointsUndefined: Self = StObject.set(x, "addViaPoints", js.undefined)
    
    inline def setAddWayPoints(value: Boolean): Self = StObject.set(x, "addWayPoints", value.asInstanceOf[js.Any])
    
    inline def setAddWayPointsUndefined: Self = StObject.set(x, "addWayPoints", js.undefined)
    
    inline def setEditViaPoints(value: Boolean): Self = StObject.set(x, "editViaPoints", value.asInstanceOf[js.Any])
    
    inline def setEditViaPointsUndefined: Self = StObject.set(x, "editViaPoints", js.undefined)
    
    inline def setEditWayPoints(value: Boolean): Self = StObject.set(x, "editWayPoints", value.asInstanceOf[js.Any])
    
    inline def setEditWayPointsUndefined: Self = StObject.set(x, "editWayPoints", js.undefined)
    
    inline def setRemoveViaPoints(value: Boolean): Self = StObject.set(x, "removeViaPoints", value.asInstanceOf[js.Any])
    
    inline def setRemoveViaPointsUndefined: Self = StObject.set(x, "removeViaPoints", js.undefined)
    
    inline def setRemoveWayPoints(value: Boolean): Self = StObject.set(x, "removeWayPoints", value.asInstanceOf[js.Any])
    
    inline def setRemoveWayPointsUndefined: Self = StObject.set(x, "removeWayPoints", js.undefined)
  }
}
