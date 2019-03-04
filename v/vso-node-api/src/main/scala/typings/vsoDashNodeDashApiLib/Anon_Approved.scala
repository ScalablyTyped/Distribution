package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approved extends js.Object {
  var approved: scala.Double
  var created: scala.Double
  var deleted: scala.Double
  var rejected: scala.Double
}

object Anon_Approved {
  @scala.inline
  def apply(approved: scala.Double, created: scala.Double, deleted: scala.Double, rejected: scala.Double): Anon_Approved = {
    val __obj = js.Dynamic.literal(approved = approved, created = created, deleted = deleted, rejected = rejected)
  
    __obj.asInstanceOf[Anon_Approved]
  }
}

