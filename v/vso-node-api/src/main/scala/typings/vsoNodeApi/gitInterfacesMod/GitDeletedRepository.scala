package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitDeletedRepository extends StObject {
  
  var createdDate: js.Date
  
  var deletedBy: IdentityRef
  
  var deletedDate: js.Date
  
  var id: String
  
  var name: String
  
  var project: TeamProjectReference
}
object GitDeletedRepository {
  
  inline def apply(
    createdDate: js.Date,
    deletedBy: IdentityRef,
    deletedDate: js.Date,
    id: String,
    name: String,
    project: TeamProjectReference
  ): GitDeletedRepository = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitDeletedRepository]
  }
  
  extension [Self <: GitDeletedRepository](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDeletedBy(value: IdentityRef): Self = StObject.set(x, "deletedBy", value.asInstanceOf[js.Any])
    
    inline def setDeletedDate(value: js.Date): Self = StObject.set(x, "deletedDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
