package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAccessor[Link] extends js.Object {
  def getSourceIndex(l: Link): Double
  def getTargetIndex(l: Link): Double
}

object LinkAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
  
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
}

