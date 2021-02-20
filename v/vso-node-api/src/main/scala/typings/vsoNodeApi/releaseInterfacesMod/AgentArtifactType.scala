package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentArtifactType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AgentArtifactType")
@js.native
object AgentArtifactType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentArtifactType with Double] = js.native
  
  @js.native
  sealed trait Build extends AgentArtifactType
  /* 1 */ val Build: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.Build with Double = js.native
  
  @js.native
  sealed trait Custom extends AgentArtifactType
  /* 9 */ val Custom: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.Custom with Double = js.native
  
  @js.native
  sealed trait ExternalTfsBuild extends AgentArtifactType
  /* 8 */ val ExternalTfsBuild: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.ExternalTfsBuild with Double = js.native
  
  @js.native
  sealed trait FileShare extends AgentArtifactType
  /* 3 */ val FileShare: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.FileShare with Double = js.native
  
  @js.native
  sealed trait GitHub extends AgentArtifactType
  /* 6 */ val GitHub: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.GitHub with Double = js.native
  
  @js.native
  sealed trait Jenkins extends AgentArtifactType
  /* 2 */ val Jenkins: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.Jenkins with Double = js.native
  
  @js.native
  sealed trait Nuget extends AgentArtifactType
  /* 4 */ val Nuget: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.Nuget with Double = js.native
  
  @js.native
  sealed trait TFGit extends AgentArtifactType
  /* 7 */ val TFGit: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.TFGit with Double = js.native
  
  @js.native
  sealed trait TfsOnPrem extends AgentArtifactType
  /* 5 */ val TfsOnPrem: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.TfsOnPrem with Double = js.native
  
  @js.native
  sealed trait Tfvc extends AgentArtifactType
  /* 10 */ val Tfvc: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.Tfvc with Double = js.native
  
  @js.native
  sealed trait XamlBuild extends AgentArtifactType
  /* 0 */ val XamlBuild: typings.vsoNodeApi.releaseInterfacesMod.AgentArtifactType.XamlBuild with Double = js.native
}
