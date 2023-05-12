package typings.vueCompilerSfc.mod

import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Map<string, @vue/compiler-sfc.@vue/compiler-sfc.SFCParseResult> & {  max :number | undefined} */
object parseCache {
  
  @JSImport("@vue/compiler-sfc", "parseCache")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard es2015.collection */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /**
    * @returns true if an element in the Map existed and has been removed, or false if the element does not exist.
    */
  /* standard es2015.collection */
  inline def delete(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  /* standard es2015.iterable */
  inline def entries(): IterableIterator[js.Tuple2[String, SFCParseResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[String, SFCParseResult]]]
  
  /**
    * Executes a provided function once per each key/value pair in the Map, in insertion order.
    */
  /* standard es2015.collection */
  inline def forEach(
    callbackfn: js.Function3[
      /* value */ SFCParseResult, 
      /* key */ String, 
      /* map */ Map[String, SFCParseResult], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[
      /* value */ SFCParseResult, 
      /* key */ String, 
      /* map */ Map[String, SFCParseResult], 
      Unit
    ],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a specified element from the Map object. If the value that is associated to the provided key is an object, then you will get a reference to that object and any change made to that object will effectively modify it inside the Map.
    * @returns Returns the element associated with the specified key. If no element is associated with the specified key, undefined is returned.
    */
  /* standard es2015.collection */
  inline def get(key: String): js.UndefOr[SFCParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SFCParseResult]]
  
  /**
    * @returns boolean indicating whether an element with the specified key exists or not.
    */
  /* standard es2015.collection */
  inline def has(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns an iterable of keys in the map
    */
  /* standard es2015.iterable */
  inline def keys(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[String]]
  
  @JSImport("@vue/compiler-sfc", "parseCache.max")
  @js.native
  def max: js.UndefOr[Double] = js.native
  inline def max_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a new element with a specified key and value to the Map. If an element with the same key already exists, the element will be updated.
    */
  /* standard es2015.collection */
  inline def set(key: String, value: SFCParseResult): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  /**
    * @returns the number of elements in the Map.
    */
  /* standard es2015.collection */
  @JSImport("@vue/compiler-sfc", "parseCache.size")
  @js.native
  val size: Double = js.native
  
  /**
    * Returns an iterable of values in the map
    */
  /* standard es2015.iterable */
  inline def values(): IterableIterator[SFCParseResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[SFCParseResult]]
}
