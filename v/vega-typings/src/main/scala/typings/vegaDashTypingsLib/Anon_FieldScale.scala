package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldScale
  extends vegaDashTypingsLib.typesSpecEncodeMod.ScaledValueRef[js.Any] {
  var field: vegaDashTypingsLib.typesSpecEncodeMod.Field
  var scale: vegaDashTypingsLib.typesSpecEncodeMod.Field
}

object Anon_FieldScale {
  @scala.inline
  def apply(
    field: vegaDashTypingsLib.typesSpecEncodeMod.Field,
    scale: vegaDashTypingsLib.typesSpecEncodeMod.Field
  ): Anon_FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldScale]
  }
}

