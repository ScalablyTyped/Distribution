package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironmentDefinitionReference extends js.Object {
  var definitionId: Double = js.native
  var environmentDefinitionId: Double = js.native
}

object ReleaseEnvironmentDefinitionReference {
  @scala.inline
  def apply(definitionId: Double, environmentDefinitionId: Double): ReleaseEnvironmentDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentDefinitionReference]
  }
  @scala.inline
  implicit class ReleaseEnvironmentDefinitionReferenceOps[Self <: ReleaseEnvironmentDefinitionReference] (val x: Self) extends AnyVal {
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
  }
  
}

