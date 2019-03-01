package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiTagDefinition extends js.Object {
  /**
    * Whether or not the tag definition is active.
    */
  var active: scala.Boolean
  /**
    * ID of the tag definition.
    */
  var id: java.lang.String
  /**
    * The name of the tag definition.
    */
  var name: java.lang.String
  /**
    * Resource URL for the Tag Definition.
    */
  var url: java.lang.String
}

object WebApiTagDefinition {
  @scala.inline
  def apply(active: scala.Boolean, id: java.lang.String, name: java.lang.String, url: java.lang.String): WebApiTagDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebApiTagDefinition]
  }
}

