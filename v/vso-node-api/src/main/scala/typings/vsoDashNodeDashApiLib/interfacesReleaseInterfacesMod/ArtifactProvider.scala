package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactProvider extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var sourceUri: java.lang.String
  var version: java.lang.String
}

object ArtifactProvider {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, sourceUri: java.lang.String, version: java.lang.String): ArtifactProvider = {
    val __obj = js.Dynamic.literal(id = id, name = name, sourceUri = sourceUri, version = version)
  
    __obj.asInstanceOf[ArtifactProvider]
  }
}

