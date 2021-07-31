package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkIpMode extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkIpMode")
@js.native
object NetworkIpMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkIpMode & Double] = js.native
  
  /**
    *  DHCP: Connected to wired or wireless IPv4 network through automatic IP configuration
    */
  @js.native
  sealed trait AUTO
    extends StObject
       with NetworkIpMode
  /* 3 */ val AUTO: typings.tizenTvWebapis.networkMod.NetworkIpMode.AUTO & Double = js.native
  
  /**
    * Connected to wired or wireless IPv6 network through dynamic IP configuration
    */
  @js.native
  sealed trait DYNAMIC
    extends StObject
       with NetworkIpMode
  /* 2 */ val DYNAMIC: typings.tizenTvWebapis.networkMod.NetworkIpMode.DYNAMIC & Double = js.native
  
  /**
    * Connected to cellular network through fixed IP configuration
    */
  @js.native
  sealed trait FIXED
    extends StObject
       with NetworkIpMode
  /* 4 */ val FIXED: typings.tizenTvWebapis.networkMod.NetworkIpMode.FIXED & Double = js.native
  
  /**
    * No network IP mode configured
    */
  @js.native
  sealed trait NONE
    extends StObject
       with NetworkIpMode
  /* 0 */ val NONE: typings.tizenTvWebapis.networkMod.NetworkIpMode.NONE & Double = js.native
  
  /**
    * Connected to wired or wireless IPv4 network through static IP configuration
    */
  @js.native
  sealed trait STATIC
    extends StObject
       with NetworkIpMode
  /* 1 */ val STATIC: typings.tizenTvWebapis.networkMod.NetworkIpMode.STATIC & Double = js.native
  
  /**
    * No wired or wireless connection
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with NetworkIpMode
  /* 5 */ val UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkIpMode.UNKNOWN & Double = js.native
}
