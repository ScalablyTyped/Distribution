package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The leading sentences in a section or subsection of the input document. */
@js.native
trait LeadingSentence extends js.Object {
  
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
  implicit class LeadingSentenceOps[Self <: LeadingSentence] (val x: Self) extends AnyVal {
    
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
    def setElement_locationsVarargs(value: ElementLocations*): Self = this.set("element_locations", js.Array(value :_*))
    
    @scala.inline
    def setElement_locations(value: js.Array[ElementLocations]): Self = this.set("element_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement_locations: Self = this.set("element_locations", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
