package typings.vsoNodeApi.releaseInterfacesMod

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
  /* 1 */ val ArtifactSource: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ArtifactSource & Double = js.native
  
  @js.native
  sealed trait ContainerImage
    extends StObject
       with ReleaseTriggerType
  /* 4 */ val ContainerImage: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ContainerImage & Double = js.native
  
  @js.native
  sealed trait Package
    extends StObject
       with ReleaseTriggerType
  /* 5 */ val Package: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Package & Double = js.native
  
  @js.native
  sealed trait PullRequest
    extends StObject
       with ReleaseTriggerType
  /* 6 */ val PullRequest: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.PullRequest & Double = js.native
  
  @js.native
  sealed trait Schedule
    extends StObject
       with ReleaseTriggerType
  /* 2 */ val Schedule: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Schedule & Double = js.native
  
  @js.native
  sealed trait SourceRepo
    extends StObject
       with ReleaseTriggerType
  /* 3 */ val SourceRepo: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.SourceRepo & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ReleaseTriggerType
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Undefined & Double = js.native
}
