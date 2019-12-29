package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType with Double] = js.native
  /* 1 */ @js.native
  object ArtifactSource extends TopLevel[ArtifactSource with Double]
  
  /* 4 */ @js.native
  object ContainerImage extends TopLevel[ContainerImage with Double]
  
  /* 5 */ @js.native
  object Package extends TopLevel[Package with Double]
  
  /* 6 */ @js.native
  object PullRequest extends TopLevel[PullRequest with Double]
  
  /* 2 */ @js.native
  object Schedule extends TopLevel[Schedule with Double]
  
  /* 3 */ @js.native
  object SourceRepo extends TopLevel[SourceRepo with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

