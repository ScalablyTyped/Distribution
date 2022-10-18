package typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** Behavior. */
trait Behavior extends StObject {
  
  /** The category of the characteristic: `behavior` for temporal data. */
  var category: String
  
  /** The user-visible, localized name of the characteristic. */
  var name: String
  
  /** For JSON content that is timestamped, the percentage of timestamped input data that occurred during that day of the week or hour of the day. The range is 0 to 1. */
  var percentage: Double
  
  /** The unique, non-localized identifier of the characteristic to which the results pertain. IDs have the form `behavior_{value}`. */
  var trait_id: String
}
object Behavior {
  
  inline def apply(category: String, name: String, percentage: Double, trait_id: String): Behavior = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], trait_id = trait_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  
  extension [Self <: Behavior](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setTrait_id(value: String): Self = StObject.set(x, "trait_id", value.asInstanceOf[js.Any])
  }
}
