package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.GradientLinear
import typings.vegaDashTypings.typesSpecEncodeMod.GradientRadial
import typings.vegaDashTypings.typesSpecEncodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueGradientLinear extends _ColorValueRef {
  var value: GradientLinear | GradientRadial
}

object Anon_ValueGradientLinear {
  @scala.inline
  def apply(value: GradientLinear | GradientRadial): Anon_ValueGradientLinear = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ValueGradientLinear]
  }
}

