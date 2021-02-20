package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction with Double] = js.native
  
  @js.native
  sealed trait Add extends AuditAction
  /* 1 */ val Add: typings.vsoNodeApi.releaseInterfacesMod.AuditAction.Add with Double = js.native
  
  @js.native
  sealed trait Delete extends AuditAction
  /* 3 */ val Delete: typings.vsoNodeApi.releaseInterfacesMod.AuditAction.Delete with Double = js.native
  
  @js.native
  sealed trait Undelete extends AuditAction
  /* 4 */ val Undelete: typings.vsoNodeApi.releaseInterfacesMod.AuditAction.Undelete with Double = js.native
  
  @js.native
  sealed trait Update extends AuditAction
  /* 2 */ val Update: typings.vsoNodeApi.releaseInterfacesMod.AuditAction.Update with Double = js.native
}
