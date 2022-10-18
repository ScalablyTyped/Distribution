package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AlignedElement. */
trait AlignedElement extends StObject {
  
  /** Identifies two elements that semantically align between the compared documents. */
  var element_pair: js.UndefOr[js.Array[ElementPair]] = js.undefined
  
  /** Specifies whether the aligned element is identical. Elements are considered identical despite minor differences such as leading punctuation, end-of-sentence punctuation, whitespace, the presence or absence of definite or indefinite articles, and others. */
  var identical_text: js.UndefOr[Boolean] = js.undefined
  
  /** One or more hashed values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates that the elements aligned are contractual clauses of significance. */
  var significant_elements: js.UndefOr[Boolean] = js.undefined
}
object AlignedElement {
  
  inline def apply(): AlignedElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignedElement]
  }
  
  extension [Self <: AlignedElement](x: Self) {
    
    inline def setElement_pair(value: js.Array[ElementPair]): Self = StObject.set(x, "element_pair", value.asInstanceOf[js.Any])
    
    inline def setElement_pairUndefined: Self = StObject.set(x, "element_pair", js.undefined)
    
    inline def setElement_pairVarargs(value: ElementPair*): Self = StObject.set(x, "element_pair", js.Array(value*))
    
    inline def setIdentical_text(value: Boolean): Self = StObject.set(x, "identical_text", value.asInstanceOf[js.Any])
    
    inline def setIdentical_textUndefined: Self = StObject.set(x, "identical_text", js.undefined)
    
    inline def setProvenance_ids(value: js.Array[String]): Self = StObject.set(x, "provenance_ids", value.asInstanceOf[js.Any])
    
    inline def setProvenance_idsUndefined: Self = StObject.set(x, "provenance_ids", js.undefined)
    
    inline def setProvenance_idsVarargs(value: String*): Self = StObject.set(x, "provenance_ids", js.Array(value*))
    
    inline def setSignificant_elements(value: Boolean): Self = StObject.set(x, "significant_elements", value.asInstanceOf[js.Any])
    
    inline def setSignificant_elementsUndefined: Self = StObject.set(x, "significant_elements", js.undefined)
  }
}
