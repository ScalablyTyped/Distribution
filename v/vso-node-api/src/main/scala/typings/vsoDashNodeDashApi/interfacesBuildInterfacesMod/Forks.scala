package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Forks extends js.Object {
  /**
    * Indicates whether a build should use secrets when building forks of the selected repository.
    */
  var allowSecrets: Boolean
  /**
    * Indicates whether the trigger should queue builds for forks of the selected repository.
    */
  var enabled: Boolean
}

object Forks {
  @scala.inline
  def apply(allowSecrets: Boolean, enabled: Boolean): Forks = {
    val __obj = js.Dynamic.literal(allowSecrets = allowSecrets.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Forks]
  }
}

