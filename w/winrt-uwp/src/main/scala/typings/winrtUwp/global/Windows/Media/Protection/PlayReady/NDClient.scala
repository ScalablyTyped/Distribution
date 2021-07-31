package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDDownloadEngine
import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDMessenger
import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDStreamParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates PlayReady-ND sessions, coordinates with the download engine and the stream parser (for example, an MPEG-2 demuxer), manages the sample buffer, and listens to media stream source events. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDClient")
@js.native
class NDClient protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.NDClient {
  /**
    * Creates a new instance of the NDClient class.
    * @param downloadEngine The download engine used to stream protected media content from a transmitter.
    * @param streamParser The stream parser used to parse data from a media stream.
    * @param pMessenger The messenger used to send messages between the PlayReady-ND receiver and transmitter.
    */
  def this(downloadEngine: INDDownloadEngine, streamParser: INDStreamParser, pMessenger: INDMessenger) = this()
}
