package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseTriggerType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends js.Object {
  @js.native
  sealed trait ArtifactSource extends ReleaseTriggerType
  
  @js.native
  sealed trait ContainerImage extends ReleaseTriggerType
  
  @js.native
  sealed trait Package extends ReleaseTriggerType
  
  @js.native
  sealed trait PullRequest extends ReleaseTriggerType
  
  @js.native
  sealed trait Schedule extends ReleaseTriggerType
  
  @js.native
  sealed trait SourceRepo extends ReleaseTriggerType
  
  @js.native
  sealed trait Undefined extends ReleaseTriggerType
  
  /* 1 */ val ArtifactSource: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.ArtifactSource with Double = js.native
  /* 4 */ val ContainerImage: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.ContainerImage with Double = js.native
  /* 5 */ val Package: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Package with Double = js.native
  /* 6 */ val PullRequest: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.PullRequest with Double = js.native
  /* 2 */ val Schedule: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Schedule with Double = js.native
  /* 3 */ val SourceRepo: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.SourceRepo with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseTriggerType.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType with Double] = js.native
}

