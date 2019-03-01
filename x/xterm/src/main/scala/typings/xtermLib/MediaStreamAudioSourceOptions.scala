package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamAudioSourceOptions extends js.Object {
  var mediaStream: MediaStream
}

object MediaStreamAudioSourceOptions {
  @scala.inline
  def apply(mediaStream: MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mediaStream")(mediaStream)
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
}

