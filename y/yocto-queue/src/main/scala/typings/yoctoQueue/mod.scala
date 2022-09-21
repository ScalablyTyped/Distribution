package typings.yoctoQueue

import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yocto-queue", JSImport.Default)
  @js.native
  /**
  	Tiny queue data structure.
  	The instance is an [`Iterable`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols), which means you can iterate over the queue front to back with a “for…of” loop, or use spreading to convert the queue to an array. Don't do this unless you really need to though, since it's slow.
  	@example
  	```
  	import Queue from 'yocto-queue';
  	const queue = new Queue();
  	queue.enqueue('🦄');
  	queue.enqueue('🌈');
  	console.log(queue.size);
  	//=> 2
  	console.log(...queue);
  	//=> '🦄 🌈'
  	console.log(queue.dequeue());
  	//=> '🦄'
  	console.log(queue.dequeue());
  	//=> '🌈'
  	```
  	*/
  open class default[ValueType] ()
    extends StObject
       with Queue[ValueType]
  
  @js.native
  trait Queue[ValueType]
    extends StObject
       with Iterable[ValueType] {
    
    /**
    	Clear the queue.
    	*/
    def clear(): Unit = js.native
    
    /**
    	Remove the next value in the queue.
    	@returns The removed value or `undefined` if the queue is empty.
    	*/
    def dequeue(): js.UndefOr[ValueType] = js.native
    
    /**
    	Add a value to the queue.
    	*/
    def enqueue(value: ValueType): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Queue: js.Function0[IterableIterator[ValueType]] = js.native
    
    /**
    	The size of the queue.
    	*/
    val size: Double = js.native
  }
}
