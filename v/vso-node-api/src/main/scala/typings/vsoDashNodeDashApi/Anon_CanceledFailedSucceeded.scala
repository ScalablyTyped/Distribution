package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFailedSucceeded extends js.Object {
  var canceled: Double
  var failed: Double
  var succeeded: Double
}

object Anon_CanceledFailedSucceeded {
  @scala.inline
  def apply(canceled: Double, failed: Double, succeeded: Double): Anon_CanceledFailedSucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CanceledFailedSucceeded]
  }
}

