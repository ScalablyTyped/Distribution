package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactSourceReference extends js.Object {
  var id: String
  var name: String
}

object ArtifactSourceReference {
  @scala.inline
  def apply(id: String, name: String): ArtifactSourceReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceReference]
  }
}

