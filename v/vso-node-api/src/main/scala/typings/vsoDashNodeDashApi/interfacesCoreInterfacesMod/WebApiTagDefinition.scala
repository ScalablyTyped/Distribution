package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTagDefinition extends js.Object {
  /**
    * Whether or not the tag definition is active.
    */
  var active: Boolean
  /**
    * ID of the tag definition.
    */
  var id: String
  /**
    * The name of the tag definition.
    */
  var name: String
  /**
    * Resource URL for the Tag Definition.
    */
  var url: String
}

object WebApiTagDefinition {
  @scala.inline
  def apply(active: Boolean, id: String, name: String, url: String): WebApiTagDefinition = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebApiTagDefinition]
  }
}

