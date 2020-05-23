package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.DataCue")
@js.native
/** Initializes a new instance of the DataCue class. */
class DataCue ()
  extends typings.winrtUwp.Windows.Media.Core.DataCue {
  /** Gets the data associated with the cue. */
  /* CompleteClass */
  override var data: IBuffer = js.native
  /** Gets or sets the duration of the cue. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets the identifier for the timed metadata track. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the start time of the cue. */
  /* CompleteClass */
  override var startTime: Double = js.native
}

