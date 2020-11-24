package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleted extends js.Object {
  
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
  implicit class DeletedOps[Self <: Deleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeleted(value: scala.Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdited(value: scala.Double): Self = this.set("edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestored(value: scala.Double): Self = this.set("restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisited(value: scala.Double): Self = this.set("visited", value.asInstanceOf[js.Any])
  }
}
