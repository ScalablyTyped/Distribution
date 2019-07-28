package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableCustomConstraints extends js.Object {
  // GmeClasses.Core;
  /**
    * If true will enable validation (which takes place on the server) 
    * of custom constraints defined in the meta nodes.
    *   config.core.enableCustomConstraints = false;
    */
  var enableCustomConstraints: Boolean
}

object Anon_EnableCustomConstraints {
  @scala.inline
  def apply(enableCustomConstraints: Boolean): Anon_EnableCustomConstraints = {
    val __obj = js.Dynamic.literal(enableCustomConstraints = enableCustomConstraints)
  
    __obj.asInstanceOf[Anon_EnableCustomConstraints]
  }
}

