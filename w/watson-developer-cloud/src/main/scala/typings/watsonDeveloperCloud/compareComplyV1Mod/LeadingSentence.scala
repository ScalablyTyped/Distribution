package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The leading sentences in a section or subsection of the input document. */
trait LeadingSentence extends StObject {
  
  /** An array of `location` objects that lists the locations of detected leading sentences. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The text of the leading sentence. */
  var text: js.UndefOr[String] = js.undefined
}
object LeadingSentence {
  
  inline def apply(): LeadingSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeadingSentence]
  }
  
  extension [Self <: LeadingSentence](x: Self) {
    
    inline def setElement_locations(value: js.Array[ElementLocations]): Self = StObject.set(x, "element_locations", value.asInstanceOf[js.Any])
    
    inline def setElement_locationsUndefined: Self = StObject.set(x, "element_locations", js.undefined)
    
    inline def setElement_locationsVarargs(value: ElementLocations*): Self = StObject.set(x, "element_locations", js.Array(value*))
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
