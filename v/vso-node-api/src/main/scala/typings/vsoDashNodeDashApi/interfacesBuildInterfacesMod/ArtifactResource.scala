package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactResource extends js.Object {
  var _links: js.Any
  /**
    * Type-specific data about the artifact.
    */
  var data: String
  /**
    * A link to download the resource.
    */
  var downloadUrl: String
  /**
    * Type-specific properties of the artifact.
    */
  var properties: StringDictionary[String]
  /**
    * The type of the resource: File container, version control folder, UNC path, etc.
    */
  var `type`: String
  /**
    * The full http link to the resource.
    */
  var url: String
}

object ArtifactResource {
  @scala.inline
  def apply(
    _links: js.Any,
    data: String,
    downloadUrl: String,
    properties: StringDictionary[String],
    `type`: String,
    url: String
  ): ArtifactResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactResource]
  }
}

