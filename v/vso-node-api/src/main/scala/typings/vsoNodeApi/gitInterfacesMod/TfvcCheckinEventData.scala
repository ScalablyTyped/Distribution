package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcCheckinEventData extends StObject {
  
  var changeset: TfvcChangeset
  
  var project: TeamProjectReference
}
object TfvcCheckinEventData {
  
  inline def apply(changeset: TfvcChangeset, project: TeamProjectReference): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
  
  extension [Self <: TfvcCheckinEventData](x: Self) {
    
    inline def setChangeset(value: TfvcChangeset): Self = StObject.set(x, "changeset", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
