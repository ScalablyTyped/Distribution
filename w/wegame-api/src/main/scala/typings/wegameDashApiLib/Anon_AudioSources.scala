package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioSources extends js.Object {
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[wegameDashApiLib.wxNs.typesNs.AudioSourceType]
}

object Anon_AudioSources {
  @scala.inline
  def apply(audioSources: js.Array[wegameDashApiLib.wxNs.typesNs.AudioSourceType]): Anon_AudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources)
  
    __obj.asInstanceOf[Anon_AudioSources]
  }
}

