package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

/** Indicates the status of the file picker UI. */
@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  /** The file picker is currently showing UI and all */
  @js.native
  sealed trait complete extends UIStatus
  
  /** The file picker is not showing UI, but UI can be requested. */
  @js.native
  sealed trait hidden extends UIStatus
  
  /** The file picker is not showing UI and UI can't be requested. */
  @js.native
  sealed trait unavailable extends UIStatus
  
  /** The file picker is currently showing UI because UI was requested by the app. */
  @js.native
  sealed trait visible extends UIStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIStatus with Double] = js.native
  /* 3 */ @js.native
  object complete extends TopLevel[complete with Double]
  
  /* 1 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 0 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
  /* 2 */ @js.native
  object visible extends TopLevel[visible with Double]
  
}

