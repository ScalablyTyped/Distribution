package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CELLULAR extends StObject {
  
  /**
    * Connected to a cellular network.
    */
  var CELLULAR: `2`
  
  /**
    * No network configured
    */
  var DISCONNECTED: `0`
  
  /**
    * Connected to an Ethernet network.
    */
  var ETHERNET: `3`
  
  /**
    * Connected to a Wi-Fi network.
    */
  var WIFI: `1`
}
object CELLULAR {
  
  inline def apply(): CELLULAR = {
    val __obj = js.Dynamic.literal(CELLULAR = 2, DISCONNECTED = 0, ETHERNET = 3, WIFI = 1)
    __obj.asInstanceOf[CELLULAR]
  }
  
  extension [Self <: CELLULAR](x: Self) {
    
    inline def setCELLULAR(value: `2`): Self = StObject.set(x, "CELLULAR", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECTED(value: `0`): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def setETHERNET(value: `3`): Self = StObject.set(x, "ETHERNET", value.asInstanceOf[js.Any])
    
    inline def setWIFI(value: `1`): Self = StObject.set(x, "WIFI", value.asInstanceOf[js.Any])
  }
}
