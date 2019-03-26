package typings
package tabrisLib

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
    val __obj = js.Dynamic.literal(abort = abort, error = error, load = load, loadend = loadend, loadstart = loadstart, progress = progress, timeout = timeout)
  
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
}

