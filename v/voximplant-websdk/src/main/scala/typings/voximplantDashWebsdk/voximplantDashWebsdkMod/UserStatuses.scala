package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserStatuses extends js.Object

@JSImport("voximplant-websdk", "UserStatuses")
@js.native
object UserStatuses extends js.Object {
  /**
  		*	User is away
  		*/
  @js.native
  sealed trait Away extends UserStatuses
  
  /**
  		*	User is available for chat
  		*/
  @js.native
  sealed trait Chat extends UserStatuses
  
  /**
  		*	User is in DND state (Do Not Disturbed)
  		*/
  @js.native
  sealed trait DND extends UserStatuses
  
  /**
  		*	User is offline
  		*/
  @js.native
  sealed trait Offline extends UserStatuses
  
  /**
  		*	User is online
  		*/
  @js.native
  sealed trait Online extends UserStatuses
  
  /**
  		*	User is in XA state (eXtended Away)
  		*/
  @js.native
  sealed trait XA extends UserStatuses
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserStatuses with Double] = js.native
  /* 0 */ @js.native
  object Away extends TopLevel[Away with Double]
  
  /* 1 */ @js.native
  object Chat extends TopLevel[Chat with Double]
  
  /* 2 */ @js.native
  object DND extends TopLevel[DND with Double]
  
  /* 3 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 4 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  /* 5 */ @js.native
  object XA extends TopLevel[XA with Double]
  
}

