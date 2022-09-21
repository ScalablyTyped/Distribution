package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkActiveConnectionType extends StObject
@JSImport("tizen-tv-webapis", "NetworkActiveConnectionType")
@js.native
object NetworkActiveConnectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkActiveConnectionType & Double] = js.native
  
  /**
    * Connected to a cellular network.
    *
    * @since 2.3
    */
  @js.native
  sealed trait CELLULAR
    extends StObject
       with NetworkActiveConnectionType
  /* 2 */ val CELLULAR: typings.tizenTvWebapis.mod.NetworkActiveConnectionType.CELLULAR & Double = js.native
  
  /**
    * No network configured
    *
    * @since 2.3
    */
  @js.native
  sealed trait DISCONNECTED
    extends StObject
       with NetworkActiveConnectionType
  /* 0 */ val DISCONNECTED: typings.tizenTvWebapis.mod.NetworkActiveConnectionType.DISCONNECTED & Double = js.native
  
  /**
    * Connected to an Ethernet network.
    *
    * @since 2.3
    */
  @js.native
  sealed trait ETHERNET
    extends StObject
       with NetworkActiveConnectionType
  /* 3 */ val ETHERNET: typings.tizenTvWebapis.mod.NetworkActiveConnectionType.ETHERNET & Double = js.native
  
  /**
    * Connected to a Wi-Fi network.
    *
    * @since 2.3
    */
  @js.native
  sealed trait WIFI
    extends StObject
       with NetworkActiveConnectionType
  /* 1 */ val WIFI: typings.tizenTvWebapis.mod.NetworkActiveConnectionType.WIFI & Double = js.native
}
