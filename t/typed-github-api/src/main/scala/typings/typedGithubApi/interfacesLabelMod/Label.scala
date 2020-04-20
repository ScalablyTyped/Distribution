package typings.typedGithubApi.interfacesLabelMod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

