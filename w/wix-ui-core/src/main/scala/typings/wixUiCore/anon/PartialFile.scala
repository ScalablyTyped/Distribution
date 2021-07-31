package typings.wixUiCore.anon

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.File> */
trait PartialFile extends StObject {
  
  var arrayBuffer: js.UndefOr[js.Function0[js.Promise[ArrayBuffer]]] = js.undefined
  
  var lastModified: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var slice: js.UndefOr[js.Function0[Blob]] = js.undefined
  
  var stream: js.UndefOr[js.Function0[ReadableStream[js.Any]]] = js.undefined
  
  var text: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialFile {
  
  @scala.inline
  def apply(): PartialFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFile]
  }
  
  @scala.inline
  implicit class PartialFileMutableBuilder[Self <: PartialFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
    
    @scala.inline
    def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSlice(value: () => Blob): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    @scala.inline
    def setStream(value: () => ReadableStream[js.Any]): Self = StObject.set(x, "stream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
