package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkActiveConnectionType extends js.Object
@JSImport("tizen-tv-webapis/network", "NetworkActiveConnectionType")
@js.native
object NetworkActiveConnectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkActiveConnectionType with Double] = js.native
  
  /**
    * Connected to a cellular network.
    */
  @js.native
  sealed trait CELLULAR extends NetworkActiveConnectionType
  /* 2 */ @js.native
  object CELLULAR extends TopLevel[CELLULAR with Double]
  
  /**
    * No network configured
    */
  @js.native
  sealed trait DISCONNECTED extends NetworkActiveConnectionType
  /* 0 */ @js.native
  object DISCONNECTED extends TopLevel[DISCONNECTED with Double]
  
  /**
    * Connected to an Ethernet network.
    */
  @js.native
  sealed trait ETHERNET extends NetworkActiveConnectionType
  /* 3 */ @js.native
  object ETHERNET extends TopLevel[ETHERNET with Double]
  
  /**
    * Connected to a Wi-Fi network.
    */
  @js.native
  sealed trait WIFI extends NetworkActiveConnectionType
  /* 1 */ @js.native
  object WIFI extends TopLevel[WIFI with Double]
}
