package typings.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: String
  var string: String
}

object Offset {
  @scala.inline
  def apply(offset: String, string: String): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

