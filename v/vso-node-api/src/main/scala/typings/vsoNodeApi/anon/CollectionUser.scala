package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionUser extends StObject {
  
  var collection_User: scala.Double
  
  var project_Team: scala.Double
}
object CollectionUser {
  
  inline def apply(collection_User: scala.Double, project_Team: scala.Double): CollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUser]
  }
  
  extension [Self <: CollectionUser](x: Self) {
    
    inline def setCollection_User(value: scala.Double): Self = StObject.set(x, "collection_User", value.asInstanceOf[js.Any])
    
    inline def setProject_Team(value: scala.Double): Self = StObject.set(x, "project_Team", value.asInstanceOf[js.Any])
  }
}
