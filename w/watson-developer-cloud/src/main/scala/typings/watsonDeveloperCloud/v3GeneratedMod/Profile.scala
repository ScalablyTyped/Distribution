package typings.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Profile. */
trait Profile extends StObject {
  
  /** For JSON content that is timestamped, detailed results about the social behavior disclosed by the input in terms of temporal characteristics. The results include information about the distribution of the content over the days of the week and the hours of the day. */
  var behavior: js.UndefOr[js.Array[Behavior]] = js.undefined
  
  /** If the **consumption_preferences** parameter is `true`, detailed results for each category of consumption preferences. Each element of the array provides information inferred from the input text for the individual preferences of that category. */
  var consumption_preferences: js.UndefOr[js.Array[ConsumptionPreferencesCategory]] = js.undefined
  
  /** Detailed results for the Needs characteristics inferred from the input text. */
  var needs: js.Array[Trait]
  
  /** A recursive array of `Trait` objects that provides detailed results for the Big Five personality characteristics (dimensions and facets) inferred from the input text. */
  var personality: js.Array[Trait]
  
  /** The language model that was used to process the input. */
  var processed_language: String
  
  /** Detailed results for the Values characteristics inferred from the input text. */
  var values: js.Array[Trait]
  
  /** Warning messages associated with the input text submitted with the request. The array is empty if the input generated no warnings. */
  var warnings: js.Array[Warning]
  
  /** The number of words from the input that were used to produce the profile. */
  var word_count: Double
  
  /** When guidance is appropriate, a string that provides a message that indicates the number of words found and where that value falls in the range of required or suggested number of words. */
  var word_count_message: js.UndefOr[String] = js.undefined
}
object Profile {
  
  inline def apply(
    needs: js.Array[Trait],
    personality: js.Array[Trait],
    processed_language: String,
    values: js.Array[Trait],
    warnings: js.Array[Warning],
    word_count: Double
  ): Profile = {
    val __obj = js.Dynamic.literal(needs = needs.asInstanceOf[js.Any], personality = personality.asInstanceOf[js.Any], processed_language = processed_language.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], word_count = word_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setBehavior(value: js.Array[Behavior]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setBehaviorVarargs(value: Behavior*): Self = StObject.set(x, "behavior", js.Array(value :_*))
    
    inline def setConsumption_preferences(value: js.Array[ConsumptionPreferencesCategory]): Self = StObject.set(x, "consumption_preferences", value.asInstanceOf[js.Any])
    
    inline def setConsumption_preferencesUndefined: Self = StObject.set(x, "consumption_preferences", js.undefined)
    
    inline def setConsumption_preferencesVarargs(value: ConsumptionPreferencesCategory*): Self = StObject.set(x, "consumption_preferences", js.Array(value :_*))
    
    inline def setNeeds(value: js.Array[Trait]): Self = StObject.set(x, "needs", value.asInstanceOf[js.Any])
    
    inline def setNeedsVarargs(value: Trait*): Self = StObject.set(x, "needs", js.Array(value :_*))
    
    inline def setPersonality(value: js.Array[Trait]): Self = StObject.set(x, "personality", value.asInstanceOf[js.Any])
    
    inline def setPersonalityVarargs(value: Trait*): Self = StObject.set(x, "personality", js.Array(value :_*))
    
    inline def setProcessed_language(value: String): Self = StObject.set(x, "processed_language", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Trait]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Trait*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    inline def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    
    inline def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
    
    inline def setWord_count_message(value: String): Self = StObject.set(x, "word_count_message", value.asInstanceOf[js.Any])
    
    inline def setWord_count_messageUndefined: Self = StObject.set(x, "word_count_message", js.undefined)
  }
}
