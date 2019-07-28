package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.Field
import typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Band
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double
  var scale: Field
}

object Anon_Band {
  @scala.inline
  def apply(band: Boolean | Double, scale: Field): Anon_Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Band]
  }
}

