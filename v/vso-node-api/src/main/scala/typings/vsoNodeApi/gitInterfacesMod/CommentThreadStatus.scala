package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentThreadStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentThreadStatus")
@js.native
object CommentThreadStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadStatus with Double] = js.native
  
  /**
    * The thread status is active.
    */
  @js.native
  sealed trait Active extends CommentThreadStatus
  /* 1 */ val Active: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.Active with Double = js.native
  
  /**
    * The thread status is resolved as by design.
    */
  @js.native
  sealed trait ByDesign extends CommentThreadStatus
  /* 5 */ val ByDesign: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.ByDesign with Double = js.native
  
  /**
    * The thread status is closed.
    */
  @js.native
  sealed trait Closed extends CommentThreadStatus
  /* 4 */ val Closed: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.Closed with Double = js.native
  
  /**
    * The thread status is resolved as fixed.
    */
  @js.native
  sealed trait Fixed extends CommentThreadStatus
  /* 2 */ val Fixed: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.Fixed with Double = js.native
  
  /**
    * The thread status is pending.
    */
  @js.native
  sealed trait Pending extends CommentThreadStatus
  /* 6 */ val Pending: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.Pending with Double = js.native
  
  /**
    * The thread status is unknown.
    */
  @js.native
  sealed trait Unknown extends CommentThreadStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.Unknown with Double = js.native
  
  /**
    * The thread status is resolved as won't fix.
    */
  @js.native
  sealed trait WontFix extends CommentThreadStatus
  /* 3 */ val WontFix: typings.vsoNodeApi.gitInterfacesMod.CommentThreadStatus.WontFix with Double = js.native
}
