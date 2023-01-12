package typings.webStreamsPolyfill

import typings.webStreamsPolyfill.mod.ReadableStream
import typings.webStreamsPolyfill.mod.ReadableStreamBYOBReadResult
import typings.webStreamsPolyfill.mod.ReadableStreamDefaultReadResult
import typings.webStreamsPolyfill.mod.WritableStream
import typings.webStreamsPolyfill.webStreamsPolyfillBooleans.`false`
import typings.webStreamsPolyfill.webStreamsPolyfillBooleans.`true`
import typings.webStreamsPolyfill.webStreamsPolyfillStrings.byob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[T /* <: js.typedarray.ArrayBufferView */]
    extends StObject
       with ReadableStreamBYOBReadResult[T] {
    
    var done: `false`
    
    var value: T
  }
  object Done {
    
    inline def apply[T /* <: js.typedarray.ArrayBufferView */](value: T): Done[T] = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done[?], T /* <: js.typedarray.ArrayBufferView */] (val x: Self & Done[T]) extends AnyVal {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoneValue[T]
    extends StObject
       with ReadableStreamDefaultReadResult[T] {
    
    var done: `false`
    
    var value: T
  }
  object DoneValue {
    
    inline def apply[T](value: T): DoneValue[T] = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoneValue[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoneValue[?], T] (val x: Self & DoneValue[T]) extends AnyVal {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighWaterMark extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var size: Unit
  }
  object HighWaterMark {
    
    inline def apply(size: Unit): HighWaterMark = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighWaterMark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighWaterMark] (val x: Self) extends AnyVal {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setSize(value: Unit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mode extends StObject {
    
    var mode: byob
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal(mode = "byob")
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      inline def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Readable[RS /* <: ReadableStream[Any] */, R] extends StObject {
    
    var readable: RS
    
    var writable: WritableStream[R]
  }
  object Readable {
    
    inline def apply[RS /* <: ReadableStream[Any] */, R](readable: RS, writable: WritableStream[R]): Readable[RS, R] = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readable[RS, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Readable[?, ?], RS /* <: ReadableStream[Any] */, R] (val x: Self & (Readable[RS, R])) extends AnyVal {
      
      inline def setReadable(value: RS): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[R]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T /* <: js.typedarray.ArrayBufferView */]
    extends StObject
       with ReadableStreamBYOBReadResult[T] {
    
    var done: `true`
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Value {
    
    inline def apply[T /* <: js.typedarray.ArrayBufferView */](): Value[T] = {
      val __obj = js.Dynamic.literal(done = true)
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], T /* <: js.typedarray.ArrayBufferView */] (val x: Self & Value[T]) extends AnyVal {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ValueUndefined
    extends StObject
       with ReadableStreamDefaultReadResult[Any] {
    
    var done: `true`
    
    var value: Unit
  }
  object ValueUndefined {
    
    inline def apply(value: Unit): ValueUndefined = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueUndefined]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueUndefined] (val x: Self) extends AnyVal {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
