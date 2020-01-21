package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnableCustomConstraints extends js.Object {
  // GmeClasses.Core;
  /**
    * If true will enable validation (which takes place on the server) 
    * of custom constraints defined in the meta nodes.
    *   config.core.enableCustomConstraints = false;
    */
  var enableCustomConstraints: Boolean
}

object AnonEnableCustomConstraints {
  @scala.inline
  def apply(enableCustomConstraints: Boolean): AnonEnableCustomConstraints = {
    val __obj = js.Dynamic.literal(enableCustomConstraints = enableCustomConstraints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnableCustomConstraints]
  }
}

