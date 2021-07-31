package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestedEventArgs")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestedEventArgs {
  
  /** Gets the object that represents the request to switch the streams. */
  /* CompleteClass */
  var request: typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest = js.native
}
