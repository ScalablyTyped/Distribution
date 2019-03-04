package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactMetadata extends js.Object {
  /**
    * Sets alias of artifact.
    */
  var alias: java.lang.String
  /**
    * Sets instance reference of artifact. e.g. for build artifact it is build number.
    */
  var instanceReference: BuildVersion
}

object ArtifactMetadata {
  @scala.inline
  def apply(alias: java.lang.String, instanceReference: BuildVersion): ArtifactMetadata = {
    val __obj = js.Dynamic.literal(alias = alias, instanceReference = instanceReference)
  
    __obj.asInstanceOf[ArtifactMetadata]
  }
}

