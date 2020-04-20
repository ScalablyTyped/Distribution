package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap {
  var readystatechange: Event
}

object XMLHttpRequestEventMap {
  @scala.inline
  def apply(
    abort: Event,
    error: ErrorEvent,
    load: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    progress: ProgressEvent,
    readystatechange: Event,
    timeout: ProgressEvent
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
}

