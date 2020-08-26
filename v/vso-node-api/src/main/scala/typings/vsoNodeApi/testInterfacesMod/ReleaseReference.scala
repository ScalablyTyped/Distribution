package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseReference extends js.Object {
  var definitionId: Double = js.native
  var environmentDefinitionId: Double = js.native
  var environmentDefinitionName: String = js.native
  var environmentId: Double = js.native
  var environmentName: String = js.native
  var id: Double = js.native
  var name: String = js.native
}

object ReleaseReference {
  @scala.inline
  def apply(
    definitionId: Double,
    environmentDefinitionId: Double,
    environmentDefinitionName: String,
    environmentId: Double,
    environmentName: String,
    id: Double,
    name: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any], environmentDefinitionName = environmentDefinitionName.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
  @scala.inline
  implicit class ReleaseReferenceOps[Self <: ReleaseReference] (val x: Self) extends AnyVal {
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
    def setDefinitionId(value: Double): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentDefinitionId(value: Double): Self = this.set("environmentDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentDefinitionName(value: String): Self = this.set("environmentDefinitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: Double): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: String): Self = this.set("environmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

