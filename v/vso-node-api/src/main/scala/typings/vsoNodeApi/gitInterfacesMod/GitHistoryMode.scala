package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitHistoryMode extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitHistoryMode")
@js.native
object GitHistoryMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitHistoryMode & Double] = js.native
  
  /**
    * The history mode used by `git log --first-parent`
    */
  @js.native
  sealed trait FirstParent
    extends StObject
       with GitHistoryMode
  /* 1 */ val FirstParent: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FirstParent & Double = js.native
  
  /**
    * The history mode used by `git log --full-history`
    */
  @js.native
  sealed trait FullHistory
    extends StObject
       with GitHistoryMode
  /* 2 */ val FullHistory: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FullHistory & Double = js.native
  
  /**
    * The history mode used by `git log --full-history --simplify-merges`
    */
  @js.native
  sealed trait FullHistorySimplifyMerges
    extends StObject
       with GitHistoryMode
  /* 3 */ val FullHistorySimplifyMerges: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.FullHistorySimplifyMerges & Double = js.native
  
  /**
    * The history mode used by `git log`. This is the default.
    */
  @js.native
  sealed trait SimplifiedHistory
    extends StObject
       with GitHistoryMode
  /* 0 */ val SimplifiedHistory: typings.vsoNodeApi.gitInterfacesMod.GitHistoryMode.SimplifiedHistory & Double = js.native
}
