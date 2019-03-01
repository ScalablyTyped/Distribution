package typings
package atUifabricStylingLib.libInterfacesISpacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpacing extends js.Object {
  var l1: java.lang.String
  var l2: java.lang.String
  var m: java.lang.String
  var s1: java.lang.String
  var s2: java.lang.String
}

object ISpacing {
  @scala.inline
  def apply(
    l1: java.lang.String,
    l2: java.lang.String,
    m: java.lang.String,
    s1: java.lang.String,
    s2: java.lang.String
  ): ISpacing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("l1")(l1)
    __obj.updateDynamic("l2")(l2)
    __obj.updateDynamic("m")(m)
    __obj.updateDynamic("s1")(s1)
    __obj.updateDynamic("s2")(s2)
    __obj.asInstanceOf[ISpacing]
  }
}

