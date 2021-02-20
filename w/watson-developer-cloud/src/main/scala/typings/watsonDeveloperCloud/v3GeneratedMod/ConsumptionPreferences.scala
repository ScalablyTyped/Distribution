package typings.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ConsumptionPreferences. */
@js.native
trait ConsumptionPreferences extends StObject {
  
  /** The unique, non-localized identifier of the consumption preference to which the results pertain. IDs have the form `consumption_preferences_{preference}`. */
  var consumption_preference_id: String = js.native
  
  /** The user-visible, localized name of the consumption preference. */
  var name: String = js.native
  
  /** The score for the consumption preference: * `0.0`: Unlikely * `0.5`: Neutral * `1.0`: Likely The scores for some preferences are binary and do not allow a neutral value. The score is an indication of preference based on the results inferred from the input text, not a normalized percentile. */
  var score: Double = js.native
}
object ConsumptionPreferences {
  
  @scala.inline
  def apply(consumption_preference_id: String, name: String, score: Double): ConsumptionPreferences = {
    val __obj = js.Dynamic.literal(consumption_preference_id = consumption_preference_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumptionPreferences]
  }
  
  @scala.inline
  implicit class ConsumptionPreferencesMutableBuilder[Self <: ConsumptionPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumption_preference_id(value: String): Self = StObject.set(x, "consumption_preference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
