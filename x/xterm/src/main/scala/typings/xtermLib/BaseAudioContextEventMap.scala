package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAudioContextEventMap extends js.Object {
  var statechange: Event
}

object BaseAudioContextEventMap {
  @scala.inline
  def apply(statechange: Event): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statechange")(statechange)
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
}

