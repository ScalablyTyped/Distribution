package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  var create: scala.Double
  
  var delete: scala.Double
  
  var edit: scala.Double
  
  var managePermissions: scala.Double
  
  var none: scala.Double
  
  var read: scala.Double
}
object Create {
  
  @scala.inline
  def apply(
    create: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    managePermissions: scala.Double,
    none: scala.Double,
    read: scala.Double
  ): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: scala.Double): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: scala.Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagePermissions(value: scala.Double): Self = StObject.set(x, "managePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: scala.Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
