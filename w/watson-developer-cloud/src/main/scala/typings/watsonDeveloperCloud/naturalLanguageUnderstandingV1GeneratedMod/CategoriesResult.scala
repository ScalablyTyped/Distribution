package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A categorization of the analyzed text. */
trait CategoriesResult extends StObject {
  
  /** The path to the category through the 5-level taxonomy hierarchy. For the complete list of categories, see the [Categories hierarchy](https://cloud.ibm.com/docs/services/natural-language-understanding/categories.html#categories-hierarchy) documentation. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Confidence score for the category classification. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.undefined
}
object CategoriesResult {
  
  inline def apply(): CategoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoriesResult] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
