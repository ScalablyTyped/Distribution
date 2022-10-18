package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionRename1to2Action extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionRename1to2Action")
@js.native
object GitResolutionRename1to2Action extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionRename1to2Action & Double] = js.native
  
  @js.native
  sealed trait KeepBothFiles
    extends StObject
       with GitResolutionRename1to2Action
  /* 3 */ val KeepBothFiles: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepBothFiles & Double = js.native
  
  @js.native
  sealed trait KeepSourcePath
    extends StObject
       with GitResolutionRename1to2Action
  /* 1 */ val KeepSourcePath: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepSourcePath & Double = js.native
  
  @js.native
  sealed trait KeepTargetPath
    extends StObject
       with GitResolutionRename1to2Action
  /* 2 */ val KeepTargetPath: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepTargetPath & Double = js.native
  
  @js.native
  sealed trait Undecided
    extends StObject
       with GitResolutionRename1to2Action
  /* 0 */ val Undecided: typings.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.Undecided & Double = js.native
}
