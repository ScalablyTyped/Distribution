package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Core.MediaSourceStateChangedEventArgs")
@js.native
abstract class MediaSourceStateChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaSourceStateChangedEventArgs {
  
  /** Gets the new current state of the MediaSource . */
  /* CompleteClass */
  var newState: typings.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
  
  /** Gets the previous state of the MediaSource before the state changed. */
  /* CompleteClass */
  var oldState: typings.winrtUwp.Windows.Media.Core.MediaSourceState = js.native
}
