package typings.winrtUwp.Windows.Media.Effects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio effect. */
trait AudioEffect extends js.Object {
  /** Gets the type of the audio effect. */
  var audioEffectType: AudioEffectType
}

object AudioEffect {
  @scala.inline
  def apply(audioEffectType: AudioEffectType): AudioEffect = {
    val __obj = js.Dynamic.literal(audioEffectType = audioEffectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEffect]
  }
}

