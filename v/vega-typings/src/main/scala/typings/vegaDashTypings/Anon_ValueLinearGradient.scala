package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.LinearGradient
import typings.vegaDashTypings.typesSpecEncodeMod.RadialGradient
import typings.vegaDashTypings.typesSpecEncodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueLinearGradient extends _ColorValueRef {
  var value: LinearGradient | RadialGradient
}

object Anon_ValueLinearGradient {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): Anon_ValueLinearGradient = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ValueLinearGradient]
  }
}

