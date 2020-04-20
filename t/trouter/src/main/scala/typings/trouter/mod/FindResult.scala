package typings.trouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResult[T] extends js.Object {
  var handlers: js.Array[T]
  var params: StringDictionary[String]
}

object FindResult {
  @scala.inline
  def apply[T](handlers: js.Array[T], params: StringDictionary[String]): FindResult[T] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult[T]]
  }
}

