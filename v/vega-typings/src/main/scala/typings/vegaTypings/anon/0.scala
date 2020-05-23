package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.LinearGradient
import typings.vegaTypings.encodeMod.RadialGradient
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends _ColorValueRef {
  var value: LinearGradient | RadialGradient
}

object `0` {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

