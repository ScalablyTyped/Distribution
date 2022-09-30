package typings.tar.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream * / any */ trait ParseStream extends StObject {
  
  var _ended: Boolean
  
  def _process(c: Buffer): Unit
  
  def _startEntry(c: Buffer): Unit
  
  var _stream: Stream
  
  def _streamEnd(): Unit
  
  var position: Double
}
object ParseStream {
  
  inline def apply(
    _ended: Boolean,
    _process: Buffer => Unit,
    _startEntry: Buffer => Unit,
    _stream: Stream,
    _streamEnd: () => Unit,
    position: Double
  ): ParseStream = {
    val __obj = js.Dynamic.literal(_ended = _ended.asInstanceOf[js.Any], _process = js.Any.fromFunction1(_process), _startEntry = js.Any.fromFunction1(_startEntry), _stream = _stream.asInstanceOf[js.Any], _streamEnd = js.Any.fromFunction0(_streamEnd), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseStream]
  }
  
  extension [Self <: ParseStream](x: Self) {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def set_ended(value: Boolean): Self = StObject.set(x, "_ended", value.asInstanceOf[js.Any])
    
    inline def set_process(value: Buffer => Unit): Self = StObject.set(x, "_process", js.Any.fromFunction1(value))
    
    inline def set_startEntry(value: Buffer => Unit): Self = StObject.set(x, "_startEntry", js.Any.fromFunction1(value))
    
    inline def set_stream(value: Stream): Self = StObject.set(x, "_stream", value.asInstanceOf[js.Any])
    
    inline def set_streamEnd(value: () => Unit): Self = StObject.set(x, "_streamEnd", js.Any.fromFunction0(value))
  }
}
