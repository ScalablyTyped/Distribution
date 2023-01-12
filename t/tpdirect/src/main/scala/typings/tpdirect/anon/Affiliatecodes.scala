package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Affiliatecodes extends StObject {
  
  /**
    * Affiliated codes set by the merchant in the Co-brand card management
    * area of the TapPay portal.
    */
  var affiliate_codes: js.Array[String]
}
object Affiliatecodes {
  
  inline def apply(affiliate_codes: js.Array[String]): Affiliatecodes = {
    val __obj = js.Dynamic.literal(affiliate_codes = affiliate_codes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affiliatecodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Affiliatecodes] (val x: Self) extends AnyVal {
    
    inline def setAffiliate_codes(value: js.Array[String]): Self = StObject.set(x, "affiliate_codes", value.asInstanceOf[js.Any])
    
    inline def setAffiliate_codesVarargs(value: String*): Self = StObject.set(x, "affiliate_codes", js.Array(value*))
  }
}
