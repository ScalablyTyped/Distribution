package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCacheEventMap extends js.Object {
  var cached: Event
  var checking: Event
  var downloading: Event
  var error: Event
  var noupdate: Event
  var obsolete: Event
  var progress: ProgressEvent
  var updateready: Event
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: Event,
    checking: Event,
    downloading: Event,
    error: Event,
    noupdate: Event,
    obsolete: Event,
    progress: ProgressEvent,
    updateready: Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cached")(cached)
    __obj.updateDynamic("checking")(checking)
    __obj.updateDynamic("downloading")(downloading)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("noupdate")(noupdate)
    __obj.updateDynamic("obsolete")(obsolete)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("updateready")(updateready)
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
}

