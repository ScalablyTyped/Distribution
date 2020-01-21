package typings.vegaTypings

import typings.vegaTypings.encodeMod.LinearGradient
import typings.vegaTypings.encodeMod.RadialGradient
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueLinearGradient extends _ColorValueRef {
  var value: LinearGradient | RadialGradient
}

object AnonValueLinearGradient {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): AnonValueLinearGradient = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueLinearGradient]
  }
}

