package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The leading sentences in a section or subsection of the input document. */
@js.native
trait LeadingSentence extends StObject {
  
  /** An array of `location` objects that lists the locations of detected leading sentences. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.native
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  
  /** The text of the leading sentence. */
  var text: js.UndefOr[String] = js.native
}
object LeadingSentence {
  
  @scala.inline
  def apply(): LeadingSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeadingSentence]
  }
  
  @scala.inline
  implicit class LeadingSentenceMutableBuilder[Self <: LeadingSentence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement_locations(value: js.Array[ElementLocations]): Self = StObject.set(x, "element_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement_locationsUndefined: Self = StObject.set(x, "element_locations", js.undefined)
    
    @scala.inline
    def setElement_locationsVarargs(value: ElementLocations*): Self = StObject.set(x, "element_locations", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
