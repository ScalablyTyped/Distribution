package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  var groups: js.Array[Group]
  
  /**
    * The id for the layout node.
    */
  var id: String
  
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean
}
object Section {
  
  inline def apply(groups: js.Array[Group], id: String, overridden: Boolean): Section = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setGroups(value: js.Array[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
  }
}
