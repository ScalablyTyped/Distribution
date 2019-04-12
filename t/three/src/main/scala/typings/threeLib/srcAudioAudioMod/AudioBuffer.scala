package typings
package threeLib.srcAudioAudioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/Audio", "AudioBuffer")
@js.native
class AudioBuffer protected () extends js.Object {
  def this(context: js.Any) = this()
  var context: js.Any = js.native
  var ready: scala.Boolean = js.native
  var readyCallbacks: js.Array[js.Function] = js.native
  def load(file: java.lang.String): AudioBuffer = js.native
  def onReady(callback: js.Function): scala.Unit = js.native
}

