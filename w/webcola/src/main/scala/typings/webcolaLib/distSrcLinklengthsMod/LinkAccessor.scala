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
  def apply[Link](getSourceIndex: Link => scala.Double, getTargetIndex: Link => scala.Double): LinkAccessor[Link] = {
    val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
  
    __obj.asInstanceOf[LinkAccessor[Link]]
  }
}

