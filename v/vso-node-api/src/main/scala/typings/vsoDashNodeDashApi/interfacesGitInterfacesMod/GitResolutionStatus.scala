package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends js.Object {
  @js.native
  sealed trait PartiallyResolved extends GitResolutionStatus
  
  @js.native
  sealed trait Resolved extends GitResolutionStatus
  
  @js.native
  sealed trait Unresolved extends GitResolutionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionStatus with Double] = js.native
  /* 1 */ @js.native
  object PartiallyResolved extends TopLevel[PartiallyResolved with Double]
  
  /* 2 */ @js.native
  object Resolved extends TopLevel[Resolved with Double]
  
  /* 0 */ @js.native
  object Unresolved extends TopLevel[Unresolved with Double]
  
}

