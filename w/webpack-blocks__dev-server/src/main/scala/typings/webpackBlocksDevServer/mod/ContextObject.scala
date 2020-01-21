package typings.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextObject extends js.Object {
  var `match`: js.Any
  var parsedUrl: js.Any
  var request: js.Any
}

object ContextObject {
  @scala.inline
  def apply(`match`: js.Any, parsedUrl: js.Any, request: js.Any): ContextObject = {
    val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
}

