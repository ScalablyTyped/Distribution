package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.FocusMode.auto
import typings.winrtDashUwp.Windows.Media.Devices.FocusMode.continuous
import typings.winrtDashUwp.Windows.Media.Devices.FocusMode.manual
import typings.winrtDashUwp.Windows.Media.Devices.FocusMode.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusMode extends js.Object

/** Defines the values for focus mode. */
@JSGlobal("Windows.Media.Devices.FocusMode")
@js.native
object FocusMode extends js.Object {
  /** Use autofocus. */
  @js.native
  sealed trait auto extends FocusMode
  
  /** Continuously adjust focus. */
  @js.native
  sealed trait continuous extends FocusMode
  
  /** Use manual focus. */
  @js.native
  sealed trait manual extends FocusMode
  
  /** Focus once. */
  @js.native
  sealed trait single extends FocusMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusMode with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 2 */ @js.native
  object continuous extends TopLevel[continuous with Double]
  
  /* 3 */ @js.native
  object manual extends TopLevel[manual with Double]
  
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
  
}

