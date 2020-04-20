package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: Event
  var error: ErrorEvent
  var load: Event
  var loadend: ProgressEvent
  var loadstart: Event
  var progress: ProgressEvent
  var timeout: ProgressEvent
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: Event,
    error: ErrorEvent,
    load: Event,
    loadend: ProgressEvent,
    loadstart: Event,
    progress: ProgressEvent,
    timeout: ProgressEvent
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

