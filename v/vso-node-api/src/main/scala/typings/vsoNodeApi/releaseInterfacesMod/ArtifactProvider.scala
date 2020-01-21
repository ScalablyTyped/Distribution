package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactProvider extends js.Object {
  var id: Double
  var name: String
  var sourceUri: String
  var version: String
}

object ArtifactProvider {
  @scala.inline
  def apply(id: Double, name: String, sourceUri: String, version: String): ArtifactProvider = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactProvider]
  }
}

