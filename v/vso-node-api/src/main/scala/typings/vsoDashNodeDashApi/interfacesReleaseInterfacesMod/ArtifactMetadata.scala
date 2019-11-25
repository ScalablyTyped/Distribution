package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactMetadata extends js.Object {
  /**
    * Sets alias of artifact.
    */
  var alias: String
  /**
    * Sets instance reference of artifact. e.g. for build artifact it is build number.
    */
  var instanceReference: BuildVersion
}

object ArtifactMetadata {
  @scala.inline
  def apply(alias: String, instanceReference: BuildVersion): ArtifactMetadata = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], instanceReference = instanceReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactMetadata]
  }
}

