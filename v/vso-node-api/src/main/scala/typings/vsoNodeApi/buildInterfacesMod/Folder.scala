package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  /**
    * The process or person who created the folder.
    */
  var createdBy: IdentityRef
  
  /**
    * The date the folder was created.
    */
  var createdOn: js.Date
  
  /**
    * The description.
    */
  var description: String
  
  /**
    * The process or person that last changed the folder.
    */
  var lastChangedBy: IdentityRef
  
  /**
    * The date the folder was last changed.
    */
  var lastChangedDate: js.Date
  
  /**
    * The full path.
    */
  var path: String
  
  /**
    * The project.
    */
  var project: TeamProjectReference
}
object Folder {
  
  inline def apply(
    createdBy: IdentityRef,
    createdOn: js.Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: js.Date,
    path: String,
    project: TeamProjectReference
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLastChangedBy(value: IdentityRef): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    inline def setLastChangedDate(value: js.Date): Self = StObject.set(x, "lastChangedDate", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
