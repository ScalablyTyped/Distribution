package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  var any: scala.Double
  var file: scala.Double
  var folder: scala.Double
}

object Anon_Any {
  @scala.inline
  def apply(any: scala.Double, file: scala.Double, folder: scala.Double): Anon_Any = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("any")(any)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("folder")(folder)
    __obj.asInstanceOf[Anon_Any]
  }
}

