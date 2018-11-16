package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  sealed trait Artifact
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ConditionType
  
  /**
       * The condition type is environment state.
       */
  @js.native
  sealed trait EnvironmentState
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ConditionType
  
  /**
       * The condition type is event.
       */
  @js.native
  sealed trait Event
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ConditionType
  
  /**
       * The condition type is undefined.
       */
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ConditionType
  
  /* 4 */ val Artifact: Artifact with scala.Double = js.native
  /* 2 */ val EnvironmentState: EnvironmentState with scala.Double = js.native
  /* 1 */ val Event: Event with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ConditionType with scala.Double
  ] = js.native
}

