package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactResource extends js.Object {
  var _links: js.Any
  /**
    * Type-specific data about the artifact.
    */
  var data: java.lang.String
  /**
    * A link to download the resource.
    */
  var downloadUrl: java.lang.String
  /**
    * Type-specific properties of the artifact.
    */
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The type of the resource: File container, version control folder, UNC path, etc.
    */
  var `type`: java.lang.String
  /**
    * The full http link to the resource.
    */
  var url: java.lang.String
}

object ArtifactResource {
  @scala.inline
  def apply(
    _links: js.Any,
    data: java.lang.String,
    downloadUrl: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: java.lang.String,
    url: java.lang.String
  ): ArtifactResource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("downloadUrl")(downloadUrl)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ArtifactResource]
  }
}

