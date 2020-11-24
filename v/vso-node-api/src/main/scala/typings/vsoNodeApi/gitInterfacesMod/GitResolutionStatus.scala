package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionStatus with Double] = js.native
  
  @js.native
  sealed trait PartiallyResolved extends GitResolutionStatus
  /* 1 */ @js.native
  object PartiallyResolved extends TopLevel[PartiallyResolved with Double]
  
  @js.native
  sealed trait Resolved extends GitResolutionStatus
  /* 2 */ @js.native
  object Resolved extends TopLevel[Resolved with Double]
  
  @js.native
  sealed trait Unresolved extends GitResolutionStatus
  /* 0 */ @js.native
  object Unresolved extends TopLevel[Unresolved with Double]
}
