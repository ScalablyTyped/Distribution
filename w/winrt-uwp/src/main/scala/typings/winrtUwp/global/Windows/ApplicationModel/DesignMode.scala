package typings.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to detect whether your app is in design mode in a visual designer. */
@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
abstract class DesignMode ()
  extends typings.winrtUwp.Windows.ApplicationModel.DesignMode
/* static members */
@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
object DesignMode extends js.Object {
  
  /** Gets a value that indicates whether the process is running in design mode. */
  var designModeEnabled: Boolean = js.native
}
