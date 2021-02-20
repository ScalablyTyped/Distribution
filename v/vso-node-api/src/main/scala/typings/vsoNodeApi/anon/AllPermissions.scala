package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllPermissions extends StObject {
  
  var allPermissions: scala.Double = js.native
  
  var delete: scala.Double = js.native
  
  var edit: scala.Double = js.native
  
  var manage: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var view: scala.Double = js.native
}
object AllPermissions {
  
  @scala.inline
  def apply(
    allPermissions: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    manage: scala.Double,
    none: scala.Double,
    view: scala.Double
  ): AllPermissions = {
    val __obj = js.Dynamic.literal(allPermissions = allPermissions.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermissions]
  }
  
  @scala.inline
  implicit class AllPermissionsMutableBuilder[Self <: AllPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllPermissions(value: scala.Double): Self = StObject.set(x, "allPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: scala.Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManage(value: scala.Double): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: scala.Double): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
