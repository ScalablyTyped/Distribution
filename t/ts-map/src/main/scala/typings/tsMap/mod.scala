package typings.tsMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait TsMap[K, V] extends js.Object {
    
    def clear(): Unit = js.native
    
    def delete(k: K): Boolean = js.native
    
    def entries(): js.Array[js.Tuple2[K, V]] = js.native
    
    def forEach(
      cb: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* map */ js.UndefOr[TsMapInter[K, V]], 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      cb: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* map */ js.UndefOr[TsMapInter[K, V]], 
          Unit
        ],
      context: js.Any
    ): Unit = js.native
    
    def get(k: K): js.UndefOr[V] = js.native
    
    def has(k: K): Boolean = js.native
    
    var keyStore: js.Any = js.native
    
    def keys(): js.Array[K] = js.native
    
    def set(k: K, v: V): TsMapInter[K, V] = js.native
    
    var size: Double = js.native
    
    var valueStore: js.Any = js.native
    
    def values(): js.Array[V] = js.native
  }
  
  @js.native
  trait TsMapInter[K, V] extends js.Object {
    
    def clear(): Unit = js.native
    
    def delete(k: K): Boolean = js.native
    
    def entries(): js.Array[js.Tuple2[K, V]] = js.native
    
    def forEach(
      cb: js.Function3[/* value */ js.UndefOr[V], /* key */ js.UndefOr[K], /* map */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    def forEach(
      cb: js.Function3[/* value */ js.UndefOr[V], /* key */ js.UndefOr[K], /* map */ js.UndefOr[js.Any], Unit],
      context: js.Any
    ): Unit = js.native
    
    def get(k: K): V = js.native
    
    def has(k: K): Boolean = js.native
    
    def keys(): js.Array[K] = js.native
    
    def set(k: K, v: V): js.Any = js.native
    
    var size: Double = js.native
    
    def values(): js.Array[V] = js.native
  }
  
  @js.native
  class default[K, V] () extends TsMap[K, V] {
    def this(intrator: js.Array[js.Tuple2[K, V]]) = this()
  }
}
