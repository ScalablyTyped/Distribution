package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A monetary amount identified in the input document. */
trait ContractAmts extends StObject {
  
  /** The confidence level in the identification of the contract amount. */
  var confidence_level: js.UndefOr[String] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The monetary amount. */
  var text: js.UndefOr[String] = js.undefined
}
object ContractAmts {
  
  inline def apply(): ContractAmts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractAmts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractAmts] (val x: Self) extends AnyVal {
    
    inline def setConfidence_level(value: String): Self = StObject.set(x, "confidence_level", value.asInstanceOf[js.Any])
    
    inline def setConfidence_levelUndefined: Self = StObject.set(x, "confidence_level", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
