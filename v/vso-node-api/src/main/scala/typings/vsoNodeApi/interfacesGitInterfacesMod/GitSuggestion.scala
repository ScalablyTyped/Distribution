package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitSuggestion extends StObject {
  
  /**
    * Specific properties describing the suggestion.
    */
  var properties: StringDictionary[Any]
  
  /**
    * The type of suggestion (e.g. pull request).
    */
  var `type`: String
}
object GitSuggestion {
  
  inline def apply(properties: StringDictionary[Any], `type`: String): GitSuggestion = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitSuggestion] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
