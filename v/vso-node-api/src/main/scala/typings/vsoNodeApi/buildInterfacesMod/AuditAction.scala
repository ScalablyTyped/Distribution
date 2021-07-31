package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with AuditAction
  /* 1 */ val Add: typings.vsoNodeApi.buildInterfacesMod.AuditAction.Add & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with AuditAction
  /* 3 */ val Delete: typings.vsoNodeApi.buildInterfacesMod.AuditAction.Delete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with AuditAction
  /* 2 */ val Update: typings.vsoNodeApi.buildInterfacesMod.AuditAction.Update & Double = js.native
}
