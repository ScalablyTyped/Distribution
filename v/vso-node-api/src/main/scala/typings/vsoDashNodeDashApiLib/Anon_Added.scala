package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: scala.Double
  var deleted: scala.Double
  var modified: scala.Double
}

object Anon_Added {
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double, modified: scala.Double): Anon_Added = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("modified")(modified)
    __obj.asInstanceOf[Anon_Added]
  }
}

