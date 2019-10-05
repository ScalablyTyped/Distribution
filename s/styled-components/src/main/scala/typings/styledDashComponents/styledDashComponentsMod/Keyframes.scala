package typings.styledDashComponents.styledDashComponentsMod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes extends _InterpolationValue {
  def getName(): String
}

object Keyframes {
  @scala.inline
  def apply(getName: () => String): Keyframes = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[Keyframes]
  }
}

@JSImport("styled-components", "keyframes")
@js.native
object keyframes extends js.Object {
  def apply(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def apply(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

