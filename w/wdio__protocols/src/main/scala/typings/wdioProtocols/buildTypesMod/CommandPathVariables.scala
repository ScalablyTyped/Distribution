package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandPathVariables extends StObject {
  
  var description: String
  
  var name: String
  
  /**
    * the following are given for path variables, we should still define
    * it as values are populated automatically
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CommandPathVariables {
  
  inline def apply(description: String, name: String): CommandPathVariables = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandPathVariables]
  }
  
  extension [Self <: CommandPathVariables](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
