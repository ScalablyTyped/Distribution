package typings.yjs

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Set
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYmapMod {
  
  @JSImport("yjs/dist/src/types/YMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YMap", "YMap")
  @js.native
  /**
    *
    * @param {Iterable<readonly [string, any]>=} entries - an optional iterable to initialize the YMap
    */
  open class YMap[MapType] ()
    extends AbstractType[YMapEvent[MapType]]
       with Iterable[MapType] {
    def this(entries: js.Iterable[js.Tuple2[String, Any]]) = this()
    
    /**
      * @type {Map<string,any>?}
      * @private
      */
    /* private */ var _prelimContent: Any = js.native
    
    /**
      * Removes all elements from this YMap.
      */
    def clear(): Unit = js.native
    
    /**
      * Remove a specified element from this YMap.
      *
      * @param {string} key The key of the element to remove.
      */
    def delete(key: String): Unit = js.native
    
    /**
      * Returns an Iterator of [key, value] pairs
      *
      * @return {IterableIterator<any>}
      */
    def entries(): IterableIterator[Any] = js.native
    
    /**
      * Executes a provided function on once on every key-value pair.
      *
      * @param {function(MapType,string,YMap<MapType>):void} f A function to execute on every element of this YArray.
      */
    def forEach(f: js.Function3[/* arg0 */ MapType, /* arg1 */ String, /* arg2 */ YMap[MapType], Unit]): Unit = js.native
    
    /**
      * Returns a specified element from this YMap.
      *
      * @param {string} key
      * @return {MapType|undefined}
      */
    def get(key: String): js.UndefOr[MapType] = js.native
    
    /**
      * Returns a boolean indicating whether the specified key exists or not.
      *
      * @param {string} key The key to test.
      * @return {boolean}
      */
    def has(key: String): Boolean = js.native
    
    /**
      * Returns an Iterator of [key, value] pairs
      *
      * @return {IterableIterator<any>}
      */
    @JSName(js.Symbol.iterator)
    var iterator_YMap: js.Function0[IterableIterator[Any]] = js.native
    
    /**
      * Returns the keys for each element in the YMap Type.
      *
      * @return {IterableIterator<string>}
      */
    def keys(): IterableIterator[String] = js.native
    
    /**
      * Adds or updates an element with a specified key and value.
      *
      * @param {string} key The key of the element to add to this YMap
      * @param {MapType} value The value of the element to add
      */
    def set(key: String, value: MapType): MapType = js.native
    
    /**
      * Returns the size of the YMap (count of key/value pairs)
      *
      * @return {number}
      */
    def size: Double = js.native
    
    /**
      * Returns the values for each element in the YMap Type.
      *
      * @return {IterableIterator<any>}
      */
    def values(): IterableIterator[Any] = js.native
  }
  
  @JSImport("yjs/dist/src/types/YMap", "YMapEvent")
  @js.native
  open class YMapEvent[T] protected () extends YEvent[YMap[T]] {
    /**
      * @param {YMap<T>} ymap The YArray that changed.
      * @param {Transaction} transaction
      * @param {Set<any>} subs The keys that changed.
      */
    def this(ymap: YMap[T], transaction: Transaction, subs: Set[Any]) = this()
    
    var keysChanged: Set[Any] = js.native
  }
  
  inline def readYMap(decoder: UpdateDecoderV1): YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[YMap[Any]]
  inline def readYMap(decoder: UpdateDecoderV2): YMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYMap")(decoder.asInstanceOf[js.Any]).asInstanceOf[YMap[Any]]
}
