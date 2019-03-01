package typings
package webgmeLib.GmeNs.ConceptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStyle extends js.Object {
  var endArrow: java.lang.String
  var startArrow: java.lang.String
}

object ConnectionStyle {
  @scala.inline
  def apply(endArrow: java.lang.String, startArrow: java.lang.String): ConnectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endArrow")(endArrow)
    __obj.updateDynamic("startArrow")(startArrow)
    __obj.asInstanceOf[ConnectionStyle]
  }
}

