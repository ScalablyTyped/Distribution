package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserStatuses extends js.Object
@JSImport("voximplant-websdk", "UserStatuses")
@js.native
object UserStatuses extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserStatuses with Double] = js.native
  
  /**
    *    User is away
    */
  @js.native
  sealed trait Away extends UserStatuses
  /* 0 */ @js.native
  object Away extends TopLevel[Away with Double]
  
  /**
    *    User is available for chat
    */
  @js.native
  sealed trait Chat extends UserStatuses
  /* 1 */ @js.native
  object Chat extends TopLevel[Chat with Double]
  
  /**
    *    User is in DND state (Do Not Disturbed)
    */
  @js.native
  sealed trait DND extends UserStatuses
  /* 2 */ @js.native
  object DND extends TopLevel[DND with Double]
  
  /**
    *    User is offline
    */
  @js.native
  sealed trait Offline extends UserStatuses
  /* 3 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /**
    *    User is online
    */
  @js.native
  sealed trait Online extends UserStatuses
  /* 4 */ @js.native
  object Online extends TopLevel[Online with Double]
  
  /**
    *    User is in XA state (eXtended Away)
    */
  @js.native
  sealed trait XA extends UserStatuses
  /* 5 */ @js.native
  object XA extends TopLevel[XA with Double]
}
