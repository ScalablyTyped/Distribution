package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GateStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "GateStatus")
@js.native
object GateStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GateStatus with Double] = js.native
  
  @js.native
  sealed trait Failed extends GateStatus
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait InProgress extends GateStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait None extends GateStatus
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Pending extends GateStatus
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  @js.native
  sealed trait Succeeded extends GateStatus
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}
