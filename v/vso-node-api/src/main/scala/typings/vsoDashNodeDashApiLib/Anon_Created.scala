package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: scala.Double
  var pendingUpload: scala.Double
}

object Anon_Created {
  @scala.inline
  def apply(created: scala.Double, pendingUpload: scala.Double): Anon_Created = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("pendingUpload")(pendingUpload)
    __obj.asInstanceOf[Anon_Created]
  }
}

