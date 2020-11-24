package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParallelExecutionTypes extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ParallelExecutionTypes")
@js.native
object ParallelExecutionTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParallelExecutionTypes with Double] = js.native
  
  @js.native
  sealed trait MultiConfiguration extends ParallelExecutionTypes
  /* 1 */ @js.native
  object MultiConfiguration extends TopLevel[MultiConfiguration with Double]
  
  @js.native
  sealed trait MultiMachine extends ParallelExecutionTypes
  /* 2 */ @js.native
  object MultiMachine extends TopLevel[MultiMachine with Double]
  
  @js.native
  sealed trait None extends ParallelExecutionTypes
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
