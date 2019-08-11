package typings.atWordpressViewport

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimported_actions extends js.Object {
  def setIsMatching(values: Record[String, Boolean]): Unit
}

object Typeofimported_actions {
  @scala.inline
  def apply(setIsMatching: Record[String, Boolean] => Unit): Typeofimported_actions = {
    val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1(setIsMatching))
  
    __obj.asInstanceOf[Typeofimported_actions]
  }
}

