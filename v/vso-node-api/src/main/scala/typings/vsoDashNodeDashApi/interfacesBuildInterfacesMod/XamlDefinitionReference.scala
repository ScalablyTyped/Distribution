package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XamlDefinitionReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: Double
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String
  /**
    * Full http link to the resource
    */
  var url: String
}

object XamlDefinitionReference {
  @scala.inline
  def apply(id: Double, name: String, url: String): XamlDefinitionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XamlDefinitionReference]
  }
}

