package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentArtifactType with Double] = js.native
  /* 1 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  /* 9 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 8 */ @js.native
  object ExternalTfsBuild extends TopLevel[ExternalTfsBuild with Double]
  
  /* 3 */ @js.native
  object FileShare extends TopLevel[FileShare with Double]
  
  /* 6 */ @js.native
  object GitHub extends TopLevel[GitHub with Double]
  
  /* 2 */ @js.native
  object Jenkins extends TopLevel[Jenkins with Double]
  
  /* 4 */ @js.native
  object Nuget extends TopLevel[Nuget with Double]
  
  /* 7 */ @js.native
  object TFGit extends TopLevel[TFGit with Double]
  
  /* 5 */ @js.native
  object TfsOnPrem extends TopLevel[TfsOnPrem with Double]
  
  /* 10 */ @js.native
  object Tfvc extends TopLevel[Tfvc with Double]
  
  /* 0 */ @js.native
  object XamlBuild extends TopLevel[XamlBuild with Double]
  
}

