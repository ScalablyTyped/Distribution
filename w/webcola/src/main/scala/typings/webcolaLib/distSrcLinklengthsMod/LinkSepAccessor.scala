package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkSepAccessor[Link] extends LinkAccessor[Link] {
  def getMinSeparation(l: Link): scala.Double
}

object LinkSepAccessor {
  @scala.inline
  def apply[Link](
    getMinSeparation: Link => scala.Double,
    getSourceIndex: Link => scala.Double,
    getTargetIndex: Link => scala.Double
  ): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
  
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
}

