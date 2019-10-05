package typings.winrt.Windows.Storage.Provider

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
  
  /* 1 */ val beforeAccess: typings.winrt.Windows.Storage.Provider.ReadActivationMode.beforeAccess with Double = js.native
  /* 0 */ val notNeeded: typings.winrt.Windows.Storage.Provider.ReadActivationMode.notNeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadActivationMode with Double] = js.native
}

