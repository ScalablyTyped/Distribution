package typings.typedDashGithubDashApi.distInterfacesLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var color: String
  var default: Boolean
  var id: Double
  var name: String
}

object Label {
  @scala.inline
  def apply(color: String, default: Boolean, id: Double, name: String): Label = {
    val __obj = js.Dynamic.literal(color = color, default = default, id = id, name = name)
  
    __obj.asInstanceOf[Label]
  }
}

