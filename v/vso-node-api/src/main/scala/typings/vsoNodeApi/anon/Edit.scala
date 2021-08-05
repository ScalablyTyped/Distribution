package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edit extends StObject {
  
  var edit: scala.Double
  
  var manage: scala.Double
  
  var managePermissions: scala.Double
  
  var none: scala.Double
}
object Edit {
  
  inline def apply(edit: scala.Double, manage: scala.Double, managePermissions: scala.Double, none: scala.Double): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  
  extension [Self <: Edit](x: Self) {
    
    inline def setEdit(value: scala.Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setManage(value: scala.Double): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    inline def setManagePermissions(value: scala.Double): Self = StObject.set(x, "managePermissions", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
