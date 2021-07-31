package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationViewState extends StObject
/** Specifies the set of app view state changes that can be handled. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends StObject {
  
  /** The current app's view has been reduced to a partial screen view as the result of another app snapping. */
  @js.native
  sealed trait filled
    extends StObject
       with ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to landscape orientation. */
  @js.native
  sealed trait fullScreenLandscape
    extends StObject
       with ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to portrait orientation. */
  @js.native
  sealed trait fullScreenPortrait
    extends StObject
       with ApplicationViewState
  
  /** The current app's view has been snapped. */
  @js.native
  sealed trait snapped
    extends StObject
       with ApplicationViewState
}
