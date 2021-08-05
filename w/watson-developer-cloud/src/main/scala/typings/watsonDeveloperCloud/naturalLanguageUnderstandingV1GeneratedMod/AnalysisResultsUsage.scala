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
  
  inline def apply(): AnalysisResultsUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsUsage]
  }
  
  extension [Self <: AnalysisResultsUsage](x: Self) {
    
    inline def setFeatures(value: Double): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setText_characters(value: Double): Self = StObject.set(x, "text_characters", value.asInstanceOf[js.Any])
    
    inline def setText_charactersUndefined: Self = StObject.set(x, "text_characters", js.undefined)
    
    inline def setText_units(value: Double): Self = StObject.set(x, "text_units", value.asInstanceOf[js.Any])
    
    inline def setText_unitsUndefined: Self = StObject.set(x, "text_units", js.undefined)
  }
}
