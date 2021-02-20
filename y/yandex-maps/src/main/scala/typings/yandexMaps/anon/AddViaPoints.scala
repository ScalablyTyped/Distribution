package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddViaPoints extends StObject {
  
  var addViaPoints: js.UndefOr[Boolean] = js.native
  
  var addWayPoints: js.UndefOr[Boolean] = js.native
  
  var editViaPoints: js.UndefOr[Boolean] = js.native
  
  var editWayPoints: js.UndefOr[Boolean] = js.native
  
  var removeViaPoints: js.UndefOr[Boolean] = js.native
  
  var removeWayPoints: js.UndefOr[Boolean] = js.native
}
object AddViaPoints {
  
  @scala.inline
  def apply(): AddViaPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddViaPoints]
  }
  
  @scala.inline
  implicit class AddViaPointsMutableBuilder[Self <: AddViaPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddViaPoints(value: Boolean): Self = StObject.set(x, "addViaPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddViaPointsUndefined: Self = StObject.set(x, "addViaPoints", js.undefined)
    
    @scala.inline
    def setAddWayPoints(value: Boolean): Self = StObject.set(x, "addWayPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddWayPointsUndefined: Self = StObject.set(x, "addWayPoints", js.undefined)
    
    @scala.inline
    def setEditViaPoints(value: Boolean): Self = StObject.set(x, "editViaPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditViaPointsUndefined: Self = StObject.set(x, "editViaPoints", js.undefined)
    
    @scala.inline
    def setEditWayPoints(value: Boolean): Self = StObject.set(x, "editWayPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditWayPointsUndefined: Self = StObject.set(x, "editWayPoints", js.undefined)
    
    @scala.inline
    def setRemoveViaPoints(value: Boolean): Self = StObject.set(x, "removeViaPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveViaPointsUndefined: Self = StObject.set(x, "removeViaPoints", js.undefined)
    
    @scala.inline
    def setRemoveWayPoints(value: Boolean): Self = StObject.set(x, "removeWayPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWayPointsUndefined: Self = StObject.set(x, "removeWayPoints", js.undefined)
  }
}
