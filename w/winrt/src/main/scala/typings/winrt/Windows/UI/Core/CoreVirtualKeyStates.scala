package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreVirtualKeyStates extends js.Object

@JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
@js.native
object CoreVirtualKeyStates extends js.Object {
  @js.native
  sealed trait down extends CoreVirtualKeyStates
  
  @js.native
  sealed trait locked extends CoreVirtualKeyStates
  
  @js.native
  sealed trait none extends CoreVirtualKeyStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreVirtualKeyStates with Double] = js.native
  /* 1 */ @js.native
  object down extends TopLevel[down with Double]
  
  /* 2 */ @js.native
  object locked extends TopLevel[locked with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

