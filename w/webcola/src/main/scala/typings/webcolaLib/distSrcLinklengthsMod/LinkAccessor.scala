package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAccessor[Link] extends js.Object {
  def getSourceIndex(l: Link): scala.Double
  def getTargetIndex(l: Link): scala.Double
}

object LinkAccessor {
  @scala.inline
  def apply[Link](getSourceIndex: js.Function1[Link, scala.Double], getTargetIndex: js.Function1[Link, scala.Double]): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceIndex")(getSourceIndex)
    __obj.updateDynamic("getTargetIndex")(getTargetIndex)
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
}

