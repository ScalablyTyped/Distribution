package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  var createdBy: IdentityRef
  
  var createdOn: Date
  
  var description: String
  
  var lastChangedBy: IdentityRef
  
  var lastChangedDate: Date
  
  var path: String
}
object Folder {
  
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: Date,
    path: String
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedBy(value: IdentityRef): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedDate(value: Date): Self = StObject.set(x, "lastChangedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
