package typings.writableConsumableStream

import typings.writableConsumableStream.anon.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumerMod {
  
  @JSImport("writable-consumable-stream/consumer", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends Consumer[T] {
    def this(stream: typings.writableConsumableStream.mod.^[T], id: Double, startNode: Node[T], timeout: Double) = this()
  }
  
  @js.native
  trait Consumer[T]
    extends typings.consumableStream.mod.Consumer[T] {
    
    var currentNode: Node[T] = js.native
    
    def getBackpressure(): Double = js.native
    
    def getStats(): ConsumerStats = js.native
    
    var id: Double = js.native
    
    def kill(): Unit = js.native
    def kill(value: js.Any): Unit = js.native
    
    def releaseBackpressure(packet: js.Any): Unit = js.native
    
    def resetBackpressure(): Unit = js.native
    
    var stream: typings.writableConsumableStream.mod.^[T] = js.native
    
    var timeout: Double = js.native
    
    def write(packet: js.Any): Unit = js.native
  }
  
  @js.native
  trait ConsumerStats extends StObject {
    
    var backpressure: Double = js.native
    
    var id: Double = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ConsumerStats {
    
    @scala.inline
    def apply(backpressure: Double, id: Double): ConsumerStats = {
      val __obj = js.Dynamic.literal(backpressure = backpressure.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerStats]
    }
    
    @scala.inline
    implicit class ConsumerStatsMutableBuilder[Self <: ConsumerStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackpressure(value: Double): Self = StObject.set(x, "backpressure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Node[T] extends StObject {
    
    var data: Done[T] = js.native
    
    var next: Node[T] | Null = js.native
  }
  object Node {
    
    @scala.inline
    def apply[T](data: Done[T]): Node[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[T]]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: Done[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Node[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
    }
  }
}
