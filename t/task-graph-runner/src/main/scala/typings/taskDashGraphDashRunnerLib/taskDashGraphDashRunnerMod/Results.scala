package typings
package taskDashGraphDashRunnerLib.taskDashGraphDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results[Item, Result] extends js.Object {
  var safe: scala.Boolean
  var values: stdLib.Map[Item, Result]
}

object Results {
  @scala.inline
  def apply[Item, Result](safe: scala.Boolean, values: stdLib.Map[Item, Result]): Results[Item, Result] = {
    val __obj = js.Dynamic.literal(safe = safe, values = values)
  
    __obj.asInstanceOf[Results[Item, Result]]
  }
}

