package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionStatus with Double] = js.native
  
  @js.native
  sealed trait PartiallyResolved extends GitResolutionStatus
  /* 1 */ val PartiallyResolved: typings.vsoNodeApi.gitInterfacesMod.GitResolutionStatus.PartiallyResolved with Double = js.native
  
  @js.native
  sealed trait Resolved extends GitResolutionStatus
  /* 2 */ val Resolved: typings.vsoNodeApi.gitInterfacesMod.GitResolutionStatus.Resolved with Double = js.native
  
  @js.native
  sealed trait Unresolved extends GitResolutionStatus
  /* 0 */ val Unresolved: typings.vsoNodeApi.gitInterfacesMod.GitResolutionStatus.Unresolved with Double = js.native
}
