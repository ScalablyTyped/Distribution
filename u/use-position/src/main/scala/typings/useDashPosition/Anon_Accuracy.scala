package typings.useDashPosition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: js.UndefOr[Double] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    errorMessage: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    timestamp: Int | Double = null
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

