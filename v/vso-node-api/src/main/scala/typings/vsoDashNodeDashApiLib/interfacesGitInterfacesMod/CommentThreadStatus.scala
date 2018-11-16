package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Active
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is resolved as by design.
       */
  @js.native
  sealed trait ByDesign
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is closed.
       */
  @js.native
  sealed trait Closed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is resolved as fixed.
       */
  @js.native
  sealed trait Fixed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is pending.
       */
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is unknown.
       */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /**
       * The thread status is resolved as won't fix.
       */
  @js.native
  sealed trait WontFix
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus
  
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 5 */ val ByDesign: ByDesign with scala.Double = js.native
  /* 4 */ val Closed: Closed with scala.Double = js.native
  /* 2 */ val Fixed: Fixed with scala.Double = js.native
  /* 6 */ val Pending: Pending with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 3 */ val WontFix: WontFix with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.CommentThreadStatus with scala.Double
  ] = js.native
}

