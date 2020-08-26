package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContribution extends js.Object {
  /**
    * Description of the contribution/type
    */
  var description: String = js.native
  /**
    * Fully qualified identifier of the contribution/type
    */
  var id: String = js.native
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String] = js.native
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any = js.native
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String] = js.native
  /**
    * Id of the Contribution Type
    */
  var `type`: String = js.native
}

object ClientContribution {
  @scala.inline
  def apply(
    description: String,
    id: String,
    includes: js.Array[String],
    properties: js.Any,
    targets: js.Array[String],
    `type`: String
  ): ClientContribution = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContribution]
  }
  @scala.inline
  implicit class ClientContributionOps[Self <: ClientContribution] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludesVarargs(value: String*): Self = this.set("includes", js.Array(value :_*))
    @scala.inline
    def setIncludes(value: js.Array[String]): Self = this.set("includes", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

