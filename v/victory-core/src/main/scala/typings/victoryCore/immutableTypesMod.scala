package typings.victoryCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.victoryCore.anon.Done
import typings.victoryCore.immutableTypesMod.Iterable.Keyed
import typings.victoryCore.immutableTypesMod.Seq.Indexed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableTypesMod {
  
  @JSImport("victory-core/lib/victory-util/immutable-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Iterable[K, V] extends StObject {
    
    /**
      * Returns a new Iterable of the same type containing all entries except
      * the last.
      */
    def butLast(): /*this*/ Iterable[K, V] = js.native
    
    // Combination
    /**
      * Returns a new Iterable of the same type with other values and
      * iterable-like concatenated to this one.
      *
      * For Seqs, all entries will be present in
      * the resulting iterable, even if they have the same key.
      */
    def concat(valuesOrIterables: (/*Array<Iterable<K, V>|V*/ Any)*): /*this*/ Iterable[K, V] = js.native
    
    def contains(value: V): Boolean = js.native
    
    /**
      * Returns the size of this Iterable.
      *
      * Regardless of if this Iterable can describe its size lazily (some Seqs
      * cannot), this method will always return the correct size. E.g. it
      * evaluates a lazy `Seq` if necessary.
      *
      * If `predicate` is provided, then this returns the count of entries in the
      * Iterable for which the `predicate` returns true.
      */
    def count(): Double = js.native
    def count(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): Double = js.native
    def count(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): Double = js.native
    
    /**
      * Returns a `Seq.Keyed` of counts, grouped by the return value of
      * the `grouper` function.
      *
      * Note: This is not a lazy operation.
      */
    def countBy[G](
      grouper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          G
        ]
    ): Map[G, Double] = js.native
    def countBy[G](
      grouper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          G
        ],
      context: Any
    ): Map[G, Double] = js.native
    
    /**
      * An iterator of this `Iterable`'s entries as `[key, value]` tuples.
      *
      * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `entrySeq` instead, if this is what you want.
      */
    def entries(): Iterator[/*[K, V]*/ js.Array[Any]] = js.native
    
    /**
      * Returns a new Seq.Indexed of [key, value] tuples.
      */
    def entrySeq(): Indexed[/*(K, V)*/ js.Array[Any]] = js.native
    
    // Value equality
    /**
      * True if this and the other Iterable have value equality, as defined
      * by `Immutable.is()`.
      *
      * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
      * allow for chained expressions.
      */
    def equals(other: Iterable[K, V]): Boolean = js.native
    
    /**
      * True if `predicate` returns true for all entries in the Iterable.
      */
    def every(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): Boolean = js.native
    def every(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): Boolean = js.native
    
    /**
      * Returns a new Iterable of the same type with only the entries for which
      * the `predicate` function returns true.
      *
      *     Seq({a:1,b:2,c:3,d:4}).filter(x => x % 2 === 0)
      *     // Seq { b: 2, d: 4 }
      *
      */
    def filter(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def filter(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type with only the entries for which
      * the `predicate` function returns false.
      *
      *     Seq({a:1,b:2,c:3,d:4}).filterNot(x => x % 2 === 0)
      *     // Seq { a: 1, c: 3 }
      *
      */
    def filterNot(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def filterNot(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    // Search for value
    /**
      * Returns the first value for which the `predicate` returns true.
      */
    def find(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): V = js.native
    def find(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): V = js.native
    def find(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any,
      notSetValue: V
    ): V = js.native
    def find(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Unit,
      notSetValue: V
    ): V = js.native
    
    /**
      * Returns the first [key, value] entry for which the `predicate` returns true.
      */
    def findEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any,
      notSetValue: V
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Unit,
      notSetValue: V
    ): /*[K, V]*/ js.Array[Any] = js.native
    
    /**
      * Returns the key for which the `predicate` returns true.
      */
    def findKey(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
          Boolean
        ]
    ): K = js.native
    def findKey(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
          Boolean
        ],
      context: Any
    ): K = js.native
    
    /**
      * Returns the last value for which the `predicate` returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLast(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): V = js.native
    def findLast(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): V = js.native
    def findLast(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any,
      notSetValue: V
    ): V = js.native
    def findLast(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Unit,
      notSetValue: V
    ): V = js.native
    
    /**
      * Returns the last [key, value] entry for which the `predicate`
      * returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLastEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findLastEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findLastEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any,
      notSetValue: V
    ): /*[K, V]*/ js.Array[Any] = js.native
    def findLastEntry(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Unit,
      notSetValue: V
    ): /*[K, V]*/ js.Array[Any] = js.native
    
    /**
      * Returns the last key for which the `predicate` returns true.
      *
      * Note: `predicate` will be called for each entry in reverse.
      */
    def findLastKey(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
          Boolean
        ]
    ): K = js.native
    def findLastKey(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
          Boolean
        ],
      context: Any
    ): K = js.native
    
    /**
      * The first value in the Iterable.
      */
    def first(): V = js.native
    
    /**
      * Flat-maps the Iterable, returning an Iterable of the same type.
      *
      * Similar to `iter.map(...).flatten(true)`.
      */
    def flatMap[MK, MV](
      mapper: js.Function3[
          js.UndefOr[V], 
          js.UndefOr[K], 
          js.UndefOr[/*this*/ Iterable[K, V]], 
          (/*iterable-like*/ Any) | (Iterable[MK, MV])
        ]
    ): /*this*/ Iterable[MK, MV] = js.native
    def flatMap[MK, MV](
      mapper: js.Function3[
          js.UndefOr[V], 
          js.UndefOr[K], 
          js.UndefOr[/*this*/ Iterable[K, V]], 
          (/*iterable-like*/ Any) | (Iterable[MK, MV])
        ],
      context: Any
    ): /*this*/ Iterable[MK, MV] = js.native
    
    /**
      * Flattens nested Iterables.
      *
      * Will deeply flatten the Iterable by default, returning an Iterable of the
      * same type, but a `depth` can be provided in the form of a number or
      * boolean (where true means to shallowly flatten one level). A depth of 0
      * (or shallow: false) will deeply flatten.
      *
      * Flattens only others Iterable, not Arrays or Objects.
      *
      * Note: `flatten(true)` operates on Iterable<any, Iterable<K, V>> and
      * returns Iterable<K, V>
      */
    def flatten(): /*this*/ Iterable[Any, Any] = js.native
    def flatten(depth: Double): /*this*/ Iterable[Any, Any] = js.native
    def flatten(shallow: Boolean): /*this*/ Iterable[Any, Any] = js.native
    
    // Side effects
    /**
      * The `sideEffect` is executed for every entry in the Iterable.
      *
      * Unlike `Array#forEach`, if any call of `sideEffect` returns
      * `false`, the iteration will stop. Returns the number of entries iterated
      * (including the last iteration which returned false).
      */
    def forEach(
      sideEffect: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Any
        ]
    ): Double = js.native
    def forEach(
      sideEffect: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Any
        ],
      context: Any
    ): Double = js.native
    
    // Reading values
    /**
      * Returns the value associated with the provided key, or notSetValue if
      * the Iterable does not contain this key.
      *
      * Note: it is possible a key may be associated with an `undefined` value,
      * so if `notSetValue` is not provided and this method returns `undefined`,
      * that does not guarantee the key was not found.
      */
    def get(key: K): V = js.native
    def get(key: K, notSetValue: V): V = js.native
    
    // Reading deep values
    /**
      * Returns the value found by following a path of keys or indices through
      * nested Iterables.
      */
    def getIn(searchKeyPath: js.Array[Any]): Any = js.native
    def getIn(searchKeyPath: js.Array[Any], notSetValue: Any): Any = js.native
    def getIn(searchKeyPath: Iterable[Any, Any]): Any = js.native
    def getIn(searchKeyPath: Iterable[Any, Any], notSetValue: Any): Any = js.native
    
    /**
      * Returns a `Iterable.Keyed` of `Iterable.Keyeds`, grouped by the return
      * value of the `grouper` function.
      *
      * Note: This is always an eager operation.
      */
    def groupBy[G](
      grouper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          G
        ]
    ): /*Map*/ typings.victoryCore.immutableTypesMod.Seq.Keyed[G, /*this*/ Iterable[K, V]] = js.native
    def groupBy[G](
      grouper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          G
        ],
      context: Any
    ): /*Map*/ typings.victoryCore.immutableTypesMod.Seq.Keyed[G, /*this*/ Iterable[K, V]] = js.native
    
    /**
      * True if a key exists within this `Iterable`, using `Immutable.is` to determine equality
      */
    def has(key: K): Boolean = js.native
    
    /**
      * True if the result of following a path of keys or indices through nested
      * Iterables results in a set value.
      */
    def hasIn(searchKeyPath: js.Array[Any]): Boolean = js.native
    def hasIn(searchKeyPath: Iterable[Any, Any]): Boolean = js.native
    
    /**
      * True if a value exists within this `Iterable`, using `Immutable.is` to determine equality
      * @alias contains
      */
    def includes(value: V): Boolean = js.native
    
    /**
      * Returns true if this Iterable includes no values.
      *
      * For some lazy `Seq`, `isEmpty` might need to iterate to determine
      * emptiness. At most one iteration will occur.
      */
    def isEmpty(): Boolean = js.native
    
    def isSubset(iter: js.Array[V]): Boolean = js.native
    // Comparison
    /**
      * True if `iter` includes every value in this Iterable.
      */
    def isSubset(iter: Iterable[Any, V]): Boolean = js.native
    
    def isSuperset(iter: js.Array[V]): Boolean = js.native
    /**
      * True if this Iterable includes every value in `iter`.
      */
    def isSuperset(iter: Iterable[Any, V]): Boolean = js.native
    
    /**
      * Joins values together as a string, inserting a separator between each.
      * The default separator is `","`.
      */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns the key associated with the search value, or undefined.
      */
    def keyOf(searchValue: V): K = js.native
    
    // Iterables (Seq)
    /**
      * Returns a new Seq.Indexed of the keys of this Iterable,
      * discarding values.
      */
    def keySeq(): Indexed[K] = js.native
    
    // Iterators
    /**
      * An iterator of this `Iterable`'s keys.
      *
      * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `keySeq` instead, if this is what you want.
      */
    def keys(): Iterator[K] = js.native
    
    /**
      * The last value in the Iterable.
      */
    def last(): V = js.native
    
    /**
      * Returns the last key associated with the search value, or undefined.
      */
    def lastKeyOf(searchValue: V): K = js.native
    
    // Sequence algorithms
    /**
      * Returns a new Iterable of the same type with values passed through a
      * `mapper` function.
      *
      *     Seq({ a: 1, b: 2 }).map(x => 10 * x)
      *     // Seq { a: 10, b: 20 }
      *
      */
    def map[M](
      mapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          M
        ]
    ): /*this*/ Iterable[K, M] = js.native
    def map[M](
      mapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          M
        ],
      context: Any
    ): /*this*/ Iterable[K, M] = js.native
    
    /**
      * Returns the maximum value in this collection. If any values are
      * comparatively equivalent, the first one found will be returned.
      *
      * The `comparator` is used in the same way as `Iterable#sort`. If it is not
      * provided, the default comparator is `>`.
      *
      * When two values are considered equivalent, the first encountered will be
      * returned. Otherwise, `max` will operate independent of the order of input
      * as long as the comparator is commutative. The default comparator `>` is
      * commutative *only* when types do not differ.
      *
      * If `comparator` returns 0 and either value is NaN, undefined, or null,
      * that value will be returned.
      */
    def max(): V = js.native
    def max(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): V = js.native
    
    /**
      * Like `max`, but also accepts a `comparatorValueMapper` which allows for
      * comparing by more sophisticated means:
      *
      *     hitters.maxBy(hitter => hitter.avgHits);
      *
      */
    def maxBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ]
    ): V = js.native
    def maxBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ],
      comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
    ): V = js.native
    
    /**
      * Returns the minimum value in this collection. If any values are
      * comparatively equivalent, the first one found will be returned.
      *
      * The `comparator` is used in the same way as `Iterable#sort`. If it is not
      * provided, the default comparator is `<`.
      *
      * When two values are considered equivalent, the first encountered will be
      * returned. Otherwise, `min` will operate independent of the order of input
      * as long as the comparator is commutative. The default comparator `<` is
      * commutative *only* when types do not differ.
      *
      * If `comparator` returns 0 and either value is NaN, undefined, or null,
      * that value will be returned.
      */
    def min(): V = js.native
    def min(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): V = js.native
    
    /**
      * Like `min`, but also accepts a `comparatorValueMapper` which allows for
      * comparing by more sophisticated means:
      *
      *     hitters.minBy(hitter => hitter.avgHits);
      *
      */
    def minBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ]
    ): V = js.native
    def minBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ],
      comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
    ): V = js.native
    
    // Reducing a value
    /**
      * Reduces the Iterable to a value by calling the `reducer` for every entry
      * in the Iterable and passing along the reduced value.
      *
      * If `initialReduction` is not provided, or is null, the first item in the
      * Iterable will be used.
      *
      * @see `Array#reduce`.
      */
    def reduce[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ]
    ): R = js.native
    def reduce[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: R
    ): R = js.native
    def reduce[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: R,
      context: Any
    ): R = js.native
    def reduce[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: Unit,
      context: Any
    ): R = js.native
    
    /**
      * Reduces the Iterable in reverse (from the right side).
      *
      * Note: Similar to this.reverse().reduce(), and provided for parity
      * with `Array#reduceRight`.
      */
    def reduceRight[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ]
    ): R = js.native
    def reduceRight[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: R
    ): R = js.native
    def reduceRight[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: R,
      context: Any
    ): R = js.native
    def reduceRight[R](
      reducer: js.Function4[
          /* reduction */ js.UndefOr[R], 
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          R
        ],
      initialReduction: Unit,
      context: Any
    ): R = js.native
    
    /**
      * Returns a new Iterable of the same type containing all entries except
      * the first.
      */
    def rest(): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type in reverse order.
      */
    def reverse(): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Note: this is here as a convenience to work around an issue with
      * TypeScript https://github.com/Microsoft/TypeScript/issues/285, but
      * Iterable does not define `size`, instead `Seq` defines `size` as
      * nullable number, and `Collection` defines `size` as always a number.
      *
      * @ignore
      */
    var size: Double = js.native
    
    /**
      * Returns a new Iterable of the same type which excludes the first `amount`
      * entries from this Iterable.
      */
    def skip(amount: Double): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which excludes the last `amount`
      * entries from this Iterable.
      */
    def skipLast(amount: Double): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes entries starting
      * from when `predicate` first returns true.
      *
      *     Seq.of('dog','frog','cat','hat','god')
      *       .skipUntil(x => x.match(/hat/))
      *     // Seq [ 'hat', 'god' ]
      *
      */
    def skipUntil(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def skipUntil(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes entries starting
      * from when `predicate` first returns false.
      *
      *     Seq.of('dog','frog','cat','hat','god')
      *       .skipWhile(x => x.match(/g/))
      *     // Seq [ 'cat', 'hat', 'god' ]
      *
      */
    def skipWhile(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def skipWhile(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    // Creating subsets
    /**
      * Returns a new Iterable of the same type representing a portion of this
      * Iterable from start up to but not including end.
      *
      * If begin is negative, it is offset from the end of the Iterable. e.g.
      * `slice(-2)` returns a Iterable of the last two entries. If it is not
      * provided the new Iterable will begin at the beginning of this Iterable.
      *
      * If end is negative, it is offset from the end of the Iterable. e.g.
      * `slice(0, -1)` returns an Iterable of everything but the last entry. If
      * it is not provided, the new Iterable will continue through the end of
      * this Iterable.
      *
      * If the requested slice is equivalent to the current Iterable, then it
      * will return itself.
      */
    def slice(): /*this*/ Iterable[K, V] = js.native
    def slice(begin: Double): /*this*/ Iterable[K, V] = js.native
    def slice(begin: Double, end: Double): /*this*/ Iterable[K, V] = js.native
    def slice(begin: Unit, end: Double): /*this*/ Iterable[K, V] = js.native
    
    /**
      * True if `predicate` returns true for any entry in the Iterable.
      */
    def some(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): Boolean = js.native
    def some(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): Boolean = js.native
    
    /**
      * Returns a new Iterable of the same type which includes the same entries,
      * stably sorted by using a `comparator`.
      *
      * If a `comparator` is not provided, a default comparator uses `<` and `>`.
      *
      * `comparator(valueA, valueB)`:
      *
      *   * Returns `0` if the elements should not be swapped.
      *   * Returns `-1` (or any negative number) if `valueA` comes before `valueB`
      *   * Returns `1` (or any positive number) if `valueA` comes after `valueB`
      *   * Is pure, i.e. it must always return the same value for the same pair
      *     of values.
      *
      * When sorting collections which have no defined order, their ordered
      * equivalents will be returned. e.g. `map.sort()` returns OrderedMap.
      */
    def sort(): /*this*/ Iterable[K, V] = js.native
    def sort(comparator: js.Function2[/* valueA */ V, /* valueB */ V, Double]): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Like `sort`, but also accepts a `comparatorValueMapper` which allows for
      * sorting by more sophisticated means:
      *
      *     hitters.sortBy(hitter => hitter.avgHits);
      *
      */
    def sortBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def sortBy[C](
      comparatorValueMapper: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          C
        ],
      comparator: js.Function2[/* valueA */ C, /* valueB */ C, Double]
    ): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes the first `amount`
      * entries from this Iterable.
      */
    def take(amount: Double): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes the last `amount`
      * entries from this Iterable.
      */
    def takeLast(amount: Double): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes entries from this
      * Iterable as long as the `predicate` returns false.
      *
      *     Seq.of('dog','frog','cat','hat','god').takeUntil(x => x.match(/at/))
      *     // ['dog', 'frog']
      *
      */
    def takeUntil(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def takeUntil(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Returns a new Iterable of the same type which includes entries from this
      * Iterable as long as the `predicate` returns true.
      *
      *     Seq.of('dog','frog','cat','hat','god')
      *       .takeWhile(x => x.match(/o/))
      *     // Seq [ 'dog', 'frog' ]
      *
      */
    def takeWhile(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ]
    ): /*this*/ Iterable[K, V] = js.native
    def takeWhile(
      predicate: js.Function3[
          /* value */ js.UndefOr[V], 
          /* key */ js.UndefOr[K], 
          /* iter */ js.UndefOr[/*this*/ Iterable[K, V]], 
          Boolean
        ],
      context: Any
    ): /*this*/ Iterable[K, V] = js.native
    
    /**
      * Shallowly converts this iterable to an Array, discarding keys.
      */
    def toArray(): js.Array[V] = js.native
    
    /**
      * Returns an Seq.Indexed of the values of this Iterable, discarding keys.
      */
    def toIndexedSeq(): Indexed[V] = js.native
    
    // Conversion to JavaScript types
    /**
      * Deeply converts this Iterable to equivalent JS.
      *
      * `Iterable.Indexeds`, and `Iterable.Sets` become Arrays, while
      * `Iterable.Keyeds` become Objects.
      *
      * @alias toJSON
      */
    def toJS(): Any = js.native
    
    /**
      * Returns a Seq.Keyed from this Iterable where indices are treated as keys.
      *
      * This is useful if you want to operate on an
      * Iterable.Indexed and preserve the [index, value] pairs.
      *
      * The returned Seq will have identical iteration order as
      * this Iterable.
      *
      * Example:
      *
      *     var indexedSeq = Immutable.Seq.of('A', 'B', 'C');
      *     indexedSeq.filter(v => v === 'B').toString() // Seq [ 'B' ]
      *     var keyedSeq = indexedSeq.toKeyedSeq();
      *     keyedSeq.filter(v => v === 'B').toString() // Seq { 1: 'B' }
      *
      */
    def toKeyedSeq(): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = js.native
    
    /**
      * Converts this Iterable to a List, discarding keys.
      *
      * Note: This is equivalent to `List(this)`, but provided to allow
      * for chained expressions.
      */
    def toList(): typings.victoryCore.immutableTypesMod.List[V] = js.native
    
    // Conversion to Collections
    /**
      * Converts this Iterable to a Map, Throws if keys are not hashable.
      *
      * Note: This is equivalent to `Map(this.toKeyedSeq())`, but provided
      * for convenience and to allow for chained expressions.
      */
    def toMap(): Map[K, V] = js.native
    
    /**
      * Shallowly converts this Iterable to an Object.
      *
      * Throws if keys are not strings.
      */
    def toObject(): StringDictionary[V] = js.native
    
    /**
      * Converts this Iterable to a Map, maintaining the order of iteration.
      *
      * Note: This is equivalent to `OrderedMap(this.toKeyedSeq())`, but
      * provided for convenience and to allow for chained expressions.
      */
    def toOrderedMap(): OrderedMap[K, V] = js.native
    
    /**
      * Converts this Iterable to a Set, maintaining the order of iteration and
      * discarding keys.
      *
      * Note: This is equivalent to `OrderedSet(this.valueSeq())`, but provided
      * for convenience and to allow for chained expressions.
      */
    def toOrderedSet(): OrderedSet[V] = js.native
    
    // Conversion to Seq
    /**
      * Converts this Iterable to a Seq of the same kind (indexed,
      * keyed, or set).
      */
    def toSeq(): Seq[K, V] = js.native
    
    /**
      * Converts this Iterable to a Set, discarding keys. Throws if values
      * are not hashable.
      *
      * Note: This is equivalent to `Set(this)`, but provided to allow for
      * chained expressions.
      */
    def toSet(): Set[V] = js.native
    
    /**
      * Returns a Seq.Set of the values of this Iterable, discarding keys.
      */
    def toSetSeq(): typings.victoryCore.immutableTypesMod.Seq.Set[V] = js.native
    
    /**
      * Converts this Iterable to a Stack, discarding keys. Throws if values
      * are not hashable.
      *
      * Note: This is equivalent to `Stack(this)`, but provided to allow for
      * chained expressions.
      */
    def toStack(): Stack[V] = js.native
    
    /**
      * Returns an Seq.Indexed of the values of this Iterable, discarding keys.
      */
    def valueSeq(): Indexed[V] = js.native
    
    /**
      * An iterator of this `Iterable`'s values.
      *
      * Note: this will return an ES6 iterator which does not support Immutable JS sequence algorithms. Use `valueSeq` instead, if this is what you want.
      */
    def values(): Iterator[V] = js.native
  }
  object Iterable {
    
    inline def apply[T](array: js.Array[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
    inline def apply[T](iterable: /*ES6Iterable<T>*/ js.Object): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
    inline def apply[T](iterator: Iterator[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
    inline def apply[V](obj: StringDictionary[V]): Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Keyed[String, V]]
    inline def apply[V](value: V): typings.victoryCore.immutableTypesMod.Iterable.Indexed[V] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[V]]
    inline def apply[K, V](iterable: Iterable[K, V]): Iterable[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterable[K, V]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Iterable")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Indexed[T]
      extends StObject
         with Iterable[Double, T] {
      
      /**
        * Returns the first index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * Returns the last index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * If this is an iterable of [key, value] entry tuples, it will return a
        * Seq.Keyed of those entries.
        */
      def fromEntrySeq(): typings.victoryCore.immutableTypesMod.Seq.Keyed[Any, Any] = js.native
      
      // Search for value
      /**
        * Returns the first index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def indexOf(searchValue: T): Double = js.native
      
      /**
        * Returns an Iterable of the same type with the provided `iterables`
        * interleaved into this iterable.
        *
        * The resulting Iterable includes the first item from each, then the
        * second from each, etc.
        *
        *     I.Seq.of(1,2,3).interleave(I.Seq.of('A','B','C'))
        *     // Seq [ 1, 'A', 2, 'B', 3, 'C' ]
        *
        * The shortest Iterable stops interleave.
        *
        *     I.Seq.of(1,2,3).interleave(
        *       I.Seq.of('A','B'),
        *       I.Seq.of('X','Y','Z')
        *     )
        *     // Seq [ 1, 'A', 'X', 2, 'B', 'Y' ]
        */
      def interleave(iterables: (Iterable[Any, T])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      // Combination
      /**
        * Returns an Iterable of the same type with `separator` between each item
        * in this Iterable.
        */
      def interpose(separator: T): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns the last index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def lastIndexOf(searchValue: T): Double = js.native
      
      /**
        * Splice returns a new indexed Iterable by replacing a region of this
        * Iterable with new values. If values are not provided, it only skips the
        * region to be removed.
        *
        * `index` may be a negative number, which indexes back from the end of the
        * Iterable. `s.splice(-2)` splices after the second to last item.
        *
        *     Seq(['a','b','c','d']).splice(1, 2, 'q', 'r', 's')
        *     // Seq ['a', 'q', 'r', 's', 'd']
        *
        */
      def splice(index: Double, removeNum: Double, values: (/*Array<Iterable.Indexed<T> | T>*/ Any)*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables.
        *
        * Like `zipWith`, but using the default `zipper`: creating an `Array`.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zip(b); // Seq [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
        *
        */
      def zip(iterables: (Iterable[Any, Any])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[Any] = js.native
      
      def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], iterables: (Iterable[Any, Any])*): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables by using a custom `zipper` function.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zipWith((a, b) => a + b, b); // Seq [ 5, 7, 9 ]
        *
        */
      def zipWith[U, Z](zipper: js.Function2[/* value */ T, /* otherValue */ U, Z], otherIterable: Iterable[Any, U]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      def zipWith[U, V, Z](
        zipper: js.Function3[/* value */ T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherIterable: Iterable[Any, U],
        thirdIterable: Iterable[Any, V]
      ): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
    }
    object Indexed {
      
      inline def apply[T](array: js.Array[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
      inline def apply[T](iterator: Iterator[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
      inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
      inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Indexed")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Indexed[/*[K,V]*/ Any]]
    }
    
    @js.native
    trait Keyed[K, V]
      extends StObject
         with Iterable[K, V] {
      
      // Sequence functions
      /**
        * Returns a new Iterable.Keyed of the same type where the keys and values
        * have been flipped.
        *
        *     Seq({ a: 'z', b: 'y' }).flip() // { z: 'a', y: 'b' }
        *
        */
      def flip(): /*this*/ Keyed[V, K] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with entries
        * ([key, value] tuples) passed through a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapEntries(([k, v]) => [k.toUpperCase(), v * 2])
        *     // Seq { A: 2, B: 4 }
        *
        */
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ]
      ): /*this*/ Keyed[KM, VM] = js.native
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ],
        context: Any
      ): /*this*/ Keyed[KM, VM] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with keys passed through
        * a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapKeys(x => x.toUpperCase())
        *     // Seq { A: 1, B: 2 }
        *
        */
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
              M
            ]
      ): /*this*/ Keyed[M, V] = js.native
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ Keyed[K, V]], 
              M
            ],
        context: Any
      ): /*this*/ Keyed[M, V] = js.native
    }
    object Keyed {
      
      inline def apply[V](obj: StringDictionary[V]): Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[Keyed[String, V]]
      inline def apply[K, V](array: js.Array[/*[K,V]*/ Any]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(array.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
      inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterable.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
      inline def apply[K, V](iterator: Iterator[/*[K,V]*/ Any]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterator.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
      inline def apply[K, V](iter: Iterable[Any, /*[K,V]*/ Any]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iter.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
      inline def apply[K, V](iter: Keyed[K, V]): Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iter.asInstanceOf[js.Any]).asInstanceOf[Keyed[K, V]]
    }
    
    @js.native
    trait Set[T]
      extends StObject
         with Iterable[T, T]
    object Set {
      
      inline def apply[T](array: js.Array[T]): typings.victoryCore.immutableTypesMod.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.victoryCore.immutableTypesMod.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[T]]
      inline def apply[T](iterator: Iterator[T]): typings.victoryCore.immutableTypesMod.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[T]]
      inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): typings.victoryCore.immutableTypesMod.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[T]]
      inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): typings.victoryCore.immutableTypesMod.Iterable.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[T]]
      inline def apply[K, V](iter: Keyed[K, V]): typings.victoryCore.immutableTypesMod.Iterable.Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Iterable.Set[/*[K,V]*/ Any]]
    }
    
    /**
      * True if `maybeAssociative` is either a keyed or indexed Iterable.
      */
    inline def isAssociative(maybeAssociative: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssociative")(maybeAssociative.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * True if `maybeIndexed` is a Iterable.Indexed, or any of its subclasses.
      */
    inline def isIndexed(maybeIndexed: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(maybeIndexed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * True if `maybeIterable` is an Iterable, or any of its subclasses.
      */
    inline def isIterable(maybeIterable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(maybeIterable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * True if `maybeKeyed` is an Iterable.Keyed, or any of its subclasses.
      */
    inline def isKeyed(maybeKeyed: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyed")(maybeKeyed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * True if `maybeOrdered` is an Iterable where iteration order is well
      * defined. True for Iterable.Indexed as well as OrderedMap and OrderedSet.
      */
    inline def isOrdered(maybeOrdered: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrdered")(maybeOrdered.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait List[T]
    extends StObject
       with typings.victoryCore.immutableTypesMod.Collection.Indexed[T] {
    
    /**
      * @see `Map#asImmutable`
      */
    def asImmutable(): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * @see `Map#asMutable`
      */
    def asMutable(): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with 0 size and no values.
      */
    def clear(): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List which excludes this `index` and with a size 1 less
      * than this List. Values at indices above `index` are shifted down by 1 to
      * fill the position.
      *
      * This is synonymous with `list.splice(index, 1)`.
      *
      * `index` may be a negative number, which indexes back from the end of the
      * List. `v.delete(-1)` deletes the last item in the List.
      *
      * Note: `delete` cannot be safely used in IE8
      * @alias remove
      */
    def delete(index: Double): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List having removed the value at this `keyPath`. If any
      * keys in `keyPath` do not exist, no change will occur.
      *
      * @alias removeIn
      */
    def deleteIn(keyPath: js.Array[Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def deleteIn(keyPath: Iterable[Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with `value` at `index` with a size 1 more than this
      * List. Values at indices above `index` are shifted over by 1.
      *
      * This is synonymous with `list.splice(index, 0, value)
      */
    def insert(index: Double, value: T): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * @see `Map#merge`
      */
    def merge(iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * @see `Map#mergeDeep`
      */
    def mergeDeep(iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def mergeDeepIn(
      keyPath: js.Array[Any],
      iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*
    ): typings.victoryCore.immutableTypesMod.List[T] = js.native
    /**
      * @see `Map#mergeDeepIn`
      */
    def mergeDeepIn(keyPath: Iterable[Any, Any], iterables: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * @see `Map#mergeDeepWith`
      */
    def mergeDeepWith(
      merger: js.Function3[js.UndefOr[T], js.UndefOr[T], js.UndefOr[Double], T],
      iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*
    ): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def mergeIn(
      keyPath: js.Array[Any],
      iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*
    ): typings.victoryCore.immutableTypesMod.List[T] = js.native
    /**
      * @see `Map#mergeIn`
      */
    def mergeIn(keyPath: Iterable[Any, Any], iterables: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * @see `Map#mergeWith`
      */
    def mergeWith(
      merger: js.Function3[js.UndefOr[T], js.UndefOr[T], js.UndefOr[Double], T],
      iterables: (js.Array[T] | typings.victoryCore.immutableTypesMod.Iterable.Indexed[T])*
    ): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with a size ones less than this List, excluding
      * the last index in this List.
      *
      * Note: this differs from `Array#pop` because it returns a new
      * List rather than the removed value. Use `last()` to get the last value
      * in this List.
      */
    def pop(): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with the provided `values` appended, starting at this
      * List's `size`.
      */
    def push(values: T*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def remove(index: Double): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def removeIn(keyPath: js.Array[Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def removeIn(keyPath: Iterable[Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    // Persistent changes
    /**
      * Returns a new List which includes `value` at `index`. If `index` already
      * exists in this List, it will be replaced.
      *
      * `index` may be a negative number, which indexes back from the end of the
      * List. `v.set(-1, "value")` sets the last item in the List.
      *
      * If `index` larger than `size`, the returned List's `size` will be large
      * enough to include the `index`.
      */
    def set(index: Double, value: T): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    // Deep persistent changes
    /**
      * Returns a new List having set `value` at this `keyPath`. If any keys in
      * `keyPath` do not exist, a new immutable Map will be created at that key.
      *
      * Index numbers are used as keys to determine the path to follow in
      * the List.
      */
    def setIn(keyPath: js.Array[Any], value: Any): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def setIn(keyPath: Iterable[Any, Any], value: Any): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with size `size`. If `size` is less than this
      * List's size, the new List will exclude values at the higher indices.
      * If `size` is greater than this List's size, the new List will have
      * undefined values for the newly available indices.
      *
      * When building a new List and the final size is known up front, `setSize`
      * used in conjunction with `withMutations` may result in the more
      * performant construction.
      */
    def setSize(size: Double): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with a size ones less than this List, excluding
      * the first index in this List, shifting all other values to a lower index.
      *
      * Note: this differs from `Array#shift` because it returns a new
      * List rather than the removed value. Use `first()` to get the first
      * value in this List.
      */
    def shift(): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    /**
      * Returns a new List with the provided `values` prepended, shifting other
      * values ahead to higher indices.
      */
    def unshift(values: T*): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def update(index: Double, notSetValue: T, updater: js.Function1[/* value */ T, T]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def update(index: Double, updater: js.Function1[/* value */ T, T]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    /**
      * Returns a new List with an updated value at `index` with the return
      * value of calling `updater` with the existing value, or `notSetValue` if
      * `index` was not set. If called with a single argument, `updater` is
      * called with the List itself.
      *
      * `index` may be a negative number, which indexes back from the end of the
      * List. `v.update(-1)` updates the last item in the List.
      *
      * @see `Map#update`
      */
    def update(
      updater: js.Function1[
          /* value */ typings.victoryCore.immutableTypesMod.List[T], 
          typings.victoryCore.immutableTypesMod.List[T]
        ]
    ): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    def updateIn(keyPath: js.Array[Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    /**
      * @see `Map#updateIn`
      */
    def updateIn(keyPath: js.Array[Any], updater: js.Function1[/* value */ Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def updateIn(keyPath: Iterable[Any, Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    def updateIn(keyPath: Iterable[Any, Any], updater: js.Function1[/* value */ Any, Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
    
    // Transient changes
    /**
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `set`, `push`, `pop`, `shift`, `unshift` and
      * `merge` may be used mutatively.
      *
      * @see `Map#withMutations`
      */
    def withMutations(mutator: js.Function1[/* mutable */ typings.victoryCore.immutableTypesMod.List[T], Any]): typings.victoryCore.immutableTypesMod.List[T] = js.native
  }
  object List {
    
    inline def apply[T](): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[T](array: js.Array[T]): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[T](iterator: Iterator[T]): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
    inline def apply[K, V](iter: Keyed[K, V]): typings.victoryCore.immutableTypesMod.List[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.List[/*[K,V]*/ Any]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "List")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is a List
      */
    inline def isList(maybeList: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(maybeList.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new List containing `values`.
      */
    inline def of[T](values: T*): typings.victoryCore.immutableTypesMod.List[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.victoryCore.immutableTypesMod.List[T]]
  }
  
  @js.native
  trait Map[K, V]
    extends StObject
       with typings.victoryCore.immutableTypesMod.Collection.Keyed[K, V] {
    
    /**
      * The yin to `asMutable`'s yang. Because it applies to mutable collections,
      * this operation is *mutable* and returns itself. Once performed, the mutable
      * copy has become immutable and can be safely returned from a function.
      */
    def asImmutable(): Map[K, V] = js.native
    
    /**
      * Another way to avoid creation of intermediate Immutable maps is to create
      * a mutable copy of this collection. Mutable copies *always* return `this`,
      * and thus shouldn't be used for equality. Your function should never return
      * a mutable copy of a collection, only use it internally to create a new
      * collection. If possible, use `withMutations` as it provides an easier to
      * use API.
      *
      * Note: if the collection is already mutable, `asMutable` returns itself.
      *
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `set` and `merge` may be used mutatively.
      */
    def asMutable(): Map[K, V] = js.native
    
    /**
      * Returns a new Map containing no keys or values.
      */
    def clear(): Map[K, V] = js.native
    
    /**
      * Returns a new Map which excludes this `key`.
      *
      * Note: `delete` cannot be safely used in IE8, but is provided to mirror
      * the ES6 collection API.
      * @alias remove
      */
    def delete(key: K): Map[K, V] = js.native
    
    /**
      * Returns a new Map having removed the value at this `keyPath`. If any keys
      * in `keyPath` do not exist, no change will occur.
      *
      * @alias removeIn
      */
    def deleteIn(keyPath: js.Array[Any]): Map[K, V] = js.native
    def deleteIn(keyPath: Iterable[Any, Any]): Map[K, V] = js.native
    
    /**
      * Returns a new Map resulting from merging the provided Iterables
      * (or JS objects) into this Map. In other words, this takes each entry of
      * each iterable and sets it on this Map.
      *
      * If any of the values provided to `merge` are not Iterable (would return
      * false for `Immutable.Iterable.isIterable`) then they are deeply converted
      * via `Immutable.fromJS` before being merged. However, if the value is an
      * Iterable but includes non-iterable JS objects or arrays, those nested
      * values will be preserved.
      *
      *     var x = Immutable.Map({a: 10, b: 20, c: 30});
      *     var y = Immutable.Map({b: 40, a: 50, d: 60});
      *     x.merge(y) // { a: 50, b: 40, c: 30, d: 60 }
      *     y.merge(x) // { b: 20, a: 10, d: 60, c: 30 }
      *
      */
    def merge(iterables: ((Iterable[K, V]) | StringDictionary[V])*): Map[K, V] = js.native
    
    /**
      * Like `merge()`, but when two Iterables conflict, it merges them as well,
      * recursing deeply through the nested data.
      *
      *     var x = Immutable.fromJS({a: { x: 10, y: 10 }, b: { x: 20, y: 50 } });
      *     var y = Immutable.fromJS({a: { x: 2 }, b: { y: 5 }, c: { z: 3 } });
      *     x.mergeDeep(y) // {a: { x: 2, y: 10 }, b: { x: 20, y: 5 }, c: { z: 3 } }
      *
      */
    def mergeDeep(iterables: ((Iterable[K, V]) | StringDictionary[V])*): Map[K, V] = js.native
    
    def mergeDeepIn(keyPath: js.Array[Any], iterables: ((Iterable[K, V]) | StringDictionary[V])*): Map[K, V] = js.native
    /**
      * A combination of `updateIn` and `mergeDeep`, returning a new Map, but
      * performing the deep merge at a point arrived at by following the keyPath.
      * In other words, these two lines are equivalent:
      *
      *     x.updateIn(['a', 'b', 'c'], abc => abc.mergeDeep(y));
      *     x.mergeDeepIn(['a', 'b', 'c'], y);
      *
      */
    def mergeDeepIn(keyPath: Iterable[Any, Any], iterables: (Iterable[K, V])*): Map[K, V] = js.native
    
    /**
      * Like `mergeDeep()`, but when two non-Iterables conflict, it uses the
      * `merger` function to determine the resulting value.
      *
      *     var x = Immutable.fromJS({a: { x: 10, y: 10 }, b: { x: 20, y: 50 } });
      *     var y = Immutable.fromJS({a: { x: 2 }, b: { y: 5 }, c: { z: 3 } });
      *     x.mergeDeepWith((prev, next) => prev / next, y)
      *     // {a: { x: 5, y: 10 }, b: { x: 20, y: 10 }, c: { z: 3 } }
      *
      */
    def mergeDeepWith(
      merger: js.Function3[js.UndefOr[V], js.UndefOr[V], js.UndefOr[K], V],
      iterables: ((Iterable[K, V]) | StringDictionary[V])*
    ): Map[K, V] = js.native
    
    def mergeIn(keyPath: js.Array[Any], iterables: ((Iterable[K, V]) | StringDictionary[V])*): Map[K, V] = js.native
    /**
      * A combination of `updateIn` and `merge`, returning a new Map, but
      * performing the merge at a point arrived at by following the keyPath.
      * In other words, these two lines are equivalent:
      *
      *     x.updateIn(['a', 'b', 'c'], abc => abc.merge(y));
      *     x.mergeIn(['a', 'b', 'c'], y);
      *
      */
    def mergeIn(keyPath: Iterable[Any, Any], iterables: (Iterable[K, V])*): Map[K, V] = js.native
    
    /**
      * Like `merge()`, `mergeWith()` returns a new Map resulting from merging
      * the provided Iterables (or JS objects) into this Map, but uses the
      * `merger` function for dealing with conflicts.
      *
      *     var x = Immutable.Map({a: 10, b: 20, c: 30});
      *     var y = Immutable.Map({b: 40, a: 50, d: 60});
      *     x.mergeWith((prev, next) => prev / next, y) // { a: 0.2, b: 0.5, c: 30, d: 60 }
      *     y.mergeWith((prev, next) => prev / next, x) // { b: 2, a: 5, d: 60, c: 30 }
      *
      */
    def mergeWith(
      merger: js.Function3[js.UndefOr[V], js.UndefOr[V], js.UndefOr[K], V],
      iterables: ((Iterable[K, V]) | StringDictionary[V])*
    ): Map[K, V] = js.native
    
    def remove(key: K): Map[K, V] = js.native
    
    def removeIn(keyPath: js.Array[Any]): Map[K, V] = js.native
    def removeIn(keyPath: Iterable[Any, Any]): Map[K, V] = js.native
    
    // Persistent changes
    /**
      * Returns a new Map also containing the new key, value pair. If an equivalent
      * key already exists in this Map, it will be replaced.
      */
    def set(key: K, value: V): Map[K, V] = js.native
    
    def setIn(KeyPath: Iterable[Any, Any], value: Any): Map[K, V] = js.native
    // Deep persistent changes
    /**
      * Returns a new Map having set `value` at this `keyPath`. If any keys in
      * `keyPath` do not exist, a new immutable Map will be created at that key.
      */
    def setIn(keyPath: js.Array[Any], value: Any): Map[K, V] = js.native
    
    def update(key: K, notSetValue: V, updater: js.Function1[/* value */ V, V]): Map[K, V] = js.native
    def update(key: K, updater: js.Function1[/* value */ V, V]): Map[K, V] = js.native
    /**
      * Returns a new Map having updated the value at this `key` with the return
      * value of calling `updater` with the existing value, or `notSetValue` if
      * the key was not set. If called with only a single argument, `updater` is
      * called with the Map itself.
      *
      * Equivalent to: `map.set(key, updater(map.get(key, notSetValue)))`.
      */
    def update(updater: js.Function1[/* value */ Map[K, V], Map[K, V]]): Map[K, V] = js.native
    
    def updateIn(keyPath: js.Array[Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): Map[K, V] = js.native
    /**
      * Returns a new Map having applied the `updater` to the entry found at the
      * keyPath.
      *
      * If any keys in `keyPath` do not exist, new Immutable `Map`s will
      * be created at those keys. If the `keyPath` does not already contain a
      * value, the `updater` function will be called with `notSetValue`, if
      * provided, otherwise `undefined`.
      *
      *     var data = Immutable.fromJS({ a: { b: { c: 10 } } });
      *     data = data.updateIn(['a', 'b', 'c'], val => val * 2);
      *     // { a: { b: { c: 20 } } }
      *
      * If the `updater` function returns the same value it was called with, then
      * no change will occur. This is still true if `notSetValue` is provided.
      *
      *     var data1 = Immutable.fromJS({ a: { b: { c: 10 } } });
      *     data2 = data1.updateIn(['x', 'y', 'z'], 100, val => val);
      *     assert(data2 === data1);
      *
      */
    def updateIn(keyPath: js.Array[Any], updater: js.Function1[/* value */ Any, Any]): Map[K, V] = js.native
    def updateIn(keyPath: Iterable[Any, Any], notSetValue: Any, updater: js.Function1[/* value */ Any, Any]): Map[K, V] = js.native
    def updateIn(keyPath: Iterable[Any, Any], updater: js.Function1[/* value */ Any, Any]): Map[K, V] = js.native
    
    // Transient changes
    /**
      * Every time you call one of the above functions, a new immutable Map is
      * created. If a pure function calls a number of these to produce a final
      * return value, then a penalty on performance and memory has been paid by
      * creating all of the intermediate immutable Maps.
      *
      * If you need to apply a series of mutations to produce a new immutable
      * Map, `withMutations()` creates a temporary mutable copy of the Map which
      * can apply mutations in a highly performant manner. In fact, this is
      * exactly how complex mutations like `merge` are done.
      *
      * As an example, this results in the creation of 2, not 4, new Maps:
      *
      *     var map1 = Immutable.Map();
      *     var map2 = map1.withMutations(map => {
      *       map.set('a', 1).set('b', 2).set('c', 3);
      *     });
      *     assert(map1.size === 0);
      *     assert(map2.size === 3);
      *
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `set` and `merge` may be used mutatively.
      *
      */
    def withMutations(mutator: js.Function1[/* mutable */ Map[K, V], Any]): Map[K, V] = js.native
  }
  object Map {
    
    inline def apply[V](obj: StringDictionary[V]): Map[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Map[String, V]]
    inline def apply[K, V](): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Map[K, V]]
    inline def apply[K, V](array: js.Array[/*[K,V]*/ js.Array[Any]]): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    inline def apply[K, V](iterator: Iterator[/*[K,V]*/ js.Array[Any]]): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    inline def apply[K, V](iter: Iterable[Any, /*[K,V]*/ js.Array[Any]]): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    inline def apply[K, V](iter: Keyed[K, V]): Map[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Map")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is a Map
      */
    inline def isMap(maybeMap: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(maybeMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new Map from alternating keys and values
      */
    inline def of(keyValues: Any*): Map[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(keyValues.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Map[Any, Any]]
  }
  
  object OrderedMap {
    
    inline def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[String, V]]
    inline def apply[K, V](): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](array: js.Array[/*[K,V]*/ js.Array[Any]]): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](iterator: Iterator[/*[K,V]*/ js.Array[Any]]): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](iter: Iterable[Any, /*[K,V]*/ js.Array[Any]]): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    inline def apply[K, V](iter: Keyed[K, V]): OrderedMap[K, V] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[K, V]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "OrderedMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is an OrderedMap.
      */
    inline def isOrderedMap(maybeOrderedMap: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedMap")(maybeOrderedMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  type OrderedMap[K, V] = Map[K, V]
  
  object OrderedSet {
    
    inline def apply[T](): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[OrderedSet[T]]
    inline def apply[T](array: js.Array[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[T](iterable: /*Iterable<T>*/ js.Object): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[T](iterator: Iterator[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    inline def apply[K, V](iter: Keyed[K, V]): OrderedSet[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[/*[K,V]*/ Any]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "OrderedSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromKeys(obj: StringDictionary[Any]): OrderedSet[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[String]]
    /**
      * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
      * the keys from this Iterable or JavaScript Object.
      */
    inline def fromKeys[T](iter: Iterable[T, Any]): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[OrderedSet[T]]
    
    /**
      * True if the provided value is an OrderedSet.
      */
    inline def isOrderedSet(maybeOrderedSet: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrderedSet")(maybeOrderedSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new OrderedSet containing `values`.
      */
    inline def of[T](values: T*): OrderedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[OrderedSet[T]]
  }
  type OrderedSet[T] = Set[T]
  
  inline def Range(): Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")().asInstanceOf[Indexed[Double]]
  inline def Range(start: Double): Indexed[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any]).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Double, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Double, end: Unit, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Double, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  inline def Range(start: Unit, end: Unit, step: Double): Indexed[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("Range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Indexed[Double]]
  
  object Record {
    
    inline def apply(defaultValues: StringDictionary[Any]): Class = ^.asInstanceOf[js.Dynamic].apply(defaultValues.asInstanceOf[js.Any]).asInstanceOf[Class]
    inline def apply(defaultValues: StringDictionary[Any], name: String): Class = (^.asInstanceOf[js.Dynamic].apply(defaultValues.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Class]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Class
      extends StObject
         with Instantiable0[Map[String, Any]]
         with Instantiable1[
              (/* values */ Iterable[String, Any]) | (/* values */ StringDictionary[Any]), 
              Map[String, Any]
            ] {
      
      // deprecated
      def apply(): Map[String, Any] = js.native
      def apply(values: StringDictionary[Any]): Map[String, Any] = js.native
      def apply(values: Iterable[String, Any]): Map[String, Any] = js.native
    }
  }
  
  inline def Repeat[T](value: T): Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
  inline def Repeat[T](value: T, times: Double): Indexed[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[Indexed[T]]
  
  @js.native
  trait Seq[K, V]
    extends StObject
       with Iterable[K, V] {
    
    // Force evaluation
    /**
      * Because Sequences are lazy and designed to be chained together, they do
      * not cache their results. For example, this map function is called a total
      * of 6 times, as each `join` iterates the Seq of three values.
      *
      *     var squares = Seq.of(1,2,3).map(x => x * x);
      *     squares.join() + squares.join();
      *
      * If you know a `Seq` will be used multiple times, it may be more
      * efficient to first cache it in memory. Here, the map function is called
      * only 3 times.
      *
      *     var squares = Seq.of(1,2,3).map(x => x * x).cacheResult();
      *     squares.join() + squares.join();
      *
      * Use this method judiciously, as it must fully evaluate a Seq which can be
      * a burden on memory and possibly performance.
      *
      * Note: after calling `cacheResult`, a Seq will always have a `size`.
      */
    def cacheResult(): /*this*/ Seq[K, V] = js.native
  }
  object Seq {
    
    inline def apply[T](array: js.Array[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[T](iterable: /*ES6Iterable<T>*/ js.Object): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[T](iterator: Iterator[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
    inline def apply[V](obj: StringDictionary[V]): typings.victoryCore.immutableTypesMod.Seq.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[String, V]]
    inline def apply[K, V](): Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Seq[K, V]]
    inline def apply[K, V](iterable: Iterable[K, V]): Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Seq[K, V]]
    inline def apply[K, V](seq: Seq[K, V]): Seq[K, V] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[Seq[K, V]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Seq")
    @js.native
    val ^ : js.Any = js.native
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Indexed because var conflicts: size. Inlined fromEntrySeq, interpose, interleave, splice, zip, zipWith, zipWith, zipWith, indexOf, lastIndexOf, findIndex, findIndex, findLastIndex, findLastIndex */ @js.native
    trait Indexed[T]
      extends StObject
         with Seq[Double, T] {
      
      /**
        * Returns the first index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * Returns the last index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * If this is an iterable of [key, value] entry tuples, it will return a
        * Seq.Keyed of those entries.
        */
      def fromEntrySeq(): typings.victoryCore.immutableTypesMod.Seq.Keyed[Any, Any] = js.native
      
      // Search for value
      /**
        * Returns the first index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def indexOf(searchValue: T): Double = js.native
      
      /**
        * Returns an Iterable of the same type with the provided `iterables`
        * interleaved into this iterable.
        *
        * The resulting Iterable includes the first item from each, then the
        * second from each, etc.
        *
        *     I.Seq.of(1,2,3).interleave(I.Seq.of('A','B','C'))
        *     // Seq [ 1, 'A', 2, 'B', 3, 'C' ]
        *
        * The shortest Iterable stops interleave.
        *
        *     I.Seq.of(1,2,3).interleave(
        *       I.Seq.of('A','B'),
        *       I.Seq.of('X','Y','Z')
        *     )
        *     // Seq [ 1, 'A', 'X', 2, 'B', 'Y' ]
        */
      def interleave(iterables: (Iterable[Any, T])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      // Combination
      /**
        * Returns an Iterable of the same type with `separator` between each item
        * in this Iterable.
        */
      def interpose(separator: T): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns the last index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def lastIndexOf(searchValue: T): Double = js.native
      
      /**
        * Splice returns a new indexed Iterable by replacing a region of this
        * Iterable with new values. If values are not provided, it only skips the
        * region to be removed.
        *
        * `index` may be a negative number, which indexes back from the end of the
        * Iterable. `s.splice(-2)` splices after the second to last item.
        *
        *     Seq(['a','b','c','d']).splice(1, 2, 'q', 'r', 's')
        *     // Seq ['a', 'q', 'r', 's', 'd']
        *
        */
      def splice(index: Double, removeNum: Double, values: (/*Array<Iterable.Indexed<T> | T>*/ Any)*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables.
        *
        * Like `zipWith`, but using the default `zipper`: creating an `Array`.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zip(b); // Seq [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
        *
        */
      def zip(iterables: (Iterable[Any, Any])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[Any] = js.native
      
      def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], iterables: (Iterable[Any, Any])*): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables by using a custom `zipper` function.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zipWith((a, b) => a + b, b); // Seq [ 5, 7, 9 ]
        *
        */
      def zipWith[U, Z](zipper: js.Function2[T, /* otherValue */ U, Z], otherIterable: Iterable[Any, U]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      def zipWith[U, V, Z](
        zipper: js.Function3[T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherIterable: Iterable[Any, U],
        thirdIterable: Iterable[Any, V]
      ): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
    }
    /**
      * `Seq` which represents an ordered indexed list of values.
      */
    object Indexed {
      
      inline def apply[T](): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Indexed[T]]
      inline def apply[T](array: js.Array[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](iterator: Iterator[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](seq: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[T](seq: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): Indexed[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[Indexed[T]]
      inline def apply[K, V](seq: typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]): Indexed[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[Indexed[/*[K,V]*/ Any]]
      
      @JSImport("victory-core/lib/victory-util/immutable-types", "Seq.Indexed")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Provides an Seq.Indexed of the values provided.
        */
      inline def of[T](values: T*): Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Indexed[T]]
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Keyed because var conflicts: size. Inlined flip, mapKeys, mapKeys, mapEntries, mapEntries */ @js.native
    trait Keyed[K, V]
      extends StObject
         with Seq[K, V] {
      
      // Sequence functions
      /**
        * Returns a new Iterable.Keyed of the same type where the keys and values
        * have been flipped.
        *
        *     Seq({ a: 'z', b: 'y' }).flip() // { z: 'a', y: 'b' }
        *
        */
      def flip(): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[V, K] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with entries
        * ([key, value] tuples) passed through a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapEntries(([k, v]) => [k.toUpperCase(), v * 2])
        *     // Seq { A: 2, B: 4 }
        *
        */
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ]
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[KM, VM] = js.native
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ],
        context: Any
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[KM, VM] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with keys passed through
        * a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapKeys(x => x.toUpperCase())
        *     // Seq { A: 1, B: 2 }
        *
        */
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              M
            ]
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[M, V] = js.native
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              M
            ],
        context: Any
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[M, V] = js.native
    }
    object Keyed {
      
      inline def apply[V](obj: StringDictionary[V]): typings.victoryCore.immutableTypesMod.Seq.Keyed[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[String, V]]
      inline def apply[K, V](): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")().asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
      inline def apply[K, V](array: js.Array[/*[K,V]*/ Any]): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
      inline def apply[K, V](iterable: /*Iterable<[K,V]>*/ js.Object): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
      inline def apply[K, V](iterator: Iterator[/*[K,V]*/ Any]): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
      inline def apply[K, V](seq: Iterable[Any, /*[K,V]*/ Any]): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(seq.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
      inline def apply[K, V](seq: typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]): typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("Keyed")(seq.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Keyed[K, V]]
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Set because var conflicts: size. Inlined  */ @js.native
    trait Set[T]
      extends StObject
         with Seq[T, T]
    object Set {
      
      inline def apply[T](): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[T](array: js.Array[T]): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[T](iterable: /*Iterable<T>*/ js.Object): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[T](iterator: Iterator[T]): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[T](seq: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[T](seq: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
      inline def apply[K, V](seq: typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]): typings.victoryCore.immutableTypesMod.Seq.Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(seq.asInstanceOf[js.Any]).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[/*[K,V]*/ Any]]
      
      @JSImport("victory-core/lib/victory-util/immutable-types", "Seq.Set")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a Seq.Set of the provided values
        */
      inline def of[T](values: T*): typings.victoryCore.immutableTypesMod.Seq.Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[typings.victoryCore.immutableTypesMod.Seq.Set[T]]
    }
    
    /**
      * True if `maybeSeq` is a Seq, it is not backed by a concrete
      * structure such as Map, List, or Set.
      */
    inline def isSeq(maybeSeq: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(maybeSeq.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a Seq of the values provided. Alias for `Seq.Indexed.of()`.
      */
    inline def of[T](values: T*): Indexed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Indexed[T]]
  }
  
  @js.native
  trait Set[T]
    extends StObject
       with typings.victoryCore.immutableTypesMod.Collection.Set[T] {
    
    // Persistent changes
    /**
      * Returns a new Set which also includes this value.
      */
    def add(value: T): Set[T] = js.native
    
    /**
      * @see `Map#asImmutable`
      */
    def asImmutable(): Set[T] = js.native
    
    /**
      * @see `Map#asMutable`
      */
    def asMutable(): Set[T] = js.native
    
    /**
      * Returns a new Set containing no values.
      */
    def clear(): Set[T] = js.native
    
    /**
      * Returns a new Set which excludes this value.
      *
      * Note: `delete` cannot be safely used in IE8
      * @alias remove
      */
    def delete(value: T): Set[T] = js.native
    
    /**
      * Returns a Set which has removed any values not also contained
      * within `iterables`.
      */
    def intersect(iterables: (js.Array[T] | (Iterable[Any, T]))*): Set[T] = js.native
    
    def merge(iterables: (js.Array[T] | (Iterable[Any, T]))*): Set[T] = js.native
    
    def remove(value: T): Set[T] = js.native
    
    /**
      * Returns a Set excluding any values contained within `iterables`.
      */
    def subtract(iterables: (js.Array[T] | (Iterable[Any, T]))*): Set[T] = js.native
    
    /**
      * Returns a Set including any value from `iterables` that does not already
      * exist in this Set.
      * @alias merge
      */
    def union(iterables: (js.Array[T] | (Iterable[Any, T]))*): Set[T] = js.native
    
    // Transient changes
    /**
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `add` may be used mutatively.
      *
      * @see `Map#withMutations`
      */
    def withMutations(mutator: js.Function1[/* mutable */ Set[T], Any]): Set[T] = js.native
  }
  object Set {
    
    inline def apply[T](): Set[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Set[T]]
    inline def apply[T](array: js.Array[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[T](iterable: /*Iterable<T>*/ js.Object): Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[T](iterator: Iterator[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): Set[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    inline def apply[K, V](iter: Keyed[K, V]): Set[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Set[/*[K,V]*/ Any]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Set")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromKeys(obj: StringDictionary[Any]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
    /**
      * `Set.fromKeys()` creates a new immutable Set containing the keys from
      * this Iterable or JavaScript Object.
      */
    inline def fromKeys[T](iter: Iterable[T, Any]): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeys")(iter.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
    
    /**
      * True if the provided value is a Set
      */
    inline def isSet(maybeSet: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(maybeSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new Set containing `values`.
      */
    inline def of[T](values: T*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Set[T]]
  }
  
  @js.native
  trait Stack[T]
    extends StObject
       with typings.victoryCore.immutableTypesMod.Collection.Indexed[T] {
    
    /**
      * @see `Map#asImmutable`
      */
    def asImmutable(): Stack[T] = js.native
    
    /**
      * @see `Map#asMutable`
      */
    def asMutable(): Stack[T] = js.native
    
    // Persistent changes
    /**
      * Returns a new Stack with 0 size and no values.
      */
    def clear(): Stack[T] = js.native
    
    // Reading values
    /**
      * Alias for `Stack.first()`.
      */
    def peek(): T = js.native
    
    /**
      * Alias for `Stack#shift` and is not equivalent to `List#pop`.
      */
    def pop(): Stack[T] = js.native
    
    /**
      * Alias for `Stack#unshift` and is not equivalent to `List#push`.
      */
    def push(values: T*): Stack[T] = js.native
    
    def pushAll(iter: js.Array[T]): Stack[T] = js.native
    /**
      * Alias for `Stack#unshiftAll`.
      */
    def pushAll(iter: Iterable[Any, T]): Stack[T] = js.native
    
    /**
      * Returns a new Stack with a size ones less than this Stack, excluding
      * the first item in this Stack, shifting all other values to a lower index.
      *
      * Note: this differs from `Array#shift` because it returns a new
      * Stack rather than the removed value. Use `first()` or `peek()` to get the
      * first value in this Stack.
      */
    def shift(): Stack[T] = js.native
    
    /**
      * Returns a new Stack with the provided `values` prepended, shifting other
      * values ahead to higher indices.
      *
      * This is very efficient for Stack.
      */
    def unshift(values: T*): Stack[T] = js.native
    
    def unshiftAll(iter: js.Array[T]): Stack[T] = js.native
    /**
      * Like `Stack#unshift`, but accepts a iterable rather than varargs.
      */
    def unshiftAll(iter: Iterable[Any, T]): Stack[T] = js.native
    
    // Transient changes
    /**
      * Note: Not all methods can be used on a mutable collection or within
      * `withMutations`! Only `set`, `push`, and `pop` may be used mutatively.
      *
      * @see `Map#withMutations`
      */
    def withMutations(mutator: js.Function1[/* mutable */ Stack[T], Any]): Stack[T] = js.native
  }
  object Stack {
    
    inline def apply[T](): Stack[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Stack[T]]
    inline def apply[T](array: js.Array[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[T](iterable: /*Iterable<T>*/ js.Object): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[T](iterator: Iterator[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iterator.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[T](iter: typings.victoryCore.immutableTypesMod.Iterable.Set[T]): Stack[T] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Stack[T]]
    inline def apply[K, V](iter: Keyed[K, V]): Stack[/*[K,V]*/ Any] = ^.asInstanceOf[js.Dynamic].apply(iter.asInstanceOf[js.Any]).asInstanceOf[Stack[/*[K,V]*/ Any]]
    
    @JSImport("victory-core/lib/victory-util/immutable-types", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * True if the provided value is a Stack
      */
    inline def isStack(maybeStack: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStack")(maybeStack.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new Stack containing `values`.
      */
    inline def of[T](values: T*): Stack[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[scala.Seq[js.Any]]*).asInstanceOf[Stack[T]]
  }
  
  inline def fromJS(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fromJS(json: Any, reviver: js.Function2[/* k */ Any, /* v */ Iterable[Any, Any], Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJS")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def is(first: Any, second: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait Collection[K, V]
    extends StObject
       with Iterable[K, V]
  object Collection {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Indexed because var conflicts: size. Inlined fromEntrySeq, interpose, interleave, splice, zip, zipWith, zipWith, zipWith, indexOf, lastIndexOf, findIndex, findIndex, findLastIndex, findLastIndex */ @js.native
    trait Indexed[T]
      extends StObject
         with Collection[Double, T] {
      
      /**
        * Returns the first index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * Returns the last index in the Iterable where a value satisfies the
        * provided predicate function. Otherwise -1 is returned.
        */
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ]
      ): Double = js.native
      def findLastIndex(
        predicate: js.Function3[
              /* value */ js.UndefOr[T], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T]], 
              Boolean
            ],
        context: Any
      ): Double = js.native
      
      /**
        * If this is an iterable of [key, value] entry tuples, it will return a
        * Seq.Keyed of those entries.
        */
      def fromEntrySeq(): typings.victoryCore.immutableTypesMod.Seq.Keyed[Any, Any] = js.native
      
      // Search for value
      /**
        * Returns the first index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def indexOf(searchValue: T): Double = js.native
      
      /**
        * Returns an Iterable of the same type with the provided `iterables`
        * interleaved into this iterable.
        *
        * The resulting Iterable includes the first item from each, then the
        * second from each, etc.
        *
        *     I.Seq.of(1,2,3).interleave(I.Seq.of('A','B','C'))
        *     // Seq [ 1, 'A', 2, 'B', 3, 'C' ]
        *
        * The shortest Iterable stops interleave.
        *
        *     I.Seq.of(1,2,3).interleave(
        *       I.Seq.of('A','B'),
        *       I.Seq.of('X','Y','Z')
        *     )
        *     // Seq [ 1, 'A', 'X', 2, 'B', 'Y' ]
        */
      def interleave(iterables: (Iterable[Any, T])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      // Combination
      /**
        * Returns an Iterable of the same type with `separator` between each item
        * in this Iterable.
        */
      def interpose(separator: T): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns the last index at which a given value can be found in the
        * Iterable, or -1 if it is not present.
        */
      def lastIndexOf(searchValue: T): Double = js.native
      
      /**
        * Splice returns a new indexed Iterable by replacing a region of this
        * Iterable with new values. If values are not provided, it only skips the
        * region to be removed.
        *
        * `index` may be a negative number, which indexes back from the end of the
        * Iterable. `s.splice(-2)` splices after the second to last item.
        *
        *     Seq(['a','b','c','d']).splice(1, 2, 'q', 'r', 's')
        *     // Seq ['a', 'q', 'r', 's', 'd']
        *
        */
      def splice(index: Double, removeNum: Double, values: (/*Array<Iterable.Indexed<T> | T>*/ Any)*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[T] = js.native
      
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables.
        *
        * Like `zipWith`, but using the default `zipper`: creating an `Array`.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zip(b); // Seq [ [ 1, 4 ], [ 2, 5 ], [ 3, 6 ] ]
        *
        */
      def zip(iterables: (Iterable[Any, Any])*): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Indexed[Any] = js.native
      
      def zipWith[Z](zipper: js.Function1[/* repeated */ Any, Z], iterables: (Iterable[Any, Any])*): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      /**
        * Returns an Iterable of the same type "zipped" with the provided
        * iterables by using a custom `zipper` function.
        *
        *     var a = Seq.of(1, 2, 3);
        *     var b = Seq.of(4, 5, 6);
        *     var c = a.zipWith((a, b) => a + b, b); // Seq [ 5, 7, 9 ]
        *
        */
      def zipWith[U, Z](zipper: js.Function2[T, /* otherValue */ U, Z], otherIterable: Iterable[Any, U]): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
      def zipWith[U, V, Z](
        zipper: js.Function3[T, /* otherValue */ U, /* thirdValue */ V, Z],
        otherIterable: Iterable[Any, U],
        thirdIterable: Iterable[Any, V]
      ): typings.victoryCore.immutableTypesMod.Iterable.Indexed[Z] = js.native
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Keyed because var conflicts: size. Inlined flip, mapKeys, mapKeys, mapEntries, mapEntries */ @js.native
    trait Keyed[K, V]
      extends StObject
         with Collection[K, V] {
      
      // Sequence functions
      /**
        * Returns a new Iterable.Keyed of the same type where the keys and values
        * have been flipped.
        *
        *     Seq({ a: 'z', b: 'y' }).flip() // { z: 'a', y: 'b' }
        *
        */
      def flip(): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[V, K] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with entries
        * ([key, value] tuples) passed through a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapEntries(([k, v]) => [k.toUpperCase(), v * 2])
        *     // Seq { A: 2, B: 4 }
        *
        */
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ]
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[KM, VM] = js.native
      def mapEntries[KM, VM](
        mapper: js.Function3[
              /* entry */ js.UndefOr[/*(K, V)*/ js.Array[Any]], 
              /* index */ js.UndefOr[Double], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              /*[KM, VM]*/ js.Array[Any]
            ],
        context: Any
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[KM, VM] = js.native
      
      /**
        * Returns a new Iterable.Keyed of the same type with keys passed through
        * a `mapper` function.
        *
        *     Seq({ a: 1, b: 2 })
        *       .mapKeys(x => x.toUpperCase())
        *     // Seq { A: 1, B: 2 }
        *
        */
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              M
            ]
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[M, V] = js.native
      def mapKeys[M](
        mapper: js.Function3[
              /* key */ js.UndefOr[K], 
              /* value */ js.UndefOr[V], 
              /* iter */ js.UndefOr[/*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[K, V]], 
              M
            ],
        context: Any
      ): /*this*/ typings.victoryCore.immutableTypesMod.Iterable.Keyed[M, V] = js.native
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.victoryCore.immutableTypesMod.Iterable because Already inherited
    - typings.victoryCore.immutableTypesMod.Iterable.Set because var conflicts: size. Inlined  */ @js.native
    trait Set[T]
      extends StObject
         with Collection[T, T]
  }
  
  trait Iterator[T] extends StObject {
    
    def next(): Done[T]
  }
  object Iterator {
    
    inline def apply[T](next: () => Done[T]): Iterator[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Iterator[T]]
    }
    
    extension [Self <: Iterator[?], T](x: Self & Iterator[T]) {
      
      inline def setNext(value: () => Done[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
}
