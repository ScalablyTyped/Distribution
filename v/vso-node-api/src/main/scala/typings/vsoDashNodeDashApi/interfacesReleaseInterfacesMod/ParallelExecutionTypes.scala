package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParallelExecutionTypes extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ParallelExecutionTypes")
@js.native
object ParallelExecutionTypes extends js.Object {
  @js.native
  sealed trait MultiConfiguration extends ParallelExecutionTypes
  
  @js.native
  sealed trait MultiMachine extends ParallelExecutionTypes
  
  @js.native
  sealed trait None extends ParallelExecutionTypes
  
  /* 1 */ val MultiConfiguration: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.MultiConfiguration with Double = js.native
  /* 2 */ val MultiMachine: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.MultiMachine with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ParallelExecutionTypes.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParallelExecutionTypes with Double] = js.native
}

