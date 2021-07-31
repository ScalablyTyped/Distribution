package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ConditionType")
@js.native
object ConditionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionType & Double] = js.native
  
  /**
    * The condition type is artifact.
    */
  @js.native
  sealed trait Artifact
    extends StObject
       with ConditionType
  /* 4 */ val Artifact: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Artifact & Double = js.native
  
  /**
    * The condition type is environment state.
    */
  @js.native
  sealed trait EnvironmentState
    extends StObject
       with ConditionType
  /* 2 */ val EnvironmentState: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.EnvironmentState & Double = js.native
  
  /**
    * The condition type is event.
    */
  @js.native
  sealed trait Event
    extends StObject
       with ConditionType
  /* 1 */ val Event: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Event & Double = js.native
  
  /**
    * The condition type is undefined.
    */
  @js.native
  sealed trait Undefined
    extends StObject
       with ConditionType
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Undefined & Double = js.native
}
