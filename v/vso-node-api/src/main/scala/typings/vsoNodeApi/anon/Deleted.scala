package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deleted extends js.Object {
  var deleted: scala.Double
  var edited: scala.Double
  var restored: scala.Double
  var visited: scala.Double
}

object Deleted {
  @scala.inline
  def apply(deleted: scala.Double, edited: scala.Double, restored: scala.Double, visited: scala.Double): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
}

