package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseTriggerType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType & Double] = js.native
  
  @js.native
  sealed trait ArtifactSource
    extends StObject
       with ReleaseTriggerType
  /* 1 */ val ArtifactSource: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.ArtifactSource & Double = js.native
  
  @js.native
  sealed trait ContainerImage
    extends StObject
       with ReleaseTriggerType
  /* 4 */ val ContainerImage: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.ContainerImage & Double = js.native
  
  @js.native
  sealed trait Package
    extends StObject
       with ReleaseTriggerType
  /* 5 */ val Package: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Package & Double = js.native
  
  @js.native
  sealed trait PullRequest
    extends StObject
       with ReleaseTriggerType
  /* 6 */ val PullRequest: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.PullRequest & Double = js.native
  
  @js.native
  sealed trait Schedule
    extends StObject
       with ReleaseTriggerType
  /* 2 */ val Schedule: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Schedule & Double = js.native
  
  @js.native
  sealed trait SourceRepo
    extends StObject
       with ReleaseTriggerType
  /* 3 */ val SourceRepo: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.SourceRepo & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ReleaseTriggerType
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Undefined & Double = js.native
}
