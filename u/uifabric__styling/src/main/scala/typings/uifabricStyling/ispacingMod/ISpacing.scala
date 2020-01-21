package typings.uifabricStyling.ispacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpacing extends js.Object {
  var l1: String
  var l2: String
  var m: String
  var s1: String
  var s2: String
}

object ISpacing {
  @scala.inline
  def apply(l1: String, l2: String, m: String, s1: String, s2: String): ISpacing = {
    val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpacing]
  }
}

