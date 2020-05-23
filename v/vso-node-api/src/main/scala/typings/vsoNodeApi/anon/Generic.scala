package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generic extends js.Object {
  var generic: scala.Double
  var serviceHost: scala.Double
  var teamProject: scala.Double
}

object Generic {
  @scala.inline
  def apply(generic: scala.Double, serviceHost: scala.Double, teamProject: scala.Double): Generic = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generic]
  }
}

