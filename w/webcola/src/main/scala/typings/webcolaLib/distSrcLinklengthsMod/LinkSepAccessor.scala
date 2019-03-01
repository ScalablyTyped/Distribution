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
    getMinSeparation: js.Function1[Link, scala.Double],
    getSourceIndex: js.Function1[Link, scala.Double],
    getTargetIndex: js.Function1[Link, scala.Double]
  ): LinkSepAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMinSeparation")(getMinSeparation)
    __obj.updateDynamic("getSourceIndex")(getSourceIndex)
    __obj.updateDynamic("getTargetIndex")(getTargetIndex)
    __obj.asInstanceOf[LinkSepAccessor[Link]]
  }
}

