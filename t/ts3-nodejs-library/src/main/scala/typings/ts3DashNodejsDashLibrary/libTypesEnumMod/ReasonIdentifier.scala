package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_CHANNEL
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_SERVER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReasonIdentifier extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "ReasonIdentifier")
@js.native
object ReasonIdentifier extends js.Object {
  /** kick client from channel */
  @js.native
  sealed trait KICK_CHANNEL extends ReasonIdentifier
  
  /** kick client from server */
  @js.native
  sealed trait KICK_SERVER extends ReasonIdentifier
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReasonIdentifier with Double] = js.native
  /* 4 */ @js.native
  object KICK_CHANNEL extends TopLevel[KICK_CHANNEL with Double]
  
  /* 5 */ @js.native
  object KICK_SERVER extends TopLevel[KICK_SERVER with Double]
  
}

