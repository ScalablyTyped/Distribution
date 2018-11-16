package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedTextSource::Resolved event. */
@JSGlobal("Windows.Media.Core.TimedTextSourceResolveResultEventArgs")
@js.native
abstract class TimedTextSourceResolveResultEventArgs () extends js.Object {
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  var error: TimedMetadataTrackError = js.native
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  var tracks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[TimedMetadataTrack] = js.native
}

