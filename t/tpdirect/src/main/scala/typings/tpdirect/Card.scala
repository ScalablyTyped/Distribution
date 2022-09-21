package typings.tpdirect

import typings.tpdirect.tpdirectNumbers.`-1`
import typings.tpdirect.tpdirectNumbers.`0`
import typings.tpdirect.tpdirectNumbers.`1`
import typings.tpdirect.tpdirectNumbers.`2`
import typings.tpdirect.tpdirectNumbers.`3`
import typings.tpdirect.tpdirectNumbers.`4`
import typings.tpdirect.tpdirectNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<tpdirect.BaseCardInfo, 'funding' | 'type'> */
trait Card extends StObject {
  
  var funding: `-1` | `0` | `1` | `2`
  
  /**
    * Real Card
    */
  var lastfour: String
  
  var `type`: `1` | `2` | `3` | `4` | `5`
}
object Card {
  
  inline def apply(funding: `-1` | `0` | `1` | `2`, lastfour: String, `type`: `1` | `2` | `3` | `4` | `5`): Card = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], lastfour = lastfour.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setFunding(value: `-1` | `0` | `1` | `2`): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setLastfour(value: String): Self = StObject.set(x, "lastfour", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
