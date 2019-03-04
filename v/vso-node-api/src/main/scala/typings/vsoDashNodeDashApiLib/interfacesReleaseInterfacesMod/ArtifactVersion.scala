package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactVersion extends js.Object {
  var alias: java.lang.String
  var defaultVersion: BuildVersion
  var errorMessage: java.lang.String
  var sourceId: java.lang.String
  var versions: js.Array[BuildVersion]
}

object ArtifactVersion {
  @scala.inline
  def apply(
    alias: java.lang.String,
    defaultVersion: BuildVersion,
    errorMessage: java.lang.String,
    sourceId: java.lang.String,
    versions: js.Array[BuildVersion]
  ): ArtifactVersion = {
    val __obj = js.Dynamic.literal(alias = alias, defaultVersion = defaultVersion, errorMessage = errorMessage, sourceId = sourceId, versions = versions)
  
    __obj.asInstanceOf[ArtifactVersion]
  }
}

