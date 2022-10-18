package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with AuditAction
  /* 1 */ val Add: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AuditAction.Add & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with AuditAction
  /* 3 */ val Delete: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AuditAction.Delete & Double = js.native
  
  @js.native
  sealed trait Undelete
    extends StObject
       with AuditAction
  /* 4 */ val Undelete: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AuditAction.Undelete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with AuditAction
  /* 2 */ val Update: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AuditAction.Update & Double = js.native
}
