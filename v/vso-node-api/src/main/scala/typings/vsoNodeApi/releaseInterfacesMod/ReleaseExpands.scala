package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseExpands")
@js.native
object ReleaseExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseExpands & Double] = js.native
  
  @js.native
  sealed trait Approvals
    extends StObject
       with ReleaseExpands
  /* 8 */ val Approvals: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Approvals & Double = js.native
  
  @js.native
  sealed trait Artifacts
    extends StObject
       with ReleaseExpands
  /* 4 */ val Artifacts: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Artifacts & Double = js.native
  
  @js.native
  sealed trait Environments
    extends StObject
       with ReleaseExpands
  /* 2 */ val Environments: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Environments & Double = js.native
  
  @js.native
  sealed trait ManualInterventions
    extends StObject
       with ReleaseExpands
  /* 16 */ val ManualInterventions: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.ManualInterventions & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReleaseExpands
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.None & Double = js.native
  
  @js.native
  sealed trait Tags
    extends StObject
       with ReleaseExpands
  /* 64 */ val Tags: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Tags & Double = js.native
  
  @js.native
  sealed trait Variables
    extends StObject
       with ReleaseExpands
  /* 32 */ val Variables: typings.vsoNodeApi.releaseInterfacesMod.ReleaseExpands.Variables & Double = js.native
}
