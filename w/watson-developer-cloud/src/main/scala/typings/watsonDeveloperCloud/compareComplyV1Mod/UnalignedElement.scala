package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Element that does not align semantically between two compared documents. */
trait UnalignedElement extends StObject {
  
  /** List of document attributes. */
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[CategoryComparison]] = js.undefined
  
  /** The label assigned to the document by the value of the `file_1_label` or `file_2_label` parameters on the **Compare two documents** method. */
  var document_label: js.UndefOr[String] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The text of the element. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabelComparison]] = js.undefined
}
object UnalignedElement {
  
  @scala.inline
  def apply(): UnalignedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnalignedElement]
  }
  
  @scala.inline
  implicit class UnalignedElementMutableBuilder[Self <: UnalignedElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[CategoryComparison]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: CategoryComparison*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDocument_label(value: String): Self = StObject.set(x, "document_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_labelUndefined: Self = StObject.set(x, "document_label", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[TypeLabelComparison]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: TypeLabelComparison*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
