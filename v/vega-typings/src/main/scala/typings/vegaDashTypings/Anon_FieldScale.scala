package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.Field
import typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldScale
  extends ScaledValueRef[js.Any] {
  var field: Field
  var scale: Field
}

object Anon_FieldScale {
  @scala.inline
  def apply(field: Field, scale: Field): Anon_FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FieldScale]
  }
}

