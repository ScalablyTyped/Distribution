package typings.styledDashComponents.styledDashComponentsMod

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

