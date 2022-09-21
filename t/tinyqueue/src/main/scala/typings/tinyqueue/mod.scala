package typings.tinyqueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinyqueue", JSImport.Default)
  @js.native
  open class default[Item] ()
    extends StObject
       with TinyQueue[Item] {
    def this(items: js.Array[Item]) = this()
    def this(items: js.Array[Item], compare: Comparator[Item]) = this()
    def this(items: Unit, compare: Comparator[Item]) = this()
    
    /* CompleteClass */
    var data: js.Array[Item] = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def peek(): js.UndefOr[Item] = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[Item] = js.native
    
    /* CompleteClass */
    override def push(item: Item): Unit = js.native
  }
  
  type Comparator[Item] = js.Function2[/* a */ Item, /* b */ Item, Double]
  
  type Item = Any
  
  trait TinyQueue[Item] extends StObject {
    
    var data: js.Array[Item]
    
    var length: Double
    
    def peek(): js.UndefOr[Item]
    
    def pop(): js.UndefOr[Item]
    
    def push(item: Item): Unit
  }
  object TinyQueue {
    
    inline def apply[Item](
      data: js.Array[Item],
      length: Double,
      peek: () => js.UndefOr[Item],
      pop: () => js.UndefOr[Item],
      push: Item => Unit
    ): TinyQueue[Item] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[TinyQueue[Item]]
    }
    
    extension [Self <: TinyQueue[?], Item](x: Self & TinyQueue[Item]) {
      
      inline def setData(value: js.Array[Item]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Item*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: () => js.UndefOr[Item]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => js.UndefOr[Item]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: Item => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
