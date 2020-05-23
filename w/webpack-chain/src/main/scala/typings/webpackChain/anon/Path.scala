package typings.webpackChain.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: String
  var request: String
}

object Path {
  @scala.inline
  def apply(path: String, request: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

