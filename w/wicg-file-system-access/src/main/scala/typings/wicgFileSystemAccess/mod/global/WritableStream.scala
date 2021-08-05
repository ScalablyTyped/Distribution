package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: remove this once https://github.com/microsoft/TSJS-lib-generator/issues/881 is fixed.
// Native File System API especially needs this method.
trait WritableStream extends StObject {
  
  def close(): js.Promise[Unit]
}
object WritableStream {
  
  inline def apply(close: () => js.Promise[Unit]): WritableStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[WritableStream]
  }
  
  extension [Self <: WritableStream](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
