package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionExpands")
@js.native
object ReleaseDefinitionExpands extends js.Object {
  @js.native
  sealed trait Artifacts extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Environments extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait LastRelease extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait None extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Tags extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Triggers extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Variables extends ReleaseDefinitionExpands
  
  /* 4 */ val Artifacts: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Artifacts with Double = js.native
  /* 2 */ val Environments: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Environments with Double = js.native
  /* 64 */ val LastRelease: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.LastRelease with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.None with Double = js.native
  /* 32 */ val Tags: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Tags with Double = js.native
  /* 8 */ val Triggers: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Triggers with Double = js.native
  /* 16 */ val Variables: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Variables with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionExpands with Double] = js.native
}

