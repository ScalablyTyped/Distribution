package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SysStats extends js.Object {
  var cpu: Double
  var external: Double
  var heapTotal: Double
  var heapUsed: Double
  var rss: Double
}

object SysStats {
  @scala.inline
  def apply(cpu: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): SysStats = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SysStats]
  }
}

