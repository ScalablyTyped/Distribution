package typings.wordpressViewport

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedActions extends js.Object {
  def setIsMatching(values: Record[String, Boolean]): Unit
}

object TypeofimportedActions {
  @scala.inline
  def apply(setIsMatching: Record[String, Boolean] => Unit): TypeofimportedActions = {
    val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1(setIsMatching))
  
    __obj.asInstanceOf[TypeofimportedActions]
  }
}

