package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironmentSummary extends js.Object {
  var id: scala.Double
  var lastReleases: js.Array[ReleaseShallowReference]
  var name: java.lang.String
}

object ReleaseDefinitionEnvironmentSummary {
  @scala.inline
  def apply(id: scala.Double, lastReleases: js.Array[ReleaseShallowReference], name: java.lang.String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id, lastReleases = lastReleases, name = name)
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
}

