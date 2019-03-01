package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatumFieldRef extends _Field {
  var datum: Field
}

object DatumFieldRef {
  @scala.inline
  def apply(datum: Field): DatumFieldRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumFieldRef]
  }
}

