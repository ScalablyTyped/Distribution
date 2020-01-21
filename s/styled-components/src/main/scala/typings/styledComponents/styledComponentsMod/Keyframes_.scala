package typings.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes_ extends _InterpolationValue {
  def getName(): String
}

object Keyframes_ {
  @scala.inline
  def apply(getName: () => String): Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[Keyframes_]
  }
}

