package typings.vscodeLanguageclient.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInfo extends StObject {
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var reader: ReadableStream
  
  var writer: WritableStream
}
object StreamInfo {
  
  inline def apply(reader: ReadableStream, writer: WritableStream): StreamInfo = {
    val __obj = js.Dynamic.literal(reader = reader.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
  
  extension [Self <: StreamInfo](x: Self) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setReader(value: ReadableStream): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setWriter(value: WritableStream): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
  }
}
