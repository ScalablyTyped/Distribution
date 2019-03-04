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
    getSourceIndex: js.Function1[Link, scala.Double],
    getTargetIndex: js.Function1[Link, scala.Double],
    getType: js.Function1[Link, scala.Double]
  ): LinkTypeAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = getSourceIndex, getTargetIndex = getTargetIndex, getType = getType)
  
    __obj.asInstanceOf[LinkTypeAccessor[Link]]
  }
}

