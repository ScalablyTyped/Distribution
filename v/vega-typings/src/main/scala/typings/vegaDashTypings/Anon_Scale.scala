package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.Field
import typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scale
  extends ScaledValueRef[js.Any] {
  var scale: Field
  var value: Boolean | Double | String | Null
}

object Anon_Scale {
  @scala.inline
  def apply(scale: Field, value: Boolean | Double | String = null): Anon_Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scale]
  }
}

