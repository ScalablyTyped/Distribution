package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GateStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus & Double] = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with GateStatus
  /* 8 */ val Failed: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Failed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with GateStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GateStatus
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.None & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with GateStatus
  /* 1 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Pending & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with GateStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Succeeded & Double = js.native
}
