package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folder extends StObject {
  
  /**
    * The process or person who created the folder.
    */
  var createdBy: IdentityRef = js.native
  
  /**
    * The date the folder was created.
    */
  var createdOn: Date = js.native
  
  /**
    * The description.
    */
  var description: String = js.native
  
  /**
    * The process or person that last changed the folder.
    */
  var lastChangedBy: IdentityRef = js.native
  
  /**
    * The date the folder was last changed.
    */
  var lastChangedDate: Date = js.native
  
  /**
    * The full path.
    */
  var path: String = js.native
  
  /**
    * The project.
    */
  var project: TeamProjectReference = js.native
}
object Folder {
  
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: Date,
    path: String,
    project: TeamProjectReference
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
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
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
