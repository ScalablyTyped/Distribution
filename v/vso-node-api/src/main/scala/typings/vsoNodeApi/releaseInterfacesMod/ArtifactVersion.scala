package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactVersion extends js.Object {
  var alias: String
  var defaultVersion: BuildVersion
  var errorMessage: String
  var sourceId: String
  var versions: js.Array[BuildVersion]
}

object ArtifactVersion {
  @scala.inline
  def apply(
    alias: String,
    defaultVersion: BuildVersion,
    errorMessage: String,
    sourceId: String,
    versions: js.Array[BuildVersion]
  ): ArtifactVersion = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersion]
  }
}

