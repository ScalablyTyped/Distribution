package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** API usage information for the request. */
trait AnalysisResultsUsage extends StObject {
  
  /** Number of features used in the API call. */
  var features: js.UndefOr[Double] = js.undefined
  
  /** Number of text characters processed. */
  var text_characters: js.UndefOr[Double] = js.undefined
  
  /** Number of 10,000-character units processed. */
  var text_units: js.UndefOr[Double] = js.undefined
}
object AnalysisResultsUsage {
  
  @scala.inline
  def apply(): AnalysisResultsUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsUsage]
  }
  
  @scala.inline
  implicit class AnalysisResultsUsageMutableBuilder[Self <: AnalysisResultsUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: Double): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setText_characters(value: Double): Self = StObject.set(x, "text_characters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_charactersUndefined: Self = StObject.set(x, "text_characters", js.undefined)
    
    @scala.inline
    def setText_units(value: Double): Self = StObject.set(x, "text_units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_unitsUndefined: Self = StObject.set(x, "text_units", js.undefined)
  }
}
