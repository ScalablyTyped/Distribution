package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReasonIdentifier extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "ReasonIdentifier")
@js.native
object ReasonIdentifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReasonIdentifier & Double] = js.native
  
  /** kick client from channel */
  @js.native
  sealed trait KICK_CHANNEL
    extends StObject
       with ReasonIdentifier
  /* 4 */ val KICK_CHANNEL: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_CHANNEL & Double = js.native
  
  /** kick client from server */
  @js.native
  sealed trait KICK_SERVER
    extends StObject
       with ReasonIdentifier
  /* 5 */ val KICK_SERVER: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_SERVER & Double = js.native
}
