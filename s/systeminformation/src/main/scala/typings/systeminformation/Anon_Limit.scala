package typings.systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: Double
  var max_usage: Double
  var stats: Anon_Activeanon
  var usage: Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Double, max_usage: Double, stats: Anon_Activeanon, usage: Double): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit, max_usage = max_usage, stats = stats, usage = usage)
  
    __obj.asInstanceOf[Anon_Limit]
  }
}

