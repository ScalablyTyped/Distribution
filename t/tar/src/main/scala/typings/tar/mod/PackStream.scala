package typings.tar.mod

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream * / any */ trait PackStream extends StObject {
  
  var _buffer: js.Array[Stream]
  
  var _currentEntry: Any
  
  var _global: HeaderProperties
  
  var _needDrain: Boolean
  
  var _noProprietary: Boolean
  
  var _paused: Boolean
  
  var _pipeRoot: Stream
  
  def _process(): Unit
  
  var _processing: Boolean
  
  def add(stream: Stream): Boolean
  
  def addGlobal(props: HeaderProperties): Unit
  
  def destroy(): Unit
  
  var readable: Boolean
  
  var writable: Boolean
}
object PackStream {
  
  inline def apply(
    _buffer: js.Array[Stream],
    _currentEntry: Any,
    _global: HeaderProperties,
    _needDrain: Boolean,
    _noProprietary: Boolean,
    _paused: Boolean,
    _pipeRoot: Stream,
    _process: () => Unit,
    _processing: Boolean,
    add: Stream => Boolean,
    addGlobal: HeaderProperties => Unit,
    destroy: () => Unit,
    readable: Boolean,
    writable: Boolean
  ): PackStream = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], _currentEntry = _currentEntry.asInstanceOf[js.Any], _global = _global.asInstanceOf[js.Any], _needDrain = _needDrain.asInstanceOf[js.Any], _noProprietary = _noProprietary.asInstanceOf[js.Any], _paused = _paused.asInstanceOf[js.Any], _pipeRoot = _pipeRoot.asInstanceOf[js.Any], _process = js.Any.fromFunction0(_process), _processing = _processing.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), addGlobal = js.Any.fromFunction1(addGlobal), destroy = js.Any.fromFunction0(destroy), readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackStream]
  }
  
  extension [Self <: PackStream](x: Self) {
    
    inline def setAdd(value: Stream => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddGlobal(value: HeaderProperties => Unit): Self = StObject.set(x, "addGlobal", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def set_buffer(value: js.Array[Stream]): Self = StObject.set(x, "_buffer", value.asInstanceOf[js.Any])
    
    inline def set_bufferVarargs(value: Stream*): Self = StObject.set(x, "_buffer", js.Array(value*))
    
    inline def set_currentEntry(value: Any): Self = StObject.set(x, "_currentEntry", value.asInstanceOf[js.Any])
    
    inline def set_global(value: HeaderProperties): Self = StObject.set(x, "_global", value.asInstanceOf[js.Any])
    
    inline def set_needDrain(value: Boolean): Self = StObject.set(x, "_needDrain", value.asInstanceOf[js.Any])
    
    inline def set_noProprietary(value: Boolean): Self = StObject.set(x, "_noProprietary", value.asInstanceOf[js.Any])
    
    inline def set_paused(value: Boolean): Self = StObject.set(x, "_paused", value.asInstanceOf[js.Any])
    
    inline def set_pipeRoot(value: Stream): Self = StObject.set(x, "_pipeRoot", value.asInstanceOf[js.Any])
    
    inline def set_process(value: () => Unit): Self = StObject.set(x, "_process", js.Any.fromFunction0(value))
    
    inline def set_processing(value: Boolean): Self = StObject.set(x, "_processing", value.asInstanceOf[js.Any])
  }
}
