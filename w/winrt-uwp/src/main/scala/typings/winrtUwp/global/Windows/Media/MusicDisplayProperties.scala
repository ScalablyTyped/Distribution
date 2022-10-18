package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for music information that is displayed by the SystemMediaTransportControlsDisplayUpdater class. */
/* note: abstract class */ @JSGlobal("Windows.Media.MusicDisplayProperties")
@js.native
open class MusicDisplayProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Media.MusicDisplayProperties {
  
  /** Gets or sets the name of the album artist. */
  /* CompleteClass */
  var albumArtist: String = js.native
  
  /** Gets or sets the album title. */
  /* CompleteClass */
  var albumTitle: String = js.native
  
  /** Gets or set the name of the song artist. */
  /* CompleteClass */
  var artist: String = js.native
  
  /** Gets a modifiable list of strings representing genre names. */
  /* CompleteClass */
  var genres: IVector[String] = js.native
  
  /** Gets or set the title of the song. */
  /* CompleteClass */
  var title: String = js.native
  
  /** Gets or sets the track number. */
  /* CompleteClass */
  var trackNumber: Double = js.native
}
