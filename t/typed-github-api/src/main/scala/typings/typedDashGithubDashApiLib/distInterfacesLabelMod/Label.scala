package typings
package typedDashGithubDashApiLib.distInterfacesLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var color: java.lang.String
  var default: scala.Boolean
  var id: scala.Double
  var name: java.lang.String
}

object Label {
  @scala.inline
  def apply(color: java.lang.String, default: scala.Boolean, id: scala.Double, name: java.lang.String): Label = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Label]
  }
}

