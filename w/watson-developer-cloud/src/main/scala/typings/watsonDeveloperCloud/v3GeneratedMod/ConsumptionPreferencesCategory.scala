package typings.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ConsumptionPreferencesCategory. */
trait ConsumptionPreferencesCategory extends StObject {
  
  /** The unique, non-localized identifier of the consumption preferences category to which the results pertain. IDs have the form `consumption_preferences_{category}`. */
  var consumption_preference_category_id: String
  
  /** Detailed results inferred from the input text for the individual preferences of the category. */
  var consumption_preferences: js.Array[ConsumptionPreferences]
  
  /** The user-visible name of the consumption preferences category. */
  var name: String
}
object ConsumptionPreferencesCategory {
  
  inline def apply(
    consumption_preference_category_id: String,
    consumption_preferences: js.Array[ConsumptionPreferences],
    name: String
  ): ConsumptionPreferencesCategory = {
    val __obj = js.Dynamic.literal(consumption_preference_category_id = consumption_preference_category_id.asInstanceOf[js.Any], consumption_preferences = consumption_preferences.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumptionPreferencesCategory]
  }
  
  extension [Self <: ConsumptionPreferencesCategory](x: Self) {
    
    inline def setConsumption_preference_category_id(value: String): Self = StObject.set(x, "consumption_preference_category_id", value.asInstanceOf[js.Any])
    
    inline def setConsumption_preferences(value: js.Array[ConsumptionPreferences]): Self = StObject.set(x, "consumption_preferences", value.asInstanceOf[js.Any])
    
    inline def setConsumption_preferencesVarargs(value: ConsumptionPreferences*): Self = StObject.set(x, "consumption_preferences", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
