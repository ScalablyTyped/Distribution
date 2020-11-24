package typings.unimodulesPermissionsInterface.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionStatus extends js.Object
@JSImport("unimodules-permissions-interface", "PermissionStatus")
@js.native
object PermissionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PermissionStatus with String] = js.native
  
  @js.native
  sealed trait DENIED extends PermissionStatus
  /* "denied" */ @js.native
  object DENIED extends TopLevel[DENIED with String]
  
  @js.native
  sealed trait GRANTED extends PermissionStatus
  /* "granted" */ @js.native
  object GRANTED extends TopLevel[GRANTED with String]
  
  @js.native
  sealed trait UNDETERMINED extends PermissionStatus
  /* "undetermined" */ @js.native
  object UNDETERMINED extends TopLevel[UNDETERMINED with String]
}
