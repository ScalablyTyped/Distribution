package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventMap
  extends StObject
     with XMLHttpRequestEventTargetEventMap {
  
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
  
  @scala.inline
  implicit class XMLHttpRequestEventMapMutableBuilder[Self <: XMLHttpRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadystatechange(value: Event): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
  }
}
