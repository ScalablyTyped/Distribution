package typings.updateDashNotifier.updateDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var name: String
  var version: String
}

object Package {
  @scala.inline
  def apply(name: String, version: String): Package = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[Package]
  }
}

