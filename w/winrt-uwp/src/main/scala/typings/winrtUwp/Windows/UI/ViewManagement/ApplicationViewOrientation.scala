package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationViewOrientation extends StObject
/** Defines the set of display orientation modes for a window (app view). */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends StObject {
  
  /** The window is in landscape orientation, with the display width greater than the height. */
  @js.native
  sealed trait landscape
    extends StObject
       with ApplicationViewOrientation
  
  /** The window is in portrait orientation, with the display height greater than the width. */
  @js.native
  sealed trait portrait
    extends StObject
       with ApplicationViewOrientation
}
