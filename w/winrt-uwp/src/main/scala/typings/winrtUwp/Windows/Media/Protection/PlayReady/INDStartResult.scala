package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Core.MediaStreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the StartAsync result that contains the created PlayReady-ND MediaStreamSource instance. */
@js.native
trait INDStartResult extends StObject {
  
  /** Gets the MediaStreamSource object for the data that the transmitter streams. */
  var mediaStreamSource: MediaStreamSource = js.native
}
object INDStartResult {
  
  @scala.inline
  def apply(mediaStreamSource: MediaStreamSource): INDStartResult = {
    val __obj = js.Dynamic.literal(mediaStreamSource = mediaStreamSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDStartResult]
  }
  
  @scala.inline
  implicit class INDStartResultMutableBuilder[Self <: INDStartResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStreamSource(value: MediaStreamSource): Self = StObject.set(x, "mediaStreamSource", value.asInstanceOf[js.Any])
  }
}
