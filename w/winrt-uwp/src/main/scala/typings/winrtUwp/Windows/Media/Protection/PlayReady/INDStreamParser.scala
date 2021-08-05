package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import typings.winrtUwp.anon.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parses data from a PlayReady-ND media stream. */
trait INDStreamParser extends StObject {
  
  /** Notifies a PlayReady-ND stream parser to be ready for the beginning of a new media stream. */
  def beginOfStream(): Unit
  
  /** Notifies a PlayReady-ND stream parser that the end of a media stream has been reached. */
  def endOfStream(): Unit
  
  /**
    * Retrieves the stream type (audio or video) and stream identifier of the media stream descriptor.
    * @param descriptor The media stream from which this method gets information.
    */
  def getStreamInformation(descriptor: IMediaStreamDescriptor): StreamType
  
  /** Gets the stream parser notifier that will provide notification of stream parser events from the transmitter. */
  var notifier: NDStreamParserNotifier
  
  /**
    * Parses samples from a PlayReady-ND media stream.
    * @param dataBytes The data to be parsed.
    */
  def parseData(dataBytes: js.Array[Double]): Unit
}
object INDStreamParser {
  
  inline def apply(
    beginOfStream: () => Unit,
    endOfStream: () => Unit,
    getStreamInformation: IMediaStreamDescriptor => StreamType,
    notifier: NDStreamParserNotifier,
    parseData: js.Array[Double] => Unit
  ): INDStreamParser = {
    val __obj = js.Dynamic.literal(beginOfStream = js.Any.fromFunction0(beginOfStream), endOfStream = js.Any.fromFunction0(endOfStream), getStreamInformation = js.Any.fromFunction1(getStreamInformation), notifier = notifier.asInstanceOf[js.Any], parseData = js.Any.fromFunction1(parseData))
    __obj.asInstanceOf[INDStreamParser]
  }
  
  extension [Self <: INDStreamParser](x: Self) {
    
    inline def setBeginOfStream(value: () => Unit): Self = StObject.set(x, "beginOfStream", js.Any.fromFunction0(value))
    
    inline def setEndOfStream(value: () => Unit): Self = StObject.set(x, "endOfStream", js.Any.fromFunction0(value))
    
    inline def setGetStreamInformation(value: IMediaStreamDescriptor => StreamType): Self = StObject.set(x, "getStreamInformation", js.Any.fromFunction1(value))
    
    inline def setNotifier(value: NDStreamParserNotifier): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    
    inline def setParseData(value: js.Array[Double] => Unit): Self = StObject.set(x, "parseData", js.Any.fromFunction1(value))
  }
}
