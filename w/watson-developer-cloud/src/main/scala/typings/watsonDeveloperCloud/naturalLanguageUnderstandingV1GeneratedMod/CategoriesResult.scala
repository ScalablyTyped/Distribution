package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A categorization of the analyzed text. */
@js.native
trait CategoriesResult extends StObject {
  
  /** The path to the category through the 5-level taxonomy hierarchy. For the complete list of categories, see the [Categories hierarchy](https://cloud.ibm.com/docs/services/natural-language-understanding/categories.html#categories-hierarchy) documentation. */
  var label: js.UndefOr[String] = js.native
  
  /** Confidence score for the category classification. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.native
}
object CategoriesResult {
  
  @scala.inline
  def apply(): CategoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesResult]
  }
  
  @scala.inline
  implicit class CategoriesResultMutableBuilder[Self <: CategoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
