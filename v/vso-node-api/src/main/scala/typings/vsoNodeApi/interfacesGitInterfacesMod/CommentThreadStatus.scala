package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentThreadStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "CommentThreadStatus")
@js.native
object CommentThreadStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadStatus & Double] = js.native
  
  /**
    * The thread status is active.
    */
  @js.native
  sealed trait Active
    extends StObject
       with CommentThreadStatus
  /* 1 */ val Active: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.Active & Double = js.native
  
  /**
    * The thread status is resolved as by design.
    */
  @js.native
  sealed trait ByDesign
    extends StObject
       with CommentThreadStatus
  /* 5 */ val ByDesign: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.ByDesign & Double = js.native
  
  /**
    * The thread status is closed.
    */
  @js.native
  sealed trait Closed
    extends StObject
       with CommentThreadStatus
  /* 4 */ val Closed: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.Closed & Double = js.native
  
  /**
    * The thread status is resolved as fixed.
    */
  @js.native
  sealed trait Fixed
    extends StObject
       with CommentThreadStatus
  /* 2 */ val Fixed: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.Fixed & Double = js.native
  
  /**
    * The thread status is pending.
    */
  @js.native
  sealed trait Pending
    extends StObject
       with CommentThreadStatus
  /* 6 */ val Pending: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.Pending & Double = js.native
  
  /**
    * The thread status is unknown.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with CommentThreadStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.Unknown & Double = js.native
  
  /**
    * The thread status is resolved as won't fix.
    */
  @js.native
  sealed trait WontFix
    extends StObject
       with CommentThreadStatus
  /* 3 */ val WontFix: typings.vsoNodeApi.interfacesGitInterfacesMod.CommentThreadStatus.WontFix & Double = js.native
}
