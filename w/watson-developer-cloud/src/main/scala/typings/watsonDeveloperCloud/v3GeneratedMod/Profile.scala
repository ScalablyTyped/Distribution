package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Profile. */
@js.native
trait Profile extends js.Object {
  
  /** For JSON content that is timestamped, detailed results about the social behavior disclosed by the input in terms of temporal characteristics. The results include information about the distribution of the content over the days of the week and the hours of the day. */
  var behavior: js.UndefOr[js.Array[Behavior]] = js.native
  
  /** If the **consumption_preferences** parameter is `true`, detailed results for each category of consumption preferences. Each element of the array provides information inferred from the input text for the individual preferences of that category. */
  var consumption_preferences: js.UndefOr[js.Array[ConsumptionPreferencesCategory]] = js.native
  
  /** Detailed results for the Needs characteristics inferred from the input text. */
  var needs: js.Array[Trait] = js.native
  
  /** A recursive array of `Trait` objects that provides detailed results for the Big Five personality characteristics (dimensions and facets) inferred from the input text. */
  var personality: js.Array[Trait] = js.native
  
  /** The language model that was used to process the input. */
  var processed_language: String = js.native
  
  /** Detailed results for the Values characteristics inferred from the input text. */
  var values: js.Array[Trait] = js.native
  
  /** Warning messages associated with the input text submitted with the request. The array is empty if the input generated no warnings. */
  var warnings: js.Array[Warning] = js.native
  
  /** The number of words from the input that were used to produce the profile. */
  var word_count: Double = js.native
  
  /** When guidance is appropriate, a string that provides a message that indicates the number of words found and where that value falls in the range of required or suggested number of words. */
  var word_count_message: js.UndefOr[String] = js.native
}
object Profile {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNeedsVarargs(value: Trait*): Self = this.set("needs", js.Array(value :_*))
    
    @scala.inline
    def setNeeds(value: js.Array[Trait]): Self = this.set("needs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalityVarargs(value: Trait*): Self = this.set("personality", js.Array(value :_*))
    
    @scala.inline
    def setPersonality(value: js.Array[Trait]): Self = this.set("personality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessed_language(value: String): Self = this.set("processed_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Trait*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Trait]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Warning]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord_count(value: Double): Self = this.set("word_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorVarargs(value: Behavior*): Self = this.set("behavior", js.Array(value :_*))
    
    @scala.inline
    def setBehavior(value: js.Array[Behavior]): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    
    @scala.inline
    def setConsumption_preferencesVarargs(value: ConsumptionPreferencesCategory*): Self = this.set("consumption_preferences", js.Array(value :_*))
    
    @scala.inline
    def setConsumption_preferences(value: js.Array[ConsumptionPreferencesCategory]): Self = this.set("consumption_preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumption_preferences: Self = this.set("consumption_preferences", js.undefined)
    
    @scala.inline
    def setWord_count_message(value: String): Self = this.set("word_count_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWord_count_message: Self = this.set("word_count_message", js.undefined)
  }
}
