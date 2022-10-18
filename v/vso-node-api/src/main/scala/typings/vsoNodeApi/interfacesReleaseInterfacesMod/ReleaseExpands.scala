package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  /* 8 */ val Approvals: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.Approvals & Double = js.native
  
  @js.native
  sealed trait Artifacts
    extends StObject
       with ReleaseExpands
  /* 4 */ val Artifacts: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.Artifacts & Double = js.native
  
  @js.native
  sealed trait Environments
    extends StObject
       with ReleaseExpands
  /* 2 */ val Environments: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.Environments & Double = js.native
  
  @js.native
  sealed trait ManualInterventions
    extends StObject
       with ReleaseExpands
  /* 16 */ val ManualInterventions: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.ManualInterventions & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReleaseExpands
  /* 0 */ val None: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.None & Double = js.native
  
  @js.native
  sealed trait Tags
    extends StObject
       with ReleaseExpands
  /* 64 */ val Tags: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.Tags & Double = js.native
  
  @js.native
  sealed trait Variables
    extends StObject
       with ReleaseExpands
  /* 32 */ val Variables: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseExpands.Variables & Double = js.native
}
