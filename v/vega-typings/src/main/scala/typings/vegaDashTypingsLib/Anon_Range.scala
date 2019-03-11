package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Range
  extends vegaDashTypingsLib.typesSpecEncodeMod.ScaledValueRef[js.Any] {
  var range: scala.Double | scala.Boolean
  var scale: vegaDashTypingsLib.typesSpecEncodeMod.Field
}

object Anon_Range {
  @scala.inline
  def apply(range: scala.Double | scala.Boolean, scale: vegaDashTypingsLib.typesSpecEncodeMod.Field): Anon_Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Range]
  }
}

