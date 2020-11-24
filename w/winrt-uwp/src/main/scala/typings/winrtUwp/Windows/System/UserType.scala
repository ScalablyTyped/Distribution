package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends js.Object
/** Represents user types. */
@JSGlobal("Windows.System.UserType")
@js.native
object UserType extends js.Object {
  
  /** The user is a local guest. */
  @js.native
  sealed trait localGuest extends UserType
  
  /** The user is a local user. */
  @js.native
  sealed trait localUser extends UserType
  
  /** The user is a remote guest. */
  @js.native
  sealed trait remoteGuest extends UserType
  
  /** The user is a remote user. */
  @js.native
  sealed trait remoteUser extends UserType
}
