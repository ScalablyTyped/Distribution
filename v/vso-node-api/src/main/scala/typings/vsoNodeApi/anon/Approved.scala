package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Approved extends js.Object {
  var approved: scala.Double
  var created: scala.Double
  var deleted: scala.Double
  var rejected: scala.Double
}

object Approved {
  @scala.inline
  def apply(approved: scala.Double, created: scala.Double, deleted: scala.Double, rejected: scala.Double): Approved = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approved]
  }
}

