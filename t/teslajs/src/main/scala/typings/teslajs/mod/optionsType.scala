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
  def apply(authToken: String, vehicleID: String, carIndex: js.UndefOr[Double] = js.undefined): optionsType = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
    if (!js.isUndefined(carIndex)) __obj.updateDynamic("carIndex")(carIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsType]
  }
}

