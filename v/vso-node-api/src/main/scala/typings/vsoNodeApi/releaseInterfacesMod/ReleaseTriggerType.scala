package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseTriggerType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType with Double] = js.native
  
  @js.native
  sealed trait ArtifactSource extends ReleaseTriggerType
  /* 1 */ @js.native
  object ArtifactSource extends TopLevel[ArtifactSource with Double]
  
  @js.native
  sealed trait ContainerImage extends ReleaseTriggerType
  /* 4 */ @js.native
  object ContainerImage extends TopLevel[ContainerImage with Double]
  
  @js.native
  sealed trait Package extends ReleaseTriggerType
  /* 5 */ @js.native
  object Package extends TopLevel[Package with Double]
  
  @js.native
  sealed trait PullRequest extends ReleaseTriggerType
  /* 6 */ @js.native
  object PullRequest extends TopLevel[PullRequest with Double]
  
  @js.native
  sealed trait Schedule extends ReleaseTriggerType
  /* 2 */ @js.native
  object Schedule extends TopLevel[Schedule with Double]
  
  @js.native
  sealed trait SourceRepo extends ReleaseTriggerType
  /* 3 */ @js.native
  object SourceRepo extends TopLevel[SourceRepo with Double]
  
  @js.native
  sealed trait Undefined extends ReleaseTriggerType
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
