package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release definition.
    */
  var _links: js.Any
  /**
    * Gets the unique identifier of release definition.
    */
  var id: scala.Double
  /**
    * Gets or sets the name of the release definition.
    */
  var name: java.lang.String
  /**
    * Gets the REST API url to access the release definition.
    */
  var url: java.lang.String
}

object ReleaseDefinitionShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: scala.Double, name: java.lang.String, url: java.lang.String): ReleaseDefinitionShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, name = name, url = url)
  
    __obj.asInstanceOf[ReleaseDefinitionShallowReference]
  }
}

