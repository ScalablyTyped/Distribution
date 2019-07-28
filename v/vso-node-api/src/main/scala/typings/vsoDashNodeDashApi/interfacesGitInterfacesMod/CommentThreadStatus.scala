package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommentThreadStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentThreadStatus")
@js.native
object CommentThreadStatus extends js.Object {
  /**
    * The thread status is active.
    */
  @js.native
  sealed trait Active extends CommentThreadStatus
  
  /**
    * The thread status is resolved as by design.
    */
  @js.native
  sealed trait ByDesign extends CommentThreadStatus
  
  /**
    * The thread status is closed.
    */
  @js.native
  sealed trait Closed extends CommentThreadStatus
  
  /**
    * The thread status is resolved as fixed.
    */
  @js.native
  sealed trait Fixed extends CommentThreadStatus
  
  /**
    * The thread status is pending.
    */
  @js.native
  sealed trait Pending extends CommentThreadStatus
  
  /**
    * The thread status is unknown.
    */
  @js.native
  sealed trait Unknown extends CommentThreadStatus
  
  /**
    * The thread status is resolved as won't fix.
    */
  @js.native
  sealed trait WontFix extends CommentThreadStatus
  
  /* 1 */ val Active: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.Active with Double = js.native
  /* 5 */ val ByDesign: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.ByDesign with Double = js.native
  /* 4 */ val Closed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.Closed with Double = js.native
  /* 2 */ val Fixed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.Fixed with Double = js.native
  /* 6 */ val Pending: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.Pending with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.Unknown with Double = js.native
  /* 3 */ val WontFix: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.CommentThreadStatus.WontFix with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadStatus with Double] = js.native
}

