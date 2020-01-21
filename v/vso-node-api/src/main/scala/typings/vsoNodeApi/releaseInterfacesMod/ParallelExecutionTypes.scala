package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParallelExecutionTypes with Double] = js.native
  /* 1 */ @js.native
  object MultiConfiguration extends TopLevel[MultiConfiguration with Double]
  
  /* 2 */ @js.native
  object MultiMachine extends TopLevel[MultiMachine with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

