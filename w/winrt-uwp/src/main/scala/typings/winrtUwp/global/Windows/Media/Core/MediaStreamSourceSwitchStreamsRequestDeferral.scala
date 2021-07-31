package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed the MediaStreamSource.SwitchStreamsRequested event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequestDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral {
  
  /** Reports that the application has completed processing the MediaStreamSource.SwitchStreamsRequested event. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
