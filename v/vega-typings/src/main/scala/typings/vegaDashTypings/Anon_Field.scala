package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.BaseValueRef
import typings.vegaDashTypings.typesSpecEncodeMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field
  extends BaseValueRef[js.Any] {
  var field: Field
}

object Anon_Field {
  @scala.inline
  def apply(field: Field): Anon_Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Field]
  }
}

