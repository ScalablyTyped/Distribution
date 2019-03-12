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
    afterMoment: java.lang.String => java.lang.String,
    beforeMoment: java.lang.String => java.lang.String
  ): Duration = {
    val __obj = js.Dynamic.literal(afterMoment = js.Any.fromFunction1(afterMoment), beforeMoment = js.Any.fromFunction1(beforeMoment))
  
    __obj.asInstanceOf[Duration]
  }
}

