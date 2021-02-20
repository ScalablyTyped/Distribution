package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns a five-level taxonomy of the content. The top three categories are returned. Supported languages: Arabic, English, French, German, Italian, Japanese, Korean, Portuguese, Spanish. */
@js.native
trait CategoriesOptions extends StObject {
  
  /** Maximum number of categories to return. */
  var limit: js.UndefOr[Double] = js.native
  
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the standard categories model. */
  var model: js.UndefOr[String] = js.native
}
object CategoriesOptions {
  
  @scala.inline
  def apply(): CategoriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesOptions]
  }
  
  @scala.inline
  implicit class CategoriesOptionsMutableBuilder[Self <: CategoriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
