package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProfileMediaType extends StObject
/** Describes network types for provisioned network connectivity profiles. */
@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends StObject {
  
  /** The profile is for a wireless local area network (WLAN). */
  @js.native
  sealed trait wlan
    extends StObject
       with ProfileMediaType
  
  /** The profile is for a wireless wide area network (WWAN). */
  @js.native
  sealed trait wwan
    extends StObject
       with ProfileMediaType
}
