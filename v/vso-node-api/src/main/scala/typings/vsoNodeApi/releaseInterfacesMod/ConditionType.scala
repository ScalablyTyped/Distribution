package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ConditionType")
@js.native
object ConditionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionType with Double] = js.native
  
  /**
    * The condition type is artifact.
    */
  @js.native
  sealed trait Artifact extends ConditionType
  /* 4 */ val Artifact: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Artifact with Double = js.native
  
  /**
    * The condition type is environment state.
    */
  @js.native
  sealed trait EnvironmentState extends ConditionType
  /* 2 */ val EnvironmentState: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.EnvironmentState with Double = js.native
  
  /**
    * The condition type is event.
    */
  @js.native
  sealed trait Event extends ConditionType
  /* 1 */ val Event: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Event with Double = js.native
  
  /**
    * The condition type is undefined.
    */
  @js.native
  sealed trait Undefined extends ConditionType
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Undefined with Double = js.native
}
