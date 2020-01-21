package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
  def getMinSeparation(l: Link): Double
}

object LinkSepAccessor {
  @scala.inline
  def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
  
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
}

