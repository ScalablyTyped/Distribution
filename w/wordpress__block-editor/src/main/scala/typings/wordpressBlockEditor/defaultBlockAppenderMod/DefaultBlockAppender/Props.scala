package typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var lastBlockClientId: String
  var rootClientId: String
}

object Props {
  @scala.inline
  def apply(lastBlockClientId: String, rootClientId: String): Props = {
    val __obj = js.Dynamic.literal(lastBlockClientId = lastBlockClientId.asInstanceOf[js.Any], rootClientId = rootClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

