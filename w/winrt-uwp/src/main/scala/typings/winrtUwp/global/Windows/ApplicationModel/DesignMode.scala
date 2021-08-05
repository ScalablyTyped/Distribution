package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to detect whether your app is in design mode in a visual designer. */
@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
abstract class DesignMode ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.DesignMode
object DesignMode {
  
  @JSGlobal("Windows.ApplicationModel.DesignMode")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a value that indicates whether the process is running in design mode. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.DesignMode.designModeEnabled")
  @js.native
  def designModeEnabled: Boolean = js.native
  inline def designModeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("designModeEnabled")(x.asInstanceOf[js.Any])
}
