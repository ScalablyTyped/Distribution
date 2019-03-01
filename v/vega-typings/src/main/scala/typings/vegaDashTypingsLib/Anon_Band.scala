package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Band
  extends vegaDashTypingsLib.typesSpecEncodeMod._ScaledValueRef[js.Any] {
  var band: scala.Boolean | scala.Double
  var scale: vegaDashTypingsLib.typesSpecEncodeMod.Field
}

object Anon_Band {
  @scala.inline
  def apply(band: scala.Boolean | scala.Double, scale: vegaDashTypingsLib.typesSpecEncodeMod.Field): Anon_Band = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("band")(band.asInstanceOf[js.Any])
    __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Band]
  }
}

