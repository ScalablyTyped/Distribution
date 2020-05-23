package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Added extends js.Object {
  var added: scala.Double
  var deleted: scala.Double
  var modified: scala.Double
}

object Added {
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double, modified: scala.Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
}

