package typings.stripe.anon

import typings.stripe.stripeStrings.exact
import typings.stripe.stripeStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Earliest extends StObject {
  
  /**
    * If type is "exact", date will be the expected delivery date in the format YYYY-MM-DD
    */
  var date: String
  
  /**
    * If type is "range", earliest will be be the earliest delivery date in the format YYYY-MM-DD
    */
  var earliest: String
  
  /**
    * If type is "range", latest will be the latest delivery date in the format YYYY-MM-DD
    */
  var latest: String
  
  /**
    * The type of estimate. Must be either "range" or "exact"
    */
  var `type`: range | exact
}
object Earliest {
  
  inline def apply(date: String, earliest: String, latest: String, `type`: range | exact): Earliest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], earliest = earliest.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Earliest]
  }
  
  extension [Self <: Earliest](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEarliest(value: String): Self = StObject.set(x, "earliest", value.asInstanceOf[js.Any])
    
    inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setType(value: range | exact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
