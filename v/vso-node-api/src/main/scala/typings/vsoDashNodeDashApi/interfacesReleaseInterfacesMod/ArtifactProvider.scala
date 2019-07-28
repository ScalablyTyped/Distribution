package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, name = name, sourceUri = sourceUri, version = version)
  
    __obj.asInstanceOf[ArtifactProvider]
  }
}

