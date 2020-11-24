package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ConditionType")
@js.native
object ConditionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionType with Double] = js.native
  
  /**
    * The condition type is artifact.
    */
  @js.native
  sealed trait Artifact extends ConditionType
  /* 4 */ @js.native
  object Artifact
    extends TopLevel[typings.vsoNodeApi.releaseInterfacesMod.ConditionType.Artifact with Double]
  
  /**
    * The condition type is environment state.
    */
  @js.native
  sealed trait EnvironmentState extends ConditionType
  /* 2 */ @js.native
  object EnvironmentState extends TopLevel[EnvironmentState with Double]
  
  /**
    * The condition type is event.
    */
  @js.native
  sealed trait Event extends ConditionType
  /* 1 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  /**
    * The condition type is undefined.
    */
  @js.native
  sealed trait Undefined extends ConditionType
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
