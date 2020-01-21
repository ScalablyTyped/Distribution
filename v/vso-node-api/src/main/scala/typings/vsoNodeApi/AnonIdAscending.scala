package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdAscending extends js.Object {
  var idAscending: Double
  var idDescending: Double
  var nameAscending: Double
  var nameDescending: Double
}

object AnonIdAscending {
  @scala.inline
  def apply(idAscending: Double, idDescending: Double, nameAscending: Double, nameDescending: Double): AnonIdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdAscending]
  }
}

