package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseStatus")
@js.native
object ReleaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseStatus with Double] = js.native
  
  @js.native
  sealed trait Abandoned extends ReleaseStatus
  /* 4 */ val Abandoned: typings.vsoNodeApi.releaseInterfacesMod.ReleaseStatus.Abandoned with Double = js.native
  
  @js.native
  sealed trait Active extends ReleaseStatus
  /* 2 */ val Active: typings.vsoNodeApi.releaseInterfacesMod.ReleaseStatus.Active with Double = js.native
  
  @js.native
  sealed trait Draft extends ReleaseStatus
  /* 1 */ val Draft: typings.vsoNodeApi.releaseInterfacesMod.ReleaseStatus.Draft with Double = js.native
  
  @js.native
  sealed trait Undefined extends ReleaseStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ReleaseStatus.Undefined with Double = js.native
}
