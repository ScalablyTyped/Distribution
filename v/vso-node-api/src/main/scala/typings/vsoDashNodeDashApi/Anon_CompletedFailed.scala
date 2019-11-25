package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedFailed extends js.Object {
  var completed: Double
  var failed: Double
  var inprogress: Double
  var skipped: Double
}

object Anon_CompletedFailed {
  @scala.inline
  def apply(completed: Double, failed: Double, inprogress: Double, skipped: Double): Anon_CompletedFailed = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inprogress = inprogress.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CompletedFailed]
  }
}

