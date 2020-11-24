package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskResult extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TaskResult")
@js.native
object TaskResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult with Double] = js.native
  
  @js.native
  sealed trait Abandoned extends TaskResult
  /* 5 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  @js.native
  sealed trait Canceled extends TaskResult
  /* 3 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Failed extends TaskResult
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait Skipped extends TaskResult
  /* 4 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  @js.native
  sealed trait Succeeded extends TaskResult
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  @js.native
  sealed trait SucceededWithIssues extends TaskResult
  /* 1 */ @js.native
  object SucceededWithIssues extends TopLevel[SucceededWithIssues with Double]
}
