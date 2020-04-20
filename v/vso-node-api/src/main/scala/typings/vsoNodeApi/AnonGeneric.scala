package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeneric extends js.Object {
  var generic: Double
  var serviceHost: Double
  var teamProject: Double
}

object AnonGeneric {
  @scala.inline
  def apply(generic: Double, serviceHost: Double, teamProject: Double): AnonGeneric = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeneric]
  }
}

