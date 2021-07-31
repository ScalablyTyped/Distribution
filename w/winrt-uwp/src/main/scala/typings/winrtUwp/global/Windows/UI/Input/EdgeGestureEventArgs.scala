package typings.winrtUwp.global.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the type of user input that triggered the edge gesture event. */
@JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
@js.native
abstract class EdgeGestureEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.EdgeGestureEventArgs {
  
  /** Gets the type of user input that triggered the edge gesture event. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.UI.Input.EdgeGestureKind = js.native
}
