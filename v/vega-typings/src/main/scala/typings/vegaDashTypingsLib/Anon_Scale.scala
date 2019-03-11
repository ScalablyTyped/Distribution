package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scale
  extends vegaDashTypingsLib.typesSpecEncodeMod.ScaledValueRef[js.Any] {
  var scale: vegaDashTypingsLib.typesSpecEncodeMod.Field
  var value: scala.Boolean | scala.Double | java.lang.String | scala.Null
}

object Anon_Scale {
  @scala.inline
  def apply(
    scale: vegaDashTypingsLib.typesSpecEncodeMod.Field,
    value: scala.Boolean | scala.Double | java.lang.String = null
  ): Anon_Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scale]
  }
}

