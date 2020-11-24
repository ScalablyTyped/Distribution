package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoaderState extends js.Object
@JSImport("xelib", "LoaderState")
@js.native
object LoaderState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoaderState with Double] = js.native
  
  /**
    * Indicates the loader is currently active.
    */
  @js.native
  sealed trait IsActive extends LoaderState
  /* 1 */ @js.native
  object IsActive extends TopLevel[IsActive with Double]
  
  /**
    * Indicates the loader is done.
    */
  @js.native
  sealed trait IsDone extends LoaderState
  /* 2 */ @js.native
  object IsDone extends TopLevel[IsDone with Double]
  
  /**
    * Indicates the loader encountered an error.
    */
  @js.native
  sealed trait IsError extends LoaderState
  /* 3 */ @js.native
  object IsError extends TopLevel[IsError with Double]
  
  /**
    * Indicates the loader hasn't been run and isn't running.
    */
  @js.native
  sealed trait IsInactive extends LoaderState
  /* 0 */ @js.native
  object IsInactive extends TopLevel[IsInactive with Double]
}
