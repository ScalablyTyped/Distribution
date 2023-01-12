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

trait BaseCardInfo extends StObject {
  
  var bank_id: String
  
  var country: String
  
  /**
    * ```markdown
    * -1 = Unkonwn
    * 0 = Credit Card
    * 1 = Debit Card
    * 2 = Prepaid Card
    * ```
    */
  var funding: `-1` | `0` | `1` | `2`
  
  var issuer: String
  
  var issuer_zh_tw: String
  
  var level: String
  
  /**
    * ```markdown
    * -1 = Unkown
    * 1 = VISA
    * 2 = MasterCard
    * 3 = JCB
    * 4 = Union Pay
    * 5 = AMEX
    * ```
    */
  var `type`: `1` | `2` | `3` | `4` | `5`
}
object BaseCardInfo {
  
  inline def apply(
    bank_id: String,
    country: String,
    funding: `-1` | `0` | `1` | `2`,
    issuer: String,
    issuer_zh_tw: String,
    level: String,
    `type`: `1` | `2` | `3` | `4` | `5`
  ): BaseCardInfo = {
    val __obj = js.Dynamic.literal(bank_id = bank_id.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuer_zh_tw = issuer_zh_tw.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCardInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseCardInfo] (val x: Self) extends AnyVal {
    
    inline def setBank_id(value: String): Self = StObject.set(x, "bank_id", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFunding(value: `-1` | `0` | `1` | `2`): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuer_zh_tw(value: String): Self = StObject.set(x, "issuer_zh_tw", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
