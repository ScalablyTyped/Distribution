package typings.webcola.powergraphMod

import typings.webcola.linklengthsMod.LinkAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTypeAccessor[Link] extends LinkAccessor[Link] {
  def getType(l: Link): Double
}

object LinkTypeAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, getType: Link => Double): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
}

