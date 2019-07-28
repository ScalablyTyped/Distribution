package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionEnvironmentSummary extends js.Object {
  var id: Double
  var lastReleases: js.Array[ReleaseShallowReference]
  var name: String
}

object ReleaseDefinitionEnvironmentSummary {
  @scala.inline
  def apply(id: Double, lastReleases: js.Array[ReleaseShallowReference], name: String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id, lastReleases = lastReleases, name = name)
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
}

