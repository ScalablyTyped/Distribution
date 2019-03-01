package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: scala.Double
  var job: scala.Double
}

object Anon_Container {
  @scala.inline
  def apply(container: scala.Double, job: scala.Double): Anon_Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("job")(job)
    __obj.asInstanceOf[Anon_Container]
  }
}

