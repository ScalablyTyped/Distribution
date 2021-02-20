package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleted extends StObject {
  
  var deleted: scala.Double = js.native
  
  var edited: scala.Double = js.native
  
  var restored: scala.Double = js.native
  
  var visited: scala.Double = js.native
}
object Deleted {
  
  @scala.inline
  def apply(deleted: scala.Double, edited: scala.Double, restored: scala.Double, visited: scala.Double): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  
  @scala.inline
  implicit class DeletedMutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: scala.Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdited(value: scala.Double): Self = StObject.set(x, "edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestored(value: scala.Double): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisited(value: scala.Double): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
  }
}
