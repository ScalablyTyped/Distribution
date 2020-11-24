package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionEnvironmentSummary extends js.Object {
  
  var id: Double = js.native
  
  var lastReleases: js.Array[ReleaseShallowReference] = js.native
  
  var name: String = js.native
}
object ReleaseDefinitionEnvironmentSummary {
  
  @scala.inline
  def apply(id: Double, lastReleases: js.Array[ReleaseShallowReference], name: String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastReleases = lastReleases.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentSummaryOps[Self <: ReleaseDefinitionEnvironmentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReleasesVarargs(value: ReleaseShallowReference*): Self = this.set("lastReleases", js.Array(value :_*))
    
    @scala.inline
    def setLastReleases(value: js.Array[ReleaseShallowReference]): Self = this.set("lastReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
