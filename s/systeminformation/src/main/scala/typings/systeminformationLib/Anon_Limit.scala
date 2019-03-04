package typings
package systeminformationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: scala.Double
  var max_usage: scala.Double
  var stats: Anon_Activeanon
  var usage: scala.Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: scala.Double, max_usage: scala.Double, stats: Anon_Activeanon, usage: scala.Double): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit, max_usage = max_usage, stats = stats, usage = usage)
  
    __obj.asInstanceOf[Anon_Limit]
  }
}

