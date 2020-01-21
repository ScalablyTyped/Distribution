package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentThreadStatus with Double] = js.native
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 5 */ @js.native
  object ByDesign extends TopLevel[ByDesign with Double]
  
  /* 4 */ @js.native
  object Closed extends TopLevel[Closed with Double]
  
  /* 2 */ @js.native
  object Fixed extends TopLevel[Fixed with Double]
  
  /* 6 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 3 */ @js.native
  object WontFix extends TopLevel[WontFix with Double]
  
}

