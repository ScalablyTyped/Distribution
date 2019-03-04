package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  var failed: scala.Double
  var finished: scala.Double
  var passed: scala.Double
}

object Results {
  @scala.inline
  def apply(failed: scala.Double, finished: scala.Double, passed: scala.Double): Results = {
    val __obj = js.Dynamic.literal(failed = failed, finished = finished, passed = passed)
  
    __obj.asInstanceOf[Results]
  }
}

