package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var failed: Double
  var finished: Double
  var passed: Double
}

object Results {
  @scala.inline
  def apply(failed: Double, finished: Double, passed: Double): Results = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

