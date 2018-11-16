package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseTriggerType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends js.Object {
  @js.native
  sealed trait ArtifactSource
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait ContainerImage
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait Package
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait PullRequest
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait Schedule
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait SourceRepo
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType
  
  /* 1 */ val ArtifactSource: ArtifactSource with scala.Double = js.native
  /* 4 */ val ContainerImage: ContainerImage with scala.Double = js.native
  /* 5 */ val Package: Package with scala.Double = js.native
  /* 6 */ val PullRequest: PullRequest with scala.Double = js.native
  /* 2 */ val Schedule: Schedule with scala.Double = js.native
  /* 3 */ val SourceRepo: SourceRepo with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTriggerType with scala.Double
  ] = js.native
}

