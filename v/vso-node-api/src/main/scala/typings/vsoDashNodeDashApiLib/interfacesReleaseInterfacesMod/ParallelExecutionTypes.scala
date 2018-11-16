package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParallelExecutionTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ParallelExecutionTypes")
@js.native
object ParallelExecutionTypes extends js.Object {
  @js.native
  sealed trait MultiConfiguration
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ParallelExecutionTypes
  
  @js.native
  sealed trait MultiMachine
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ParallelExecutionTypes
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ParallelExecutionTypes
  
  /* 1 */ val MultiConfiguration: MultiConfiguration with scala.Double = js.native
  /* 2 */ val MultiMachine: MultiMachine with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ParallelExecutionTypes with scala.Double
  ] = js.native
}

