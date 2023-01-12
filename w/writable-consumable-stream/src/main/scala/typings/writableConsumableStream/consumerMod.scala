package typings.writableConsumableStream

import typings.std.IteratorResult
import typings.writableConsumableStream.anon.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumerMod {
  
  @JSImport("writable-consumable-stream/consumer", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Consumer[T] {
    def this(stream: typings.writableConsumableStream.mod.^[T], id: Double, startNode: Node[T], timeout: Double) = this()
    
    /* CompleteClass */
    override def next(): js.Promise[IteratorResult[T, Any]] = js.native
    
    /* CompleteClass */
    override def `return`(): Unit = js.native
  }
  
  @js.native
  trait Consumer[T]
    extends StObject
       with typings.consumableStream.mod.Consumer[T] {
    
    var currentNode: Node[T] = js.native
    
    def getBackpressure(): Double = js.native
    
    def getStats(): ConsumerStats = js.native
    
    var id: Double = js.native
    
    def kill(): Unit = js.native
    def kill(value: Any): Unit = js.native
    
    def releaseBackpressure(packet: Any): Unit = js.native
    
    var stream: typings.writableConsumableStream.mod.^[T] = js.native
    
    var timeout: Double = js.native
    
    def write(packet: Any): Unit = js.native
  }
  
  trait ConsumerStats extends StObject {
    
    var backpressure: Double
    
    var id: Double
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConsumerStats {
    
    inline def apply(backpressure: Double, id: Double): ConsumerStats = {
      val __obj = js.Dynamic.literal(backpressure = backpressure.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsumerStats] (val x: Self) extends AnyVal {
      
      inline def setBackpressure(value: Double): Self = StObject.set(x, "backpressure", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Node[T] extends StObject {
    
    var data: Done[T]
    
    var next: Node[T] | Null
  }
  object Node {
    
    inline def apply[T](data: Done[T]): Node[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = null)
      __obj.asInstanceOf[Node[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?], T] (val x: Self & Node[T]) extends AnyVal {
      
      inline def setData(value: Done[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Node[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
    }
  }
}
