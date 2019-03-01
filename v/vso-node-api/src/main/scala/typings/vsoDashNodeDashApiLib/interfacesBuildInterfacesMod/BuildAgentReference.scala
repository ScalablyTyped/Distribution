package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildAgentReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: scala.Double
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: java.lang.String
  /**
    * Full http link to the resource
    */
  var url: java.lang.String
}

object BuildAgentReference {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, url: java.lang.String): BuildAgentReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BuildAgentReference]
  }
}

