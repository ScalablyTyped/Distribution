package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AES extends StObject {
  
  /**
    * AES encryption
    */
  var AES: `3`
  
  /**
    * No encryption
    */
  var NONE: `5`
  
  /**
    * TKIP encryption
    */
  var TKIP: `2`
  
  /**
    * TKIP_AES_MIXED encryption
    */
  var TKIP_AES_MIXED: `4`
  
  /**
    * Encryption type unknown
    */
  var UNKNOWN: `6`
  
  /**
    * WEP encryption
    */
  var WEP: `1`
}
object AES {
  
  @scala.inline
  def apply(): AES = {
    val __obj = js.Dynamic.literal(AES = 3, NONE = 5, TKIP = 2, TKIP_AES_MIXED = 4, UNKNOWN = 6, WEP = 1)
    __obj.asInstanceOf[AES]
  }
  
  @scala.inline
  implicit class AESMutableBuilder[Self <: AES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAES(value: `3`): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP(value: `2`): Self = StObject.set(x, "TKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP_AES_MIXED(value: `4`): Self = StObject.set(x, "TKIP_AES_MIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `6`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEP(value: `1`): Self = StObject.set(x, "WEP", value.asInstanceOf[js.Any])
  }
}
