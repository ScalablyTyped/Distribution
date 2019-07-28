package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitHistoryMode extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitHistoryMode")
@js.native
object GitHistoryMode extends js.Object {
  /**
    * The history mode used by `git log --first-parent`
    */
  @js.native
  sealed trait FirstParent extends GitHistoryMode
  
  /**
    * The history mode used by `git log --full-history`
    */
  @js.native
  sealed trait FullHistory extends GitHistoryMode
  
  /**
    * The history mode used by `git log --full-history --simplify-merges`
    */
  @js.native
  sealed trait FullHistorySimplifyMerges extends GitHistoryMode
  
  /**
    * The history mode used by `git log`. This is the default.
    */
  @js.native
  sealed trait SimplifiedHistory extends GitHistoryMode
  
  /* 1 */ val FirstParent: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitHistoryMode.FirstParent with Double = js.native
  /* 2 */ val FullHistory: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitHistoryMode.FullHistory with Double = js.native
  /* 3 */ val FullHistorySimplifyMerges: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitHistoryMode.FullHistorySimplifyMerges with Double = js.native
  /* 0 */ val SimplifiedHistory: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitHistoryMode.SimplifiedHistory with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitHistoryMode with Double] = js.native
}

