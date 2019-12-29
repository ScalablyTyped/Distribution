package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandPreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends js.Object {
  @js.native
  sealed trait leftHanded extends HandPreference
  
  @js.native
  sealed trait rightHanded extends HandPreference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandPreference with Double] = js.native
  /* 0 */ @js.native
  object leftHanded extends TopLevel[leftHanded with Double]
  
  /* 1 */ @js.native
  object rightHanded extends TopLevel[rightHanded with Double]
  
}

