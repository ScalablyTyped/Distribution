package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
@JSGlobal("Windows.Media.MusicDisplayProperties")
@js.native
abstract class MusicDisplayProperties ()
  extends typings.winrtUwp.Windows.Media.MusicDisplayProperties {
  /** Gets or sets the name of the album artist. */
  /* CompleteClass */
  override var albumArtist: String = js.native
  /** Gets or sets the album title. */
  /* CompleteClass */
  override var albumTitle: String = js.native
  /** Gets or set the name of the song artist. */
  /* CompleteClass */
  override var artist: String = js.native
  /** Gets a modifiable list of strings representing genre names. */
  /* CompleteClass */
  override var genres: IVector[String] = js.native
  /** Gets or set the title of the song. */
  /* CompleteClass */
  override var title: String = js.native
  /** Gets or sets the track number. */
  /* CompleteClass */
  override var trackNumber: Double = js.native
}

