package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentArtifactType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AgentArtifactType")
@js.native
object AgentArtifactType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentArtifactType with Double] = js.native
  
  @js.native
  sealed trait Build extends AgentArtifactType
  /* 1 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  @js.native
  sealed trait Custom extends AgentArtifactType
  /* 9 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait ExternalTfsBuild extends AgentArtifactType
  /* 8 */ @js.native
  object ExternalTfsBuild extends TopLevel[ExternalTfsBuild with Double]
  
  @js.native
  sealed trait FileShare extends AgentArtifactType
  /* 3 */ @js.native
  object FileShare extends TopLevel[FileShare with Double]
  
  @js.native
  sealed trait GitHub extends AgentArtifactType
  /* 6 */ @js.native
  object GitHub extends TopLevel[GitHub with Double]
  
  @js.native
  sealed trait Jenkins extends AgentArtifactType
  /* 2 */ @js.native
  object Jenkins extends TopLevel[Jenkins with Double]
  
  @js.native
  sealed trait Nuget extends AgentArtifactType
  /* 4 */ @js.native
  object Nuget extends TopLevel[Nuget with Double]
  
  @js.native
  sealed trait TFGit extends AgentArtifactType
  /* 7 */ @js.native
  object TFGit extends TopLevel[TFGit with Double]
  
  @js.native
  sealed trait TfsOnPrem extends AgentArtifactType
  /* 5 */ @js.native
  object TfsOnPrem extends TopLevel[TfsOnPrem with Double]
  
  @js.native
  sealed trait Tfvc extends AgentArtifactType
  /* 10 */ @js.native
  object Tfvc extends TopLevel[Tfvc with Double]
  
  @js.native
  sealed trait XamlBuild extends AgentArtifactType
  /* 0 */ @js.native
  object XamlBuild extends TopLevel[XamlBuild with Double]
}
