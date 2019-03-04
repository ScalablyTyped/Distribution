package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Forks extends js.Object {
  /**
    * Indicates whether a build should use secrets when building forks of the selected repository.
    */
  var allowSecrets: scala.Boolean
  /**
    * Indicates whether the trigger should queue builds for forks of the selected repository.
    */
  var enabled: scala.Boolean
}

object Forks {
  @scala.inline
  def apply(allowSecrets: scala.Boolean, enabled: scala.Boolean): Forks = {
    val __obj = js.Dynamic.literal(allowSecrets = allowSecrets, enabled = enabled)
  
    __obj.asInstanceOf[Forks]
  }
}

