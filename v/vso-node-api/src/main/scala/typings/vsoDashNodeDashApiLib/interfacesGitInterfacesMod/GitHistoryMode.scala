package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait FirstParent
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitHistoryMode
  
  /**
    * The history mode used by `git log --full-history`
    */
  @js.native
  sealed trait FullHistory
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitHistoryMode
  
  /**
    * The history mode used by `git log --full-history --simplify-merges`
    */
  @js.native
  sealed trait FullHistorySimplifyMerges
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitHistoryMode
  
  /**
    * The history mode used by `git log`. This is the default.
    */
  @js.native
  sealed trait SimplifiedHistory
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitHistoryMode
  
  /* 1 */ val FirstParent: FirstParent with scala.Double = js.native
  /* 2 */ val FullHistory: FullHistory with scala.Double = js.native
  /* 3 */ val FullHistorySimplifyMerges: FullHistorySimplifyMerges with scala.Double = js.native
  /* 0 */ val SimplifiedHistory: SimplifiedHistory with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitHistoryMode with scala.Double
  ] = js.native
}

