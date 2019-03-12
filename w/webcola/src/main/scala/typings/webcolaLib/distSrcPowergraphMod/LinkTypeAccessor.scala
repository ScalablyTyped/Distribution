package typings
package webcolaLib.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTypeAccessor[Link]
  extends webcolaLib.distSrcLinklengthsMod.LinkAccessor[Link] {
  def getType(l: Link): scala.Double
}

object LinkTypeAccessor {
  @scala.inline
  def apply[Link](
    getSourceIndex: Link => scala.Double,
    getTargetIndex: Link => scala.Double,
    getType: Link => scala.Double
  ): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
  
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
}

