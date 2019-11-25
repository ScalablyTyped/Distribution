package typings.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStyle extends js.Object {
  var endArrow: String
  var startArrow: String
}

object ConnectionStyle {
  @scala.inline
  def apply(endArrow: String, startArrow: String): ConnectionStyle = {
    val __obj = js.Dynamic.literal(endArrow = endArrow.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStyle]
  }
}

