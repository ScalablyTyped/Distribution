package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GateStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus with Double] = js.native
  
  @js.native
  sealed trait Failed extends GateStatus
  /* 8 */ val Failed: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Failed with Double = js.native
  
  @js.native
  sealed trait InProgress extends GateStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.InProgress with Double = js.native
  
  @js.native
  sealed trait None extends GateStatus
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.None with Double = js.native
  
  @js.native
  sealed trait Pending extends GateStatus
  /* 1 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Pending with Double = js.native
  
  @js.native
  sealed trait Succeeded extends GateStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.releaseInterfacesMod.GateStatus.Succeeded with Double = js.native
}
