package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EntityMention. */
trait EntityMention extends StObject {
  
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Entity mention text. */
  var text: js.UndefOr[String] = js.undefined
}
object EntityMention {
  
  inline def apply(): EntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMention]
  }
  
  extension [Self <: EntityMention](x: Self) {
    
    inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
