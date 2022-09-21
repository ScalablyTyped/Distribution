package typings.tsMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-map", JSImport.Default)
  @js.native
  open class default[K, V] ()
    extends StObject
       with TsMap[K, V] {
    def this(intrator: js.Array[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  trait TsMap[K, V] extends StObject {
    
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
      context: Any
    ): Unit = js.native
    
    def get(k: K): js.UndefOr[V] = js.native
    
    def has(k: K): Boolean = js.native
    
    /* private */ var keyStore: Any = js.native
    
    def keys(): js.Array[K] = js.native
    
    def set(k: K, v: V): TsMapInter[K, V] = js.native
    
    var size: Double = js.native
    
    /* private */ var valueStore: Any = js.native
    
    def values(): js.Array[V] = js.native
  }
  
  @js.native
  trait TsMapInter[K, V] extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(k: K): Boolean = js.native
    
    def entries(): js.Array[js.Tuple2[K, V]] = js.native
    
    def forEach(
      cb: js.Function3[/* value */ js.UndefOr[V], /* key */ js.UndefOr[K], /* map */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    def forEach(
      cb: js.Function3[/* value */ js.UndefOr[V], /* key */ js.UndefOr[K], /* map */ js.UndefOr[Any], Unit],
      context: Any
    ): Unit = js.native
    
    def get(k: K): V = js.native
    
    def has(k: K): Boolean = js.native
    
    def keys(): js.Array[K] = js.native
    
    def set(k: K, v: V): Any = js.native
    
    var size: Double = js.native
    
    def values(): js.Array[V] = js.native
  }
}
