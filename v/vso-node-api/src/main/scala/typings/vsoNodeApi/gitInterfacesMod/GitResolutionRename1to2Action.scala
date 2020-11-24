package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionRename1to2Action extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionRename1to2Action")
@js.native
object GitResolutionRename1to2Action extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionRename1to2Action with Double] = js.native
  
  @js.native
  sealed trait KeepBothFiles extends GitResolutionRename1to2Action
  /* 3 */ @js.native
  object KeepBothFiles extends TopLevel[KeepBothFiles with Double]
  
  @js.native
  sealed trait KeepSourcePath extends GitResolutionRename1to2Action
  /* 1 */ @js.native
  object KeepSourcePath extends TopLevel[KeepSourcePath with Double]
  
  @js.native
  sealed trait KeepTargetPath extends GitResolutionRename1to2Action
  /* 2 */ @js.native
  object KeepTargetPath extends TopLevel[KeepTargetPath with Double]
  
  @js.native
  sealed trait Undecided extends GitResolutionRename1to2Action
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
}
