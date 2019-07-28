package typings.webcola.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
  def setLength(l: Link, value: Double): Unit
}

object LinkLengthAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, setLength: (Link, Double) => Unit): LinkLengthAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2(setLength))
  
    __obj.asInstanceOf[LinkLengthAccessor[Link]]
  }
}

