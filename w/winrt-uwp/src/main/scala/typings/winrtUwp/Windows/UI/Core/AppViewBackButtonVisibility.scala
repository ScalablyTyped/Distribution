package typings.winrtUwp.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppViewBackButtonVisibility extends StObject
/** Defines constants that specify whether the back button is shown in the system UI. */
@JSGlobal("Windows.UI.Core.AppViewBackButtonVisibility")
@js.native
object AppViewBackButtonVisibility extends StObject {
  
  /** The back button is not shown and space is not reserved for it in the layout. */
  @js.native
  sealed trait collapsed
    extends StObject
       with AppViewBackButtonVisibility
  
  /** The back button is shown. */
  @js.native
  sealed trait visible
    extends StObject
       with AppViewBackButtonVisibility
}
