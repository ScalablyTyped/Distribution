package typings.winrtDashUwp.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a resource download operation. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult")
@js.native
abstract class AdaptiveMediaSourceDownloadResult () extends js.Object {
  /** Gets or sets a buffer containing the downloaded resource. */
  var buffer: IBuffer = js.native
  /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
  var contentType: String = js.native
  /** Gets or sets an integer value that represents extended status information about the resource download operation. */
  var extendedStatus: Double = js.native
  /** Gets or sets an input stream containing the downloaded resource. */
  var inputStream: IInputStream = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
  var resourceUri: Uri = js.native
}

