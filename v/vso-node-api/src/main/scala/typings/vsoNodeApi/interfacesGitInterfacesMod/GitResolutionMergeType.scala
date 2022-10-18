package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionMergeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionMergeType")
@js.native
object GitResolutionMergeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionMergeType & Double] = js.native
  
  @js.native
  sealed trait AutoMerged
    extends StObject
       with GitResolutionMergeType
  /* 3 */ val AutoMerged: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionMergeType.AutoMerged & Double = js.native
  
  @js.native
  sealed trait TakeSourceContent
    extends StObject
       with GitResolutionMergeType
  /* 1 */ val TakeSourceContent: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeSourceContent & Double = js.native
  
  @js.native
  sealed trait TakeTargetContent
    extends StObject
       with GitResolutionMergeType
  /* 2 */ val TakeTargetContent: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeTargetContent & Double = js.native
  
  @js.native
  sealed trait Undecided
    extends StObject
       with GitResolutionMergeType
  /* 0 */ val Undecided: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionMergeType.Undecided & Double = js.native
  
  @js.native
  sealed trait UserMerged
    extends StObject
       with GitResolutionMergeType
  /* 4 */ val UserMerged: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionMergeType.UserMerged & Double = js.native
}
