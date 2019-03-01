package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLengthAccessor[Link] extends LinkAccessor[Link] {
  def setLength(l: Link, value: scala.Double): scala.Unit
}

object LinkLengthAccessor {
  @scala.inline
  def apply[Link](
    getSourceIndex: js.Function1[Link, scala.Double],
    getTargetIndex: js.Function1[Link, scala.Double],
    setLength: js.Function2[Link, scala.Double, scala.Unit]
  ): LinkLengthAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceIndex")(getSourceIndex)
    __obj.updateDynamic("getTargetIndex")(getTargetIndex)
    __obj.updateDynamic("setLength")(setLength)
    __obj.asInstanceOf[LinkLengthAccessor[Link]]
  }
}

