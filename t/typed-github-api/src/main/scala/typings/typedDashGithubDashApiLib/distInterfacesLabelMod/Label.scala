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
    val __obj = js.Dynamic.literal(color = color, default = default, id = id, name = name)
  
    __obj.asInstanceOf[Label]
  }
}

