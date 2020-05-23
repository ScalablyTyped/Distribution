package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inprogress extends js.Object {
  var completed: scala.Double
  var failed: scala.Double
  var inprogress: scala.Double
  var skipped: scala.Double
}

object Inprogress {
  @scala.inline
  def apply(completed: scala.Double, failed: scala.Double, inprogress: scala.Double, skipped: scala.Double): Inprogress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inprogress = inprogress.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inprogress]
  }
}

