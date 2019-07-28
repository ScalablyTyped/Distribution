package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release environment.
    */
  var _links: js.Any
  /**
    * Gets the unique identifier of release environment.
    */
  var id: Double
  /**
    * Gets or sets the name of the release environment.
    */
  var name: String
  /**
    * Gets the REST API url to access the release environment.
    */
  var url: String
}

object ReleaseEnvironmentShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseEnvironmentShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links, id = id, name = name, url = url)
  
    __obj.asInstanceOf[ReleaseEnvironmentShallowReference]
  }
}

