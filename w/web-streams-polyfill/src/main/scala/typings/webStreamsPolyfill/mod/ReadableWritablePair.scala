package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableWritablePair[R, W] extends StObject {
  
  var readable: ReadableStream[R]
  
  var writable: WritableStream[W]
}
object ReadableWritablePair {
  
  inline def apply[R, W](readable: ReadableStream[R], writable: WritableStream[W]): ReadableWritablePair[R, W] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableWritablePair[R, W]]
  }
  
  extension [Self <: ReadableWritablePair[?, ?], R, W](x: Self & (ReadableWritablePair[R, W])) {
    
    inline def setReadable(value: ReadableStream[R]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[W]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
