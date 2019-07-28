package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.Field
import typings.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Range
  extends ScaledValueRef[js.Any] {
  var range: Double | Boolean
  var scale: Field
}

object Anon_Range {
  @scala.inline
  def apply(range: Double | Boolean, scale: Field): Anon_Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Range]
  }
}

