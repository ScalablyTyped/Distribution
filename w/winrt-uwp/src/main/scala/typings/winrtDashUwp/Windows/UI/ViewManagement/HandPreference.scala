package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.ViewManagement.HandPreference.leftHanded
import typings.winrtDashUwp.Windows.UI.ViewManagement.HandPreference.rightHanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandPreference extends js.Object

/** Defines the set of directional preferences for the user interface presented by the app view. */
@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends js.Object {
  /** The preferred layout is for left-directional users. */
  @js.native
  sealed trait leftHanded extends HandPreference
  
  /** The preferred layout is for right-directional users. */
  @js.native
  sealed trait rightHanded extends HandPreference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandPreference with Double] = js.native
  /* 0 */ @js.native
  object leftHanded extends TopLevel[leftHanded with Double]
  
  /* 1 */ @js.native
  object rightHanded extends TopLevel[rightHanded with Double]
  
}

