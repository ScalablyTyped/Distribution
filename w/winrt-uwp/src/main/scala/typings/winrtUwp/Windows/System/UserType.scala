package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends StObject
/** Represents user types. */
@JSGlobal("Windows.System.UserType")
@js.native
object UserType extends StObject {
  
  /** The user is a local guest. */
  @js.native
  sealed trait localGuest
    extends StObject
       with UserType
  
  /** The user is a local user. */
  @js.native
  sealed trait localUser
    extends StObject
       with UserType
  
  /** The user is a remote guest. */
  @js.native
  sealed trait remoteGuest
    extends StObject
       with UserType
  
  /** The user is a remote user. */
  @js.native
  sealed trait remoteUser
    extends StObject
       with UserType
}
