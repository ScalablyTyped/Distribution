package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ToneCategory. */
trait ToneCategory extends StObject {
  
  /** The unique, non-localized identifier of the category for the results. The service can return results for the following category IDs: `emotion_tone`, `language_tone`, and `social_tone`. */
  var category_id: String
  
  /** The user-visible, localized name of the category. */
  var category_name: String
  
  /** An array of `ToneScore` objects that provides the results for the tones of the category. */
  var tones: js.Array[ToneScore]
}
object ToneCategory {
  
  @scala.inline
  def apply(category_id: String, category_name: String, tones: js.Array[ToneScore]): ToneCategory = {
    val __obj = js.Dynamic.literal(category_id = category_id.asInstanceOf[js.Any], category_name = category_name.asInstanceOf[js.Any], tones = tones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneCategory]
  }
  
  @scala.inline
  implicit class ToneCategoryMutableBuilder[Self <: ToneCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory_id(value: String): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory_name(value: String): Self = StObject.set(x, "category_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTones(value: js.Array[ToneScore]): Self = StObject.set(x, "tones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTonesVarargs(value: ToneScore*): Self = StObject.set(x, "tones", js.Array(value :_*))
  }
}
