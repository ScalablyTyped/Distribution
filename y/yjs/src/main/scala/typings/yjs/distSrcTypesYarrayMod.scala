package typings.yjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcTypesAbstractTypeMod.ArraySearchMarker
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYarrayMod {
  
  @JSImport("yjs/dist/src/types/YArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YArray", "YArray")
  @js.native
  open class YArray[T] ()
    extends AbstractType[YArrayEvent[T]]
       with Iterable[T] {
    
    /**
      * @type {Array<any>?}
      * @private
      */
    /* private */ var _prelimContent: Any = js.native
    
    /**
      * @type {Array<ArraySearchMarker>}
      */
    @JSName("_searchMarker")
    var _searchMarker_YArray: js.Array[ArraySearchMarker] = js.native
    
    /**
      * Deletes elements starting from an index.
      *
      * @param {number} index Index at which to start deleting elements
      * @param {number} length The number of elements to remove. Defaults to 1.
      */
    def delete(index: Double): Unit = js.native
    def delete(index: Double, length: Double): Unit = js.native
    
    /**
      * Executes a provided function once on overy element of this YArray.
      *
      * @param {function(T,number,YArray<T>):void} f A function to execute on every element of this YArray.
      */
    def forEach(f: js.Function3[/* arg0 */ T, /* arg1 */ Double, /* arg2 */ YArray[T], Unit]): Unit = js.native
    
    /**
      * Returns the i-th element from a YArray.
      *
      * @param {number} index The index of the element to return from the YArray
      * @return {T}
      */
    def get(index: Double): T = js.native
    
    /**
      * Inserts new content at an index.
      *
      * Important: This function expects an array of content. Not just a content
      * object. The reason for this "weirdness" is that inserting several elements
      * is very efficient when it is done as a single operation.
      *
      * @example
      *  // Insert character 'a' at position 0
      *  yarray.insert(0, ['a'])
      *  // Insert numbers 1, 2 at position 1
      *  yarray.insert(1, [1, 2])
      *
      * @param {number} index The index to insert content at.
      * @param {Array<T>} content The array of content
      */
    def insert(index: Double, content: js.Array[T]): Unit = js.native
    
    /**
      * @return {IterableIterator<T>}
      */
    @JSName(js.Symbol.iterator)
    var iterator_YArray: js.Function0[IterableIterator[T]] = js.native
    
    def length: Double = js.native
    
    /**
      * Returns an Array with the result of calling a provided function on every
      * element of this YArray.
      *
      * @template M
      * @param {function(T,number,YArray<T>):M} f Function that produces an element of the new Array
      * @return {Array<M>} A new array with each element being the result of the
      *                 callback function
      */
    def map[M](f: js.Function3[/* arg0 */ T, /* arg1 */ Double, /* arg2 */ YArray[T], M]): js.Array[M] = js.native
    
    /**
      * Appends content to this YArray.
      *
      * @param {Array<T>} content Array of content to append.
      *
      * @todo Use the following implementation in all types.
      */
    def push(content: js.Array[T]): Unit = js.native
    
    /**
      * Transforms this YArray to a JavaScript Array.
      *
      * @param {number} [start]
      * @param {number} [end]
      * @return {Array<T>}
      */
    def slice(): js.Array[T] = js.native
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    def slice(start: Unit, end: Double): js.Array[T] = js.native
    
    /**
      * Transforms this YArray to a JavaScript Array.
      *
      * @return {Array<T>}
      */
    def toArray(): js.Array[T] = js.native
    
    /**
      * Preppends content to this YArray.
      *
      * @param {Array<T>} content Array of content to preppend.
      */
    def unshift(content: js.Array[T]): Unit = js.native
  }
  /* static members */
  object YArray {
    
    @JSImport("yjs/dist/src/types/YArray", "YArray")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a new YArray containing the specified items.
      * @template {Object<string,any>|Array<any>|number|null|string|Uint8Array} T
      * @param {Array<T>} items
      * @return {YArray<T>}
      */
    inline def from[T_1 /* <: String | Double | js.Array[Any] | js.typedarray.Uint8Array | StringDictionary[Any] | Null */](items: js.Array[T_1]): YArray[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(items.asInstanceOf[js.Any]).asInstanceOf[YArray[T_1]]
  }
  
  @JSImport("yjs/dist/src/types/YArray", "YArrayEvent")
  @js.native
  open class YArrayEvent[T] protected () extends YEvent[YArray[T]] {
    /**
      * @param {YArray<T>} yarray The changed type
      * @param {Transaction} transaction The transaction object
      */
    def this(yarray: YArray[T], transaction: Transaction) = this()
    
    var _transaction: Transaction = js.native
  }
  
  inline def readYArray(_decoder: UpdateDecoderV1): YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(_decoder.asInstanceOf[js.Any]).asInstanceOf[YArray[Any]]
  inline def readYArray(_decoder: UpdateDecoderV2): YArray[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readYArray")(_decoder.asInstanceOf[js.Any]).asInstanceOf[YArray[Any]]
}
