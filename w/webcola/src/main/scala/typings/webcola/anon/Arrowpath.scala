package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arrowpath extends js.Object {
  var arrowpath: String
  var routepath: String
}

object Arrowpath {
  @scala.inline
  def apply(arrowpath: String, routepath: String): Arrowpath = {
    val __obj = js.Dynamic.literal(arrowpath = arrowpath.asInstanceOf[js.Any], routepath = routepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrowpath]
  }
}

