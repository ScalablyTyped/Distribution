package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionStatus & Double] = js.native
  
  @js.native
  sealed trait PartiallyResolved
    extends StObject
       with GitResolutionStatus
  /* 1 */ val PartiallyResolved: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionStatus.PartiallyResolved & Double = js.native
  
  @js.native
  sealed trait Resolved
    extends StObject
       with GitResolutionStatus
  /* 2 */ val Resolved: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionStatus.Resolved & Double = js.native
  
  @js.native
  sealed trait Unresolved
    extends StObject
       with GitResolutionStatus
  /* 0 */ val Unresolved: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionStatus.Unresolved & Double = js.native
}
