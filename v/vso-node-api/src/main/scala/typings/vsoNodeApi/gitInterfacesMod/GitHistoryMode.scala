package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitHistoryMode extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitHistoryMode")
@js.native
object GitHistoryMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitHistoryMode with Double] = js.native
  
  /**
    * The history mode used by `git log --first-parent`
    */
  @js.native
  sealed trait FirstParent extends GitHistoryMode
  /* 1 */ val FirstParent: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FirstParent with Double = js.native
  
  /**
    * The history mode used by `git log --full-history`
    */
  @js.native
  sealed trait FullHistory extends GitHistoryMode
  /* 2 */ val FullHistory: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FullHistory with Double = js.native
  
  /**
    * The history mode used by `git log --full-history --simplify-merges`
    */
  @js.native
  sealed trait FullHistorySimplifyMerges extends GitHistoryMode
  /* 3 */ val FullHistorySimplifyMerges: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FullHistorySimplifyMerges with Double = js.native
  
  /**
    * The history mode used by `git log`. This is the default.
    */
  @js.native
  sealed trait SimplifiedHistory extends GitHistoryMode
  /* 0 */ val SimplifiedHistory: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.SimplifiedHistory with Double = js.native
}
