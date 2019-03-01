package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifact extends js.Object {
  /**
    * The artifact ID.
    */
  var id: scala.Double
  /**
    * The name of the artifact.
    */
  var name: java.lang.String
  /**
    * The actual resource.
    */
  var resource: ArtifactResource
}

object BuildArtifact {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, resource: ArtifactResource): BuildArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[BuildArtifact]
  }
}

