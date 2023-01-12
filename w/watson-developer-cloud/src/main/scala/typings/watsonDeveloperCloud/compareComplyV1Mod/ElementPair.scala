package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details of semantically aligned elements. */
trait ElementPair extends StObject {
  
  /** List of document attributes. */
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[CategoryComparison]] = js.undefined
  
  /** The label of the document (that is, the value of either the `file_1_label` or `file_2_label` parameters) in which the element occurs. */
  var document_label: js.UndefOr[String] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The contents of the element. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabelComparison]] = js.undefined
}
object ElementPair {
  
  inline def apply(): ElementPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementPair] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCategories(value: js.Array[CategoryComparison]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: CategoryComparison*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDocument_label(value: String): Self = StObject.set(x, "document_label", value.asInstanceOf[js.Any])
    
    inline def setDocument_labelUndefined: Self = StObject.set(x, "document_label", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTypes(value: js.Array[TypeLabelComparison]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: TypeLabelComparison*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
