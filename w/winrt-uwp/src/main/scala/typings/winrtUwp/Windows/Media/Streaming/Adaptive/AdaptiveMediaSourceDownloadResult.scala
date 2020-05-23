package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a resource download operation. */
trait AdaptiveMediaSourceDownloadResult extends js.Object {
  /** Gets or sets a buffer containing the downloaded resource. */
  var buffer: IBuffer
  /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
  var contentType: String
  /** Gets or sets an integer value that represents extended status information about the resource download operation. */
  var extendedStatus: Double
  /** Gets or sets an input stream containing the downloaded resource. */
  var inputStream: IInputStream
  /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
  var resourceUri: Uri
}

object AdaptiveMediaSourceDownloadResult {
  @scala.inline
  def apply(
    buffer: IBuffer,
    contentType: String,
    extendedStatus: Double,
    inputStream: IInputStream,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], extendedStatus = extendedStatus.asInstanceOf[js.Any], inputStream = inputStream.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadResult]
  }
}

