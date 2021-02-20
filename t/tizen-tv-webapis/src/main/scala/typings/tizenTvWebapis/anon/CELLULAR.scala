package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CELLULAR extends StObject {
  
  /**
    * Connected to a cellular network.
    */
  var CELLULAR: `2` = js.native
  
  /**
    * No network configured
    */
  var DISCONNECTED: `0` = js.native
  
  /**
    * Connected to an Ethernet network.
    */
  var ETHERNET: `3` = js.native
  
  /**
    * Connected to a Wi-Fi network.
    */
  var WIFI: `1` = js.native
}
object CELLULAR {
  
  @scala.inline
  def apply(CELLULAR: `2`, DISCONNECTED: `0`, ETHERNET: `3`, WIFI: `1`): CELLULAR = {
    val __obj = js.Dynamic.literal(CELLULAR = CELLULAR.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ETHERNET = ETHERNET.asInstanceOf[js.Any], WIFI = WIFI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CELLULAR]
  }
  
  @scala.inline
  implicit class CELLULARMutableBuilder[Self <: CELLULAR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCELLULAR(value: `2`): Self = StObject.set(x, "CELLULAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISCONNECTED(value: `0`): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETHERNET(value: `3`): Self = StObject.set(x, "ETHERNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI(value: `1`): Self = StObject.set(x, "WIFI", value.asInstanceOf[js.Any])
  }
}
