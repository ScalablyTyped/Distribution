package typings.tpdirect

import typings.tpdirect.tpdirectInts.`-1`
import typings.tpdirect.tpdirectInts.`0`
import typings.tpdirect.tpdirectInts.`1`
import typings.tpdirect.tpdirectInts.`2`
import typings.tpdirect.tpdirectInts.`3`
import typings.tpdirect.tpdirectInts.`4`
import typings.tpdirect.tpdirectInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardInfoV2
  extends StObject
     with BaseCardInfo {
  
  var bin_code: String
  
  var country_code: String
  
  /**
    * ```markdown
    * Real Card for Google Pay (card isn't installed in phohe)
    * Token Card for Google Pay, Apple Pay, Samsung Pay
    * ```
    */
  var last_four: String
}
object CardInfoV2 {
  
  inline def apply(
    bank_id: String,
    bin_code: String,
    country: String,
    country_code: String,
    funding: `-1` | `0` | `1` | `2`,
    issuer: String,
    issuer_zh_tw: String,
    last_four: String,
    level: String,
    `type`: `1` | `2` | `3` | `4` | `5`
  ): CardInfoV2 = {
    val __obj = js.Dynamic.literal(bank_id = bank_id.asInstanceOf[js.Any], bin_code = bin_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuer_zh_tw = issuer_zh_tw.asInstanceOf[js.Any], last_four = last_four.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfoV2]
  }
  
  extension [Self <: CardInfoV2](x: Self) {
    
    inline def setBin_code(value: String): Self = StObject.set(x, "bin_code", value.asInstanceOf[js.Any])
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setLast_four(value: String): Self = StObject.set(x, "last_four", value.asInstanceOf[js.Any])
  }
}
