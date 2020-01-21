package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProfileMediaType extends js.Object

/** Describes network types for provisioned network connectivity profiles. */
@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends js.Object {
  /** The profile is for a wireless local area network (WLAN). */
  @js.native
  sealed trait wlan extends ProfileMediaType
  
  /** The profile is for a wireless wide area network (WWAN). */
  @js.native
  sealed trait wwan extends ProfileMediaType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProfileMediaType with Double] = js.native
  /* 0 */ @js.native
  object wlan extends TopLevel[wlan with Double]
  
  /* 1 */ @js.native
  object wwan extends TopLevel[wwan with Double]
  
}

