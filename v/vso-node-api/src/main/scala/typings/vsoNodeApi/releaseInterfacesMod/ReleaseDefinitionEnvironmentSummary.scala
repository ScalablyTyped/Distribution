package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastReleases = lastReleases.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
}

