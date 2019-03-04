package typings
package twixLib.twixMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  def afterMoment(date: java.lang.String): java.lang.String
  def beforeMoment(date: java.lang.String): java.lang.String
}

object Duration {
  @scala.inline
  def apply(
    afterMoment: js.Function1[java.lang.String, java.lang.String],
    beforeMoment: js.Function1[java.lang.String, java.lang.String]
  ): Duration = {
    val __obj = js.Dynamic.literal(afterMoment = afterMoment, beforeMoment = beforeMoment)
  
    __obj.asInstanceOf[Duration]
  }
}

