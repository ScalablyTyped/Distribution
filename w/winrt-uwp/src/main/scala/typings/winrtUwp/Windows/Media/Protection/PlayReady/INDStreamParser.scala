package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.AnonStreamType
import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses data from a PlayReady-ND media stream. */
trait INDStreamParser extends js.Object {
  /** Gets the stream parser notifier that will provide notification of stream parser events from the transmitter. */
  var notifier: NDStreamParserNotifier
  /** Notifies a PlayReady-ND stream parser to be ready for the beginning of a new media stream. */
  def beginOfStream(): Unit
  /** Notifies a PlayReady-ND stream parser that the end of a media stream has been reached. */
  def endOfStream(): Unit
  /**
    * Retrieves the stream type (audio or video) and stream identifier of the media stream descriptor.
    * @param descriptor The media stream from which this method gets information.
    */
  def getStreamInformation(descriptor: IMediaStreamDescriptor): AnonStreamType
  /**
    * Parses samples from a PlayReady-ND media stream.
    * @param dataBytes The data to be parsed.
    */
  def parseData(dataBytes: js.Array[Double]): Unit
}

object INDStreamParser {
  @scala.inline
  def apply(
    beginOfStream: () => Unit,
    endOfStream: () => Unit,
    getStreamInformation: IMediaStreamDescriptor => AnonStreamType,
    notifier: NDStreamParserNotifier,
    parseData: js.Array[Double] => Unit
  ): INDStreamParser = {
    val __obj = js.Dynamic.literal(beginOfStream = js.Any.fromFunction0(beginOfStream), endOfStream = js.Any.fromFunction0(endOfStream), getStreamInformation = js.Any.fromFunction1(getStreamInformation), notifier = notifier.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData))
  
    __obj.asInstanceOf[INDStreamParser]
  }
}

