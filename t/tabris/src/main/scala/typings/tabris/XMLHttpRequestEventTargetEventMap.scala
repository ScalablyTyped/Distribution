package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  var abort: Event
  
  var error: ErrorEvent
  
  var load: Event
  
  var loadend: ProgressEvent
  
  var loadstart: Event
  
  var progress: ProgressEvent
  
  var timeout: ProgressEvent
}
object XMLHttpRequestEventTargetEventMap {
  
  inline def apply(
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
  
  extension [Self <: XMLHttpRequestEventTargetEventMap](x: Self) {
    
    inline def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Event): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadend(value: ProgressEvent): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    inline def setLoadstart(value: Event): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: ProgressEvent): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
