package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field
  extends vegaDashTypingsLib.typesSpecEncodeMod.BaseValueRef[js.Any] {
  var field: vegaDashTypingsLib.typesSpecEncodeMod.Field
}

object Anon_Field {
  @scala.inline
  def apply(field: vegaDashTypingsLib.typesSpecEncodeMod.Field): Anon_Field = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Field]
  }
}

