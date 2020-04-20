package typings.webpackChain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: String
  var request: String
}

object AnonPath {
  @scala.inline
  def apply(path: String, request: String): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
}

