package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponents extends js.Object {
  /**
    * Routing path (keys) from origin and file-path 
    * (values) to custom REST components.
    * Use the RestRouterGenerator plugin to generate 
    * a template router (see the generated file for more info).
    *   config.rest.components = {};
    */
  var components: js.Any
}

object AnonComponents {
  @scala.inline
  def apply(components: js.Any): AnonComponents = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponents]
  }
}

