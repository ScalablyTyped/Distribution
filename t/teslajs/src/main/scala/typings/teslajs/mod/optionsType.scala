package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait optionsType extends js.Object {
  var authToken: String
  var carIndex: js.UndefOr[Double] = js.undefined
  var vehicleID: String
}

object optionsType {
  @scala.inline
  def apply(authToken: String, vehicleID: String, carIndex: Int | Double = null): optionsType = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
    if (carIndex != null) __obj.updateDynamic("carIndex")(carIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsType]
  }
}

