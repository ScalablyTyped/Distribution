package typings.twix.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  def afterMoment(date: String): String
  def beforeMoment(date: String): String
}

object Duration {
  @scala.inline
  def apply(afterMoment: String => String, beforeMoment: String => String): Duration = {
    val __obj = js.Dynamic.literal(afterMoment = js.Any.fromFunction1(afterMoment), beforeMoment = js.Any.fromFunction1(beforeMoment))
  
    __obj.asInstanceOf[Duration]
  }
}

