package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainStringParameters extends js.Object {
  var exact: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ideal: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ConstrainStringParameters {
  @scala.inline
  def apply(
    exact: java.lang.String | js.Array[java.lang.String] = null,
    ideal: java.lang.String | js.Array[java.lang.String] = null
  ): ConstrainStringParameters = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainStringParameters]
  }
}

