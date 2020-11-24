package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkIpMode extends js.Object
@JSImport("tizen-tv-webapis/network", "NetworkIpMode")
@js.native
object NetworkIpMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkIpMode with Double] = js.native
  
  /**
    *  DHCP: Connected to wired or wireless IPv4 network through automatic IP configuration
    */
  @js.native
  sealed trait AUTO extends NetworkIpMode
  /* 3 */ @js.native
  object AUTO extends TopLevel[AUTO with Double]
  
  /**
    * Connected to wired or wireless IPv6 network through dynamic IP configuration
    */
  @js.native
  sealed trait DYNAMIC extends NetworkIpMode
  /* 2 */ @js.native
  object DYNAMIC extends TopLevel[DYNAMIC with Double]
  
  /**
    * Connected to cellular network through fixed IP configuration
    */
  @js.native
  sealed trait FIXED extends NetworkIpMode
  /* 4 */ @js.native
  object FIXED extends TopLevel[FIXED with Double]
  
  /**
    * No network IP mode configured
    */
  @js.native
  sealed trait NONE extends NetworkIpMode
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /**
    * Connected to wired or wireless IPv4 network through static IP configuration
    */
  @js.native
  sealed trait STATIC extends NetworkIpMode
  /* 1 */ @js.native
  object STATIC extends TopLevel[STATIC with Double]
  
  /**
    * No wired or wireless connection
    */
  @js.native
  sealed trait UNKNOWN extends NetworkIpMode
  /* 5 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
