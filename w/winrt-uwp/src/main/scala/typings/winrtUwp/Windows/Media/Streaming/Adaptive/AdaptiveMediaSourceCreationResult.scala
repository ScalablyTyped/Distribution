package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of the creation of a AdaptiveMediaSource object. */
trait AdaptiveMediaSourceCreationResult extends js.Object {
  /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
  var httpResponseMessage: HttpResponseMessage
  /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
  var mediaSource: AdaptiveMediaSource
  /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
  var status: AdaptiveMediaSourceCreationStatus
}

object AdaptiveMediaSourceCreationResult {
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    mediaSource: AdaptiveMediaSource,
    status: AdaptiveMediaSourceCreationStatus
  ): AdaptiveMediaSourceCreationResult = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceCreationResult]
  }
}

