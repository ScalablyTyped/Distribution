package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deleted extends StObject {
  
  var deleted: scala.Double
  
  var edited: scala.Double
  
  var restored: scala.Double
  
  var visited: scala.Double
}
object Deleted {
  
  inline def apply(deleted: scala.Double, edited: scala.Double, restored: scala.Double, visited: scala.Double): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  
  extension [Self <: Deleted](x: Self) {
    
    inline def setDeleted(value: scala.Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setEdited(value: scala.Double): Self = StObject.set(x, "edited", value.asInstanceOf[js.Any])
    
    inline def setRestored(value: scala.Double): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    
    inline def setVisited(value: scala.Double): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
  }
}
