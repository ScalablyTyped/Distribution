package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseExpands extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseExpands")
@js.native
object ReleaseExpands extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseExpands with Double] = js.native
  
  @js.native
  sealed trait Approvals extends ReleaseExpands
  /* 8 */ @js.native
  object Approvals extends TopLevel[Approvals with Double]
  
  @js.native
  sealed trait Artifacts extends ReleaseExpands
  /* 4 */ @js.native
  object Artifacts extends TopLevel[Artifacts with Double]
  
  @js.native
  sealed trait Environments extends ReleaseExpands
  /* 2 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  @js.native
  sealed trait ManualInterventions extends ReleaseExpands
  /* 16 */ @js.native
  object ManualInterventions extends TopLevel[ManualInterventions with Double]
  
  @js.native
  sealed trait None extends ReleaseExpands
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Tags extends ReleaseExpands
  /* 64 */ @js.native
  object Tags extends TopLevel[Tags with Double]
  
  @js.native
  sealed trait Variables extends ReleaseExpands
  /* 32 */ @js.native
  object Variables extends TopLevel[Variables with Double]
}
