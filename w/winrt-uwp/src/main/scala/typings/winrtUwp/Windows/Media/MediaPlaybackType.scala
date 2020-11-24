package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackType extends js.Object
/** Defines values for the types of media playback. */
@JSGlobal("Windows.Media.MediaPlaybackType")
@js.native
object MediaPlaybackType extends js.Object {
  
  /** The media type is an image. */
  @js.native
  sealed trait image extends MediaPlaybackType
  
  /** The media type is audio music. */
  @js.native
  sealed trait music extends MediaPlaybackType
  
  /** The media type is unknown. */
  @js.native
  sealed trait unknown extends MediaPlaybackType
  
  /** The media type is video. */
  @js.native
  sealed trait video extends MediaPlaybackType
}
