package typings.winrtDashUwp.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadActivationMode extends js.Object

/** Indicates when Windows will request a file update if another app reads the locally cached version of the file. */
@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends js.Object {
  /** Windows will trigger a file update request before allowing another app to access the local file. */
  @js.native
  sealed trait beforeAccess extends ReadActivationMode
  
  /** Windows will not trigger a file update request when another app accesses the local file. */
  @js.native
  sealed trait notNeeded extends ReadActivationMode
  
  /* 1 */ val beforeAccess: typings.winrtDashUwp.Windows.Storage.Provider.ReadActivationMode.beforeAccess with Double = js.native
  /* 0 */ val notNeeded: typings.winrtDashUwp.Windows.Storage.Provider.ReadActivationMode.notNeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadActivationMode with Double] = js.native
}

