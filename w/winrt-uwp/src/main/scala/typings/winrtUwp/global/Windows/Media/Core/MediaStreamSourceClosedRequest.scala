package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.closed event to provide information to the application. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceClosedRequest")
@js.native
abstract class MediaStreamSourceClosedRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedRequest {
  
  /** Gets the reason why the media stream source was closed. */
  /* CompleteClass */
  var reason: typings.winrtUwp.Windows.Media.Core.MediaStreamSourceClosedReason = js.native
}
