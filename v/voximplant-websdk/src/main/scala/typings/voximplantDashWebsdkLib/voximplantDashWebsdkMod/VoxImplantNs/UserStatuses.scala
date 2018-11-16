package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserStatuses extends js.Object

@JSImport("voximplant-websdk/VoxImplant", "UserStatuses")
@js.native
object UserStatuses extends js.Object {
  /**
  		*	User is away
  		*/
  @js.native
  sealed trait Away
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
  /**
  		*	User is available for chat
  		*/
  @js.native
  sealed trait Chat
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
  /**
  		*	User is in DND state (Do Not Disturbed)
  		*/
  @js.native
  sealed trait DND
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
  /**
  		*	User is offline
  		*/
  @js.native
  sealed trait Offline
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
  /**
  		*	User is online
  		*/
  @js.native
  sealed trait Online
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
  /**
  		*	User is in XA state (eXtended Away)
  		*/
  @js.native
  sealed trait XA
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  
}

