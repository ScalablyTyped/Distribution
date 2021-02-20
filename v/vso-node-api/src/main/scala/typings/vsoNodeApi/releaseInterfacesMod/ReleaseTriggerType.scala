package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseTriggerType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType with Double] = js.native
  
  @js.native
  sealed trait ArtifactSource extends ReleaseTriggerType
  /* 1 */ val ArtifactSource: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ArtifactSource with Double = js.native
  
  @js.native
  sealed trait ContainerImage extends ReleaseTriggerType
  /* 4 */ val ContainerImage: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ContainerImage with Double = js.native
  
  @js.native
  sealed trait Package extends ReleaseTriggerType
  /* 5 */ val Package: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Package with Double = js.native
  
  @js.native
  sealed trait PullRequest extends ReleaseTriggerType
  /* 6 */ val PullRequest: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.PullRequest with Double = js.native
  
  @js.native
  sealed trait Schedule extends ReleaseTriggerType
  /* 2 */ val Schedule: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Schedule with Double = js.native
  
  @js.native
  sealed trait SourceRepo extends ReleaseTriggerType
  /* 3 */ val SourceRepo: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.SourceRepo with Double = js.native
  
  @js.native
  sealed trait Undefined extends ReleaseTriggerType
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Undefined with Double = js.native
}
