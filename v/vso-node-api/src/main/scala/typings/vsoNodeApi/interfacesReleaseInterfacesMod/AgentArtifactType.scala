package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentArtifactType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AgentArtifactType")
@js.native
object AgentArtifactType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentArtifactType & Double] = js.native
  
  @js.native
  sealed trait Build
    extends StObject
       with AgentArtifactType
  /* 1 */ val Build: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.Build & Double = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with AgentArtifactType
  /* 9 */ val Custom: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.Custom & Double = js.native
  
  @js.native
  sealed trait ExternalTfsBuild
    extends StObject
       with AgentArtifactType
  /* 8 */ val ExternalTfsBuild: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.ExternalTfsBuild & Double = js.native
  
  @js.native
  sealed trait FileShare
    extends StObject
       with AgentArtifactType
  /* 3 */ val FileShare: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.FileShare & Double = js.native
  
  @js.native
  sealed trait GitHub
    extends StObject
       with AgentArtifactType
  /* 6 */ val GitHub: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.GitHub & Double = js.native
  
  @js.native
  sealed trait Jenkins
    extends StObject
       with AgentArtifactType
  /* 2 */ val Jenkins: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.Jenkins & Double = js.native
  
  @js.native
  sealed trait Nuget
    extends StObject
       with AgentArtifactType
  /* 4 */ val Nuget: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.Nuget & Double = js.native
  
  @js.native
  sealed trait TFGit
    extends StObject
       with AgentArtifactType
  /* 7 */ val TFGit: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.TFGit & Double = js.native
  
  @js.native
  sealed trait TfsOnPrem
    extends StObject
       with AgentArtifactType
  /* 5 */ val TfsOnPrem: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.TfsOnPrem & Double = js.native
  
  @js.native
  sealed trait Tfvc
    extends StObject
       with AgentArtifactType
  /* 10 */ val Tfvc: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.Tfvc & Double = js.native
  
  @js.native
  sealed trait XamlBuild
    extends StObject
       with AgentArtifactType
  /* 0 */ val XamlBuild: typings.vsoNodeApi.interfacesReleaseInterfacesMod.AgentArtifactType.XamlBuild & Double = js.native
}
