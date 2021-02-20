package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionRename1to2Action extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionRename1to2Action")
@js.native
object GitResolutionRename1to2Action extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionRename1to2Action with Double] = js.native
  
  @js.native
  sealed trait KeepBothFiles extends GitResolutionRename1to2Action
  /* 3 */ val KeepBothFiles: typings.vsoNodeApi.gitInterfacesMod.GitResolutionRename1to2Action.KeepBothFiles with Double = js.native
  
  @js.native
  sealed trait KeepSourcePath extends GitResolutionRename1to2Action
  /* 1 */ val KeepSourcePath: typings.vsoNodeApi.gitInterfacesMod.GitResolutionRename1to2Action.KeepSourcePath with Double = js.native
  
  @js.native
  sealed trait KeepTargetPath extends GitResolutionRename1to2Action
  /* 2 */ val KeepTargetPath: typings.vsoNodeApi.gitInterfacesMod.GitResolutionRename1to2Action.KeepTargetPath with Double = js.native
  
  @js.native
  sealed trait Undecided extends GitResolutionRename1to2Action
  /* 0 */ val Undecided: typings.vsoNodeApi.gitInterfacesMod.GitResolutionRename1to2Action.Undecided with Double = js.native
}
