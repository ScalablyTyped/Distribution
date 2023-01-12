package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuggestResult extends StObject {
  
  /**
    * Represents the toponym in a user-friendly way.
    */
  var displayName: String
  
  /**
    * Array of ranges for highlighting to show which part of the result matched the query.
    * The range for highlighting is an array of two numbers: the indexes of the starting and ending symbols of the range.
    */
  var hl: js.Array[js.Array[Double]]
  
  var `type`: String
  
  /**
    * Represents the value which should be inserted into the search field after the user selects the suggestion.
    */
  var value: String
}
object ISuggestResult {
  
  inline def apply(displayName: String, hl: js.Array[js.Array[Double]], `type`: String, value: String): ISuggestResult = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], hl = hl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISuggestResult] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHl(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlVarargs(value: js.Array[Double]*): Self = StObject.set(x, "hl", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
