package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldScale
  extends ScaledValueRef[js.Any] {
  var field: typings.vegaTypings.encodeMod.Field
  var scale: typings.vegaTypings.encodeMod.Field
}

object FieldScale {
  @scala.inline
  def apply(field: typings.vegaTypings.encodeMod.Field, scale: typings.vegaTypings.encodeMod.Field): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
}

