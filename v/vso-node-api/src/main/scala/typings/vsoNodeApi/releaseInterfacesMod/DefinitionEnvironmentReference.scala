package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionEnvironmentReference extends js.Object {
  var definitionEnvironmentId: Double = js.native
  var definitionEnvironmentName: String = js.native
  var releaseDefinitionId: Double = js.native
  var releaseDefinitionName: String = js.native
}

object DefinitionEnvironmentReference {
  @scala.inline
  def apply(
    definitionEnvironmentId: Double,
    definitionEnvironmentName: String,
    releaseDefinitionId: Double,
    releaseDefinitionName: String
  ): DefinitionEnvironmentReference = {
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], definitionEnvironmentName = definitionEnvironmentName.asInstanceOf[js.Any], releaseDefinitionId = releaseDefinitionId.asInstanceOf[js.Any], releaseDefinitionName = releaseDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
  @scala.inline
  implicit class DefinitionEnvironmentReferenceOps[Self <: DefinitionEnvironmentReference] (val x: Self) extends AnyVal {
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
    def setDefinitionEnvironmentId(value: Double): Self = this.set("definitionEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionEnvironmentName(value: String): Self = this.set("definitionEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinitionId(value: Double): Self = this.set("releaseDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDefinitionName(value: String): Self = this.set("releaseDefinitionName", value.asInstanceOf[js.Any])
  }
  
}

