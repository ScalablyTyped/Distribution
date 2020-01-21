package typings.subsume.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResults extends js.Object {
  var data: Map[String, String]
  var rest: String
}

object ParseResults {
  @scala.inline
  def apply(data: Map[String, String], rest: String): ParseResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseResults]
  }
}

