package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
@JSGlobal("Windows.Media.Audio.AudioGraphSettings")
@js.native
class AudioGraphSettings protected ()
  extends typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings {
  /**
    * Initializes a new instance of the AudioGraphSettings class with initial settings values optimized for the specified AudioRenderCategory .
    * @param audioRenderCategory The AudioRenderCategory that determines the initial settings values.
    */
  def this(audioRenderCategory: AudioRenderCategory) = this()
}

