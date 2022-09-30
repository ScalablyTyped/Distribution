package typings.vscodeJsonrpc

import typings.std.Map
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`0`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`1`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedMapMod {
  
  @JSImport("vscode-jsonrpc/lib/common/linkedMap", "LRUCache")
  @js.native
  open class LRUCache[K, V] protected () extends LinkedMap[K, V] {
    def this(limit: Double) = this()
    def this(limit: Double, ratio: Double) = this()
    
    /* private */ var _limit: Any = js.native
    
    /* private */ var _ratio: Any = js.native
    
    /* private */ var checkTrim: Any = js.native
    
    def limit: Double = js.native
    def limit_=(limit: Double): Unit = js.native
    
    def peek(key: K): js.UndefOr[V] = js.native
    
    def ratio: Double = js.native
    def ratio_=(ratio: Double): Unit = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/common/linkedMap", "LinkedMap")
  @js.native
  open class LinkedMap[K, V] ()
    extends StObject
       with Map[K, V] {
    
    /* private */ var _head: Any = js.native
    
    /* private */ var _map: Any = js.native
    
    /* private */ var _size: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _tail: Any = js.native
    
    /* private */ var addItemFirst: Any = js.native
    
    /* private */ var addItemLast: Any = js.native
    
    def first: js.UndefOr[V] = js.native
    
    def fromJSON(data: js.Array[js.Tuple2[K, V]]): Unit = js.native
    
    def get(key: K, touch: Touch): js.UndefOr[V] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def last: js.UndefOr[V] = js.native
    
    def remove(key: K): js.UndefOr[V] = js.native
    
    /* private */ var removeItem: Any = js.native
    
    def set(key: K, value: V, touch: Touch): this.type = js.native
    
    def shift(): js.UndefOr[V] = js.native
    
    @JSName("size")
    def size_MLinkedMap: Double = js.native
    
    def toJSON(): js.Array[js.Tuple2[K, V]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag_LinkedMap: typings.vscodeJsonrpc.vscodeJsonrpcStrings.LinkedMap = js.native
    
    /* private */ var touch: Any = js.native
    
    /* protected */ def trimOld(newSize: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeJsonrpc.vscodeJsonrpcInts.`0`
    - typings.vscodeJsonrpc.vscodeJsonrpcInts.`1`
    - typings.vscodeJsonrpc.vscodeJsonrpcInts.`2`
  */
  trait Touch extends StObject
  object Touch {
    
    @JSImport("vscode-jsonrpc/lib/common/linkedMap", "Touch.AsNew")
    @js.native
    val AsNew: `2` = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/linkedMap", "Touch.AsOld")
    @js.native
    val AsOld: `1` = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/linkedMap", "Touch.First")
    @js.native
    val First: `1` = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/linkedMap", "Touch.Last")
    @js.native
    val Last: `2` = js.native
    
    @JSImport("vscode-jsonrpc/lib/common/linkedMap", "Touch.None")
    @js.native
    val None: `0` = js.native
  }
}
