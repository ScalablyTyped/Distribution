package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: Double
  var deleted: Double
  var modified: Double
}

object AnonAdded {
  @scala.inline
  def apply(added: Double, deleted: Double, modified: Double): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdded]
  }
}

