package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release.
    */
  var _links: js.Any
  /**
    * Gets the unique identifier of release.
    */
  var id: Double
  /**
    * Gets or sets the name of the release.
    */
  var name: String
  /**
    * Gets the REST API url to access the release.
    */
  var url: String
}

object ReleaseShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseShallowReference]
  }
}

