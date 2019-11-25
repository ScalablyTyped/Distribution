package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deleted extends js.Object {
  var deleted: Double
  var edited: Double
  var restored: Double
  var visited: Double
}

object Anon_Deleted {
  @scala.inline
  def apply(deleted: Double, edited: Double, restored: Double, visited: Double): Anon_Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Deleted]
  }
}

