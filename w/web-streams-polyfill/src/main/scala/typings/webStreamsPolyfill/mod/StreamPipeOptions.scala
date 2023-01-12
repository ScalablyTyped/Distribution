package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamPipeOptions extends StObject {
  
  /**
    * If set to true, {@link ReadableStream.pipeTo} will not abort the writable stream if the readable stream errors.
    */
  var preventAbort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, {@link ReadableStream.pipeTo} will not cancel the readable stream if the writable stream closes
    * or errors.
    */
  var preventCancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, {@link ReadableStream.pipeTo} will not close the writable stream if the readable stream closes.
    */
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be set to an {@link AbortSignal} to allow aborting an ongoing pipe operation via the corresponding
    * `AbortController`. In this case, the source readable stream will be canceled, and the destination writable stream
    * aborted, unless the respective options `preventCancel` or `preventAbort` are set.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object StreamPipeOptions {
  
  inline def apply(): StreamPipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamPipeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamPipeOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventAbort(value: Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    inline def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    inline def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
