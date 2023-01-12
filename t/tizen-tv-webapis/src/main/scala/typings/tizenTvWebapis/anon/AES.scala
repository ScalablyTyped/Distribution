package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisInts.`1`
import typings.tizenTvWebapis.tizenTvWebapisInts.`2`
import typings.tizenTvWebapis.tizenTvWebapisInts.`3`
import typings.tizenTvWebapis.tizenTvWebapisInts.`4`
import typings.tizenTvWebapis.tizenTvWebapisInts.`5`
import typings.tizenTvWebapis.tizenTvWebapisInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AES extends StObject {
  
  /**
    * AES encryption
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var AES: `3`
  
  /**
    * No encryption
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var NONE: `5`
  
  /**
    * TKIP encryption
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TKIP: `2`
  
  /**
    * TKIP_AES_MIXED encryption
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var TKIP_AES_MIXED: `4`
  
  /**
    * Encryption type unknown
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var UNKNOWN: `6`
  
  /**
    * WEP encryption
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var WEP: `1`
}
object AES {
  
  inline def apply(): AES = {
    val __obj = js.Dynamic.literal(AES = 3, NONE = 5, TKIP = 2, TKIP_AES_MIXED = 4, UNKNOWN = 6, WEP = 1)
    __obj.asInstanceOf[AES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AES] (val x: Self) extends AnyVal {
    
    inline def setAES(value: `3`): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setTKIP(value: `2`): Self = StObject.set(x, "TKIP", value.asInstanceOf[js.Any])
    
    inline def setTKIP_AES_MIXED(value: `4`): Self = StObject.set(x, "TKIP_AES_MIXED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: `6`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setWEP(value: `1`): Self = StObject.set(x, "WEP", value.asInstanceOf[js.Any])
  }
}
