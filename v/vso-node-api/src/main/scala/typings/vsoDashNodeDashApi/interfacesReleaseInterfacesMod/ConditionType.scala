package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ConditionType")
@js.native
object ConditionType extends js.Object {
  /**
    * The condition type is artifact.
    */
  @js.native
  sealed trait Artifact extends ConditionType
  
  /**
    * The condition type is environment state.
    */
  @js.native
  sealed trait EnvironmentState extends ConditionType
  
  /**
    * The condition type is event.
    */
  @js.native
  sealed trait Event extends ConditionType
  
  /**
    * The condition type is undefined.
    */
  @js.native
  sealed trait Undefined extends ConditionType
  
  /* 4 */ val Artifact: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ConditionType.Artifact with Double = js.native
  /* 2 */ val EnvironmentState: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ConditionType.EnvironmentState with Double = js.native
  /* 1 */ val Event: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ConditionType.Event with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ConditionType.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionType with Double] = js.native
}

