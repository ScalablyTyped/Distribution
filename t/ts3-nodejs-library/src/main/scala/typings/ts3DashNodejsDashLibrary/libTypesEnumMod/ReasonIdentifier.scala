package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

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
  
  /* 4 */ val KICK_CHANNEL: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_CHANNEL with Double = js.native
  /* 5 */ val KICK_SERVER: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier.KICK_SERVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReasonIdentifier with Double] = js.native
}

