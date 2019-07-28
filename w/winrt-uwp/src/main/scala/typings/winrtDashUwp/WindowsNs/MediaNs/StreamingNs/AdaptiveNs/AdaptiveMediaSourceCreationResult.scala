package typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of the creation of a AdaptiveMediaSource object. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult")
@js.native
abstract class AdaptiveMediaSourceCreationResult () extends js.Object {
  /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
  var httpResponseMessage: HttpResponseMessage = js.native
  /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
  var mediaSource: AdaptiveMediaSource = js.native
  /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
  var status: AdaptiveMediaSourceCreationStatus = js.native
}

