package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptionGroupDefinition extends StObject {
  
  /**
    * The name of the group to display in the UI.
    */
  var displayName: String
  
  /**
    * Indicates whether the group is initially displayed as expanded in the UI.
    */
  var isExpanded: Boolean
  
  /**
    * The internal name of the group.
    */
  var name: String
}
object BuildOptionGroupDefinition {
  
  inline def apply(displayName: String, isExpanded: Boolean, name: String): BuildOptionGroupDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionGroupDefinition]
  }
  
  extension [Self <: BuildOptionGroupDefinition](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
