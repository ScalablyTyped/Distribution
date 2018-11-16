package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses data from a PlayReady-ND media stream. */

trait INDStreamParser extends js.Object {
  /** Gets the stream parser notifier that will provide notification of stream parser events from the transmitter. */
  var notifier: NDStreamParserNotifier
  /** Notifies a PlayReady-ND stream parser to be ready for the beginning of a new media stream. */
  def beginOfStream(): scala.Unit
  /** Notifies a PlayReady-ND stream parser that the end of a media stream has been reached. */
  def endOfStream(): scala.Unit
  /**
                       * Retrieves the stream type (audio or video) and stream identifier of the media stream descriptor.
                       * @param descriptor The media stream from which this method gets information.
                       */
  def getStreamInformation(descriptor: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaStreamDescriptor): winrtDashUwpLib.Anon_StreamType
  /**
                       * Parses samples from a PlayReady-ND media stream.
                       * @param dataBytes The data to be parsed.
                       */
  def parseData(dataBytes: js.Array[scala.Double]): scala.Unit
}

