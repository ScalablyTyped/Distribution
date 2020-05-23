package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale
  extends ScaledValueRef[js.Any] {
  var scale: typings.vegaTypings.encodeMod.Field
  var value: Boolean | Double | String | Null
}

object Scale {
  @scala.inline
  def apply(scale: typings.vegaTypings.encodeMod.Field, value: Boolean | Double | String = null): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

