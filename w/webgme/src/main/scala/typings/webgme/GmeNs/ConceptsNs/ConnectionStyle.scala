package typings.webgme.GmeNs.ConceptsNs

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
    val __obj = js.Dynamic.literal(endArrow = endArrow, startArrow = startArrow)
  
    __obj.asInstanceOf[ConnectionStyle]
  }
}

