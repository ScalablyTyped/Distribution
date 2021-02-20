package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoaderState extends StObject
@JSImport("xelib", "LoaderState")
@js.native
object LoaderState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoaderState with Double] = js.native
  
  /**
    * Indicates the loader is currently active.
    */
  @js.native
  sealed trait IsActive extends LoaderState
  /* 1 */ val IsActive: typings.xelib.mod.LoaderState.IsActive with Double = js.native
  
  /**
    * Indicates the loader is done.
    */
  @js.native
  sealed trait IsDone extends LoaderState
  /* 2 */ val IsDone: typings.xelib.mod.LoaderState.IsDone with Double = js.native
  
  /**
    * Indicates the loader encountered an error.
    */
  @js.native
  sealed trait IsError extends LoaderState
  /* 3 */ val IsError: typings.xelib.mod.LoaderState.IsError with Double = js.native
  
  /**
    * Indicates the loader hasn't been run and isn't running.
    */
  @js.native
  sealed trait IsInactive extends LoaderState
  /* 0 */ val IsInactive: typings.xelib.mod.LoaderState.IsInactive with Double = js.native
}
