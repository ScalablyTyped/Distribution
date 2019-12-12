package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Provider.UIStatus.complete
import typings.winrt.Windows.Storage.Provider.UIStatus.hidden
import typings.winrt.Windows.Storage.Provider.UIStatus.unavailable
import typings.winrt.Windows.Storage.Provider.UIStatus.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  @js.native
  sealed trait complete extends UIStatus
  
  @js.native
  sealed trait hidden extends UIStatus
  
  @js.native
  sealed trait unavailable extends UIStatus
  
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

