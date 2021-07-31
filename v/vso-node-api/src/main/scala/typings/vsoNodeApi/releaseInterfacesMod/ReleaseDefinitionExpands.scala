package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionExpands")
@js.native
object ReleaseDefinitionExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionExpands & Double] = js.native
  
  @js.native
  sealed trait Artifacts
    extends StObject
       with ReleaseDefinitionExpands
  /* 4 */ val Artifacts: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Artifacts & Double = js.native
  
  @js.native
  sealed trait Environments
    extends StObject
       with ReleaseDefinitionExpands
  /* 2 */ val Environments: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Environments & Double = js.native
  
  @js.native
  sealed trait LastRelease
    extends StObject
       with ReleaseDefinitionExpands
  /* 64 */ val LastRelease: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.LastRelease & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReleaseDefinitionExpands
  /* 0 */ val None: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.None & Double = js.native
  
  @js.native
  sealed trait Tags
    extends StObject
       with ReleaseDefinitionExpands
  /* 32 */ val Tags: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Tags & Double = js.native
  
  @js.native
  sealed trait Triggers
    extends StObject
       with ReleaseDefinitionExpands
  /* 8 */ val Triggers: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Triggers & Double = js.native
  
  @js.native
  sealed trait Variables
    extends StObject
       with ReleaseDefinitionExpands
  /* 16 */ val Variables: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Variables & Double = js.native
}
