package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentArtifactType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AgentArtifactType")
@js.native
object AgentArtifactType extends js.Object {
  @js.native
  sealed trait Build
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait ExternalTfsBuild
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait FileShare
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait GitHub
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait Jenkins
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait Nuget
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait TFGit
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait TfsOnPrem
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait Tfvc
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  @js.native
  sealed trait XamlBuild
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType
  
  /* 1 */ val Build: Build with scala.Double = js.native
  /* 9 */ val Custom: Custom with scala.Double = js.native
  /* 8 */ val ExternalTfsBuild: ExternalTfsBuild with scala.Double = js.native
  /* 3 */ val FileShare: FileShare with scala.Double = js.native
  /* 6 */ val GitHub: GitHub with scala.Double = js.native
  /* 2 */ val Jenkins: Jenkins with scala.Double = js.native
  /* 4 */ val Nuget: Nuget with scala.Double = js.native
  /* 7 */ val TFGit: TFGit with scala.Double = js.native
  /* 5 */ val TfsOnPrem: TfsOnPrem with scala.Double = js.native
  /* 10 */ val Tfvc: Tfvc with scala.Double = js.native
  /* 0 */ val XamlBuild: XamlBuild with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactType with scala.Double
  ] = js.native
}

