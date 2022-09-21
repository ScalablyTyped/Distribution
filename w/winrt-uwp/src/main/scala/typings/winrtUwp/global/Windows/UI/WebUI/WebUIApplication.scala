package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.UI.WebUI.ActivatedEventHandler
import typings.winrtUwp.Windows.UI.WebUI.NavigatedEventHandler
import typings.winrtUwp.Windows.UI.WebUI.ResumingEventHandler
import typings.winrtUwp.Windows.UI.WebUI.SuspendingEventHandler
import typings.winrtUwp.winrtUwpStrings.activated
import typings.winrtUwp.winrtUwpStrings.navigated
import typings.winrtUwp.winrtUwpStrings.resuming
import typings.winrtUwp.winrtUwpStrings.suspending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to receive notifications related to the lifetime of the app. */
@JSGlobal("Windows.UI.WebUI.WebUIApplication")
@js.native
abstract class WebUIApplication ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIApplication
object WebUIApplication {
  
  @JSGlobal("Windows.UI.WebUI.WebUIApplication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Occurs when the app is activated. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onactivated")
  @js.native
  def onactivated: ActivatedEventHandler = js.native
  inline def onactivated_=(x: ActivatedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onactivated")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is navigating. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onnavigated")
  @js.native
  def onnavigated: NavigatedEventHandler = js.native
  inline def onnavigated_=(x: NavigatedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnavigated")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is resuming. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onresuming")
  @js.native
  def onresuming: ResumingEventHandler = js.native
  inline def onresuming_=(x: ResumingEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(x.asInstanceOf[js.Any])
  
  /** Occurs when the app is suspending. */
  /* static member */
  @JSGlobal("Windows.UI.WebUI.WebUIApplication.onsuspending")
  @js.native
  def onsuspending: SuspendingEventHandler = js.native
  inline def onsuspending_=(x: SuspendingEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_activated(`type`: activated, listener: ActivatedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_navigated(`type`: navigated, listener: NavigatedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_resuming(`type`: resuming, listener: ResumingEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_suspending(`type`: suspending, listener: SuspendingEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
