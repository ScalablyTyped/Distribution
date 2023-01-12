package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionConstraint extends StObject {
  
  /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND'd together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR'd (only one group needs to evaluate to True for the contribution to be included).
    */
  var group: Double
  
  /**
    * Fully qualified identifier of a shared constraint
    */
  var id: String
  
  /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
  var inverse: Boolean
  
  /**
    * Name of the IContributionFilter plugin
    */
  var name: String
  
  /**
    * Properties that are fed to the contribution filter class
    */
  var properties: Any
  
  /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
  var relationships: js.Array[String]
}
object ContributionConstraint {
  
  inline def apply(
    group: Double,
    id: String,
    inverse: Boolean,
    name: String,
    properties: Any,
    relationships: js.Array[String]
  ): ContributionConstraint = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContributionConstraint] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRelationships(value: js.Array[String]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsVarargs(value: String*): Self = StObject.set(x, "relationships", js.Array(value*))
  }
}
