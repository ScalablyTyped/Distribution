package typings.webpack.mod

import typings.std.Error
import typings.webpack.anon.Read
import typings.webpack.anon.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackError
  extends StObject
     with Error {
  
  var chunk: Chunk
  
  def deserialize(__0: Read): Unit
  
  var details: Any
  
  var file: String
  
  var hideStack: Boolean
  
  var loc: DependencyLocation
  
  var module: Module
  
  def serialize(__0: Write): Unit
}
object WebpackError {
  
  inline def apply(
    chunk: Chunk,
    deserialize: Read => Unit,
    details: Any,
    file: String,
    hideStack: Boolean,
    loc: DependencyLocation,
    message: String,
    module: Module,
    name: String,
    serialize: Write => Unit
  ): WebpackError = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), details = details.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], hideStack = hideStack.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[WebpackError]
  }
  
  extension [Self <: WebpackError](x: Self) {
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setDeserialize(value: Read => Unit): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHideStack(value: Boolean): Self = StObject.set(x, "hideStack", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: DependencyLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: Write => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
