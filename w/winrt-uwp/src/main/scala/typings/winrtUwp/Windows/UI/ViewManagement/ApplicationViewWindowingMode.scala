package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationViewWindowingMode extends StObject
/** Defines constants that specify whether the app window is auto-sized, full-screen, or set to a specific size on launch. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewWindowingMode")
@js.native
object ApplicationViewWindowingMode extends StObject {
  
  /** The system sizes the app window automatically. */
  @js.native
  sealed trait auto
    extends StObject
       with ApplicationViewWindowingMode
  
  /** The window is full-screen. */
  @js.native
  sealed trait fullScreen
    extends StObject
       with ApplicationViewWindowingMode
  
  /** The window is sized as specified by the ApplicationView.PreferredLaunchViewSize property. */
  @js.native
  sealed trait preferredLaunchViewSize
    extends StObject
       with ApplicationViewWindowingMode
}
