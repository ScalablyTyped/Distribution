package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contribution extends ContributionBase {
  
  /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
  var constraints: js.Array[ContributionConstraint] = js.native
  
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String] = js.native
  
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any = js.native
  
  /**
    * List of demanded claims in order for the user to see this contribution (like anonymous, public, member...).
    */
  var restrictedTo: js.Array[String] = js.native
  
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String] = js.native
  
  /**
    * Id of the Contribution Type
    */
  var `type`: String = js.native
}
object Contribution {
  
  @scala.inline
  def apply(
    constraints: js.Array[ContributionConstraint],
    description: String,
    id: String,
    includes: js.Array[String],
    properties: js.Any,
    restrictedTo: js.Array[String],
    targets: js.Array[String],
    `type`: String,
    visibleTo: js.Array[String]
  ): Contribution = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contribution]
  }
  
  @scala.inline
  implicit class ContributionOps[Self <: Contribution] (val x: Self) extends AnyVal {
    
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
    def setConstraintsVarargs(value: ContributionConstraint*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[ContributionConstraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesVarargs(value: String*): Self = this.set("includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: js.Array[String]): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedToVarargs(value: String*): Self = this.set("restrictedTo", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedTo(value: js.Array[String]): Self = this.set("restrictedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
