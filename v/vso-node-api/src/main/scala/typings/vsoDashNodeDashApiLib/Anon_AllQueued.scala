package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllQueued extends js.Object {
  var all: scala.Double
  var queued: scala.Double
  var running: scala.Double
}

object Anon_AllQueued {
  @scala.inline
  def apply(all: scala.Double, queued: scala.Double, running: scala.Double): Anon_AllQueued = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("queued")(queued)
    __obj.updateDynamic("running")(running)
    __obj.asInstanceOf[Anon_AllQueued]
  }
}

