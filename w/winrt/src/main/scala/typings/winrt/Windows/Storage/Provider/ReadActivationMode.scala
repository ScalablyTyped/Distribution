package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Provider.ReadActivationMode.beforeAccess
import typings.winrt.Windows.Storage.Provider.ReadActivationMode.notNeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends js.Object {
  @js.native
  sealed trait beforeAccess extends ReadActivationMode
  
  @js.native
  sealed trait notNeeded extends ReadActivationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadActivationMode with Double] = js.native
  /* 1 */ @js.native
  object beforeAccess extends TopLevel[beforeAccess with Double]
  
  /* 0 */ @js.native
  object notNeeded extends TopLevel[notNeeded with Double]
  
}

