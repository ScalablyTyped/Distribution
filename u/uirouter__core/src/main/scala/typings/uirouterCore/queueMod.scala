package typings.uirouterCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("@uirouter/core/lib/common/queue", "Queue")
  @js.native
  class Queue[T] () extends StObject {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.Array[T], _limit: Double) = this()
    def this(_items: Unit, _limit: Double) = this()
    
    var _evictListeners: js.Any = js.native
    
    var _items: js.Any = js.native
    
    var _limit: js.Any = js.native
    
    def clear(): js.Array[T] = js.native
    
    def dequeue(): T = js.native
    
    def enqueue(item: T): T = js.native
    
    def evict(): T = js.native
    
    def onEvict(`val`: js.Function1[/* item */ T, Unit]): js.Function1[/* item */ T, Unit] = js.native
    
    def peekHead(): T = js.native
    
    def peekTail(): T = js.native
    
    def remove(item: T): T = js.native
    
    def size(): Double = js.native
  }
}
