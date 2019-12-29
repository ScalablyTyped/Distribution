package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  @js.native
  sealed trait landscape extends ApplicationViewOrientation
  
  @js.native
  sealed trait portrait extends ApplicationViewOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewOrientation with Double] = js.native
  /* 0 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 1 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
}

