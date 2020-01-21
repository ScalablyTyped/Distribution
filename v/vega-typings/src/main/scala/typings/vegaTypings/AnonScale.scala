package typings.vegaTypings

import typings.vegaTypings.encodeMod.Field
import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScale
  extends ScaledValueRef[js.Any] {
  var scale: Field
  var value: Boolean | Double | String | Null
}

object AnonScale {
  @scala.inline
  def apply(scale: Field, value: Boolean | Double | String = null): AnonScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScale]
  }
}

