package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentArtifactType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AgentArtifactType")
@js.native
object AgentArtifactType extends js.Object {
  @js.native
  sealed trait Build extends AgentArtifactType
  
  @js.native
  sealed trait Custom extends AgentArtifactType
  
  @js.native
  sealed trait ExternalTfsBuild extends AgentArtifactType
  
  @js.native
  sealed trait FileShare extends AgentArtifactType
  
  @js.native
  sealed trait GitHub extends AgentArtifactType
  
  @js.native
  sealed trait Jenkins extends AgentArtifactType
  
  @js.native
  sealed trait Nuget extends AgentArtifactType
  
  @js.native
  sealed trait TFGit extends AgentArtifactType
  
  @js.native
  sealed trait TfsOnPrem extends AgentArtifactType
  
  @js.native
  sealed trait Tfvc extends AgentArtifactType
  
  @js.native
  sealed trait XamlBuild extends AgentArtifactType
  
  /* 1 */ val Build: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.Build with Double = js.native
  /* 9 */ val Custom: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.Custom with Double = js.native
  /* 8 */ val ExternalTfsBuild: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.ExternalTfsBuild with Double = js.native
  /* 3 */ val FileShare: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.FileShare with Double = js.native
  /* 6 */ val GitHub: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.GitHub with Double = js.native
  /* 2 */ val Jenkins: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.Jenkins with Double = js.native
  /* 4 */ val Nuget: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.Nuget with Double = js.native
  /* 7 */ val TFGit: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.TFGit with Double = js.native
  /* 5 */ val TfsOnPrem: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.TfsOnPrem with Double = js.native
  /* 10 */ val Tfvc: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.Tfvc with Double = js.native
  /* 0 */ val XamlBuild: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AgentArtifactType.XamlBuild with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentArtifactType with Double] = js.native
}

