package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdAscending extends js.Object {
  var idAscending: scala.Double
  var idDescending: scala.Double
  var nameAscending: scala.Double
  var nameDescending: scala.Double
}

object IdAscending {
  @scala.inline
  def apply(
    idAscending: scala.Double,
    idDescending: scala.Double,
    nameAscending: scala.Double,
    nameDescending: scala.Double
  ): IdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAscending]
  }
}

