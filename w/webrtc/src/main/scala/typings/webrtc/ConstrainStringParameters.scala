package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainStringParameters extends js.Object {
  var exact: js.UndefOr[String | js.Array[String]] = js.undefined
  var ideal: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ConstrainStringParameters {
  @scala.inline
  def apply(exact: String | js.Array[String] = null, ideal: String | js.Array[String] = null): ConstrainStringParameters = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainStringParameters]
  }
}

