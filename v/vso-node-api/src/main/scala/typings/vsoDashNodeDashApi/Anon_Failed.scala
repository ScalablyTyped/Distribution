package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failed extends js.Object {
  var failed: Double
  var succeeded: Double
  var unknown: Double
}

object Anon_Failed {
  @scala.inline
  def apply(failed: Double, succeeded: Double, unknown: Double): Anon_Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Failed]
  }
}

