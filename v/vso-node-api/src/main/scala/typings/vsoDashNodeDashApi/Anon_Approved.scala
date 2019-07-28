package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approved extends js.Object {
  var approved: Double
  var created: Double
  var deleted: Double
  var rejected: Double
}

object Anon_Approved {
  @scala.inline
  def apply(approved: Double, created: Double, deleted: Double, rejected: Double): Anon_Approved = {
    val __obj = js.Dynamic.literal(approved = approved, created = created, deleted = deleted, rejected = rejected)
  
    __obj.asInstanceOf[Anon_Approved]
  }
}

