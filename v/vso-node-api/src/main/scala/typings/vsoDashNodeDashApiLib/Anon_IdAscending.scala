package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdAscending extends js.Object {
  var idAscending: scala.Double
  var idDescending: scala.Double
  var nameAscending: scala.Double
  var nameDescending: scala.Double
}

object Anon_IdAscending {
  @scala.inline
  def apply(
    idAscending: scala.Double,
    idDescending: scala.Double,
    nameAscending: scala.Double,
    nameDescending: scala.Double
  ): Anon_IdAscending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("idAscending")(idAscending)
    __obj.updateDynamic("idDescending")(idDescending)
    __obj.updateDynamic("nameAscending")(nameAscending)
    __obj.updateDynamic("nameDescending")(nameDescending)
    __obj.asInstanceOf[Anon_IdAscending]
  }
}

