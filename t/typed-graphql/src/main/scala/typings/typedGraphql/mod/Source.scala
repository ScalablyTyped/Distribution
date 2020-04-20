package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/source.js
trait Source extends js.Object {
  var body: String
  var name: String
}

object Source {
  @scala.inline
  def apply(body: String, name: String): Source = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

