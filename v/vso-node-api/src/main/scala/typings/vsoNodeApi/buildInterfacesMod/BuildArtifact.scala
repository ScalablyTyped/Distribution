package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArtifact extends js.Object {
  /**
    * The artifact ID.
    */
  var id: Double
  /**
    * The name of the artifact.
    */
  var name: String
  /**
    * The actual resource.
    */
  var resource: ArtifactResource
}

object BuildArtifact {
  @scala.inline
  def apply(id: Double, name: String, resource: ArtifactResource): BuildArtifact = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifact]
  }
}

