package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
/* note: abstract class */ @JSGlobal("Windows.Media.VideoDisplayProperties")
@js.native
open class VideoDisplayProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Media.VideoDisplayProperties {
  
  /** Gets a modifiable list of strings representing genre names. */
  /* CompleteClass */
  var genres: IVector[String] = js.native
  
  /** Gets or sets the subtitle of the video. */
  /* CompleteClass */
  var subtitle: String = js.native
  
  /** Gets or sets the title of the video. */
  /* CompleteClass */
  var title: String = js.native
}
