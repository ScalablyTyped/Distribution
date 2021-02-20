package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Array {
  
  @js.native
  trait ArrayOptions extends StObject {
    
    var sortCollate: js.UndefOr[typings.sugar.Function] = js.native
    
    var sortEquivalents: js.UndefOr[js.Object] = js.native
    
    var sortIgnore: js.UndefOr[typings.sugar.RegExp] = js.native
    
    var sortIgnoreCase: js.UndefOr[Boolean] = js.native
    
    var sortNatural: js.UndefOr[Boolean] = js.native
    
    var sortOrder: js.UndefOr[java.lang.String] = js.native
  }
  object ArrayOptions {
    
    @scala.inline
    def apply(): ArrayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayOptions]
    }
    
    @scala.inline
    implicit class ArrayOptionsMutableBuilder[Self <: ArrayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortCollate(value: typings.sugar.Function): Self = StObject.set(x, "sortCollate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortCollateUndefined: Self = StObject.set(x, "sortCollate", js.undefined)
      
      @scala.inline
      def setSortEquivalents(value: js.Object): Self = StObject.set(x, "sortEquivalents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortEquivalentsUndefined: Self = StObject.set(x, "sortEquivalents", js.undefined)
      
      @scala.inline
      def setSortIgnore(value: typings.sugar.RegExp): Self = StObject.set(x, "sortIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIgnoreCase(value: Boolean): Self = StObject.set(x, "sortIgnoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortIgnoreCaseUndefined: Self = StObject.set(x, "sortIgnoreCase", js.undefined)
      
      @scala.inline
      def setSortIgnoreUndefined: Self = StObject.set(x, "sortIgnore", js.undefined)
      
      @scala.inline
      def setSortNatural(value: Boolean): Self = StObject.set(x, "sortNatural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortNaturalUndefined: Self = StObject.set(x, "sortNatural", js.undefined)
      
      @scala.inline
      def setSortOrder(value: java.lang.String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  type Chainable[T, RawValue] = (ChainableBase[T, RawValue]) with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[T, RawValue] extends StObject {
    
    def add(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def add(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def add(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def add(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def append(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def append(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def append(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def append(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def at(index: Double): SugarDefaultChainable[T] = js.native
    def at(index: Double, loop: Boolean): SugarDefaultChainable[T] = js.native
    def at(index: typings.sugar.Array[Double]): SugarDefaultChainable[T] = js.native
    def at(index: typings.sugar.Array[Double], loop: Boolean): SugarDefaultChainable[T] = js.native
    
    def average[U](): SugarDefaultChainable[Double] = js.native
    def average[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def average[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def compact(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def compact(all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def concat(items: (typings.sugar.Array[T] | T)*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def copyWithin(target: Double, start: Double): SugarDefaultChainable[this.type] = js.native
    def copyWithin(target: Double, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    
    def count(search: T): SugarDefaultChainable[Double] = js.native
    def count(search: T, context: js.Any): SugarDefaultChainable[Double] = js.native
    def count(search: searchFn[T]): SugarDefaultChainable[Double] = js.native
    def count(search: searchFn[T], context: js.Any): SugarDefaultChainable[Double] = js.native
    
    def every(search: T): SugarDefaultChainable[Boolean] = js.native
    def every(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
    def every(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Boolean] = js.native
    def every(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T],
      context: js.Any
    ): SugarDefaultChainable[Boolean] = js.native
    
    def everyFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def everyFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def everyFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def exclude(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def exclude(search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def fill(value: T): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double): SugarDefaultChainable[this.type] = js.native
    def fill(value: T, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
    
    def filter(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def filter(search: T, context: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def filter(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], _]) | searchFn[T]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def filter(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], _]) | searchFn[T],
      context: js.Any
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def filterFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def filterFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def filterFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def find(search: T): SugarDefaultChainable[T] = js.native
    def find(search: T, context: js.Any): SugarDefaultChainable[T] = js.native
    def find(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[T] = js.native
    def find(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T],
      context: js.Any
    ): SugarDefaultChainable[T] = js.native
    
    def findFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def findFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def findFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def findIndex(search: T): SugarDefaultChainable[Double] = js.native
    def findIndex(search: T, context: js.Any): SugarDefaultChainable[Double] = js.native
    def findIndex(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Double] = js.native
    def findIndex(
      search: (js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.sugar.Array[T], Boolean]) | searchFn[T],
      context: js.Any
    ): SugarDefaultChainable[Double] = js.native
    
    def findIndexFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def findIndexFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def findIndexFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def first(): SugarDefaultChainable[T] = js.native
    def first(num: Double): SugarDefaultChainable[T] = js.native
    
    def flatten(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def flatten(limit: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Unit]
    ): SugarDefaultChainable[Unit] = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Unit],
      thisArg: js.Any
    ): SugarDefaultChainable[Unit] = js.native
    
    def forEachFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def forEachFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def forEachFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def from(index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def groupBy[U](map: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](
      map: java.lang.String,
      groupFn: js.Function3[
          /* arr */ typings.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
    def groupBy[U](
      map: mapFn[T, U],
      groupFn: js.Function3[
          /* arr */ typings.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    
    def inGroups(num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def inGroups(num: Double, padding: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def inGroupsOf(num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def inGroupsOf(num: Double, padding: js.Any): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def indexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def indexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    
    def insert(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def insert(item: T, index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def insert(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def insert(item: typings.sugar.Array[T], index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def intersect(arr: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def isEmpty(): SugarDefaultChainable[Boolean] = js.native
    
    def isEqual(arr: typings.sugar.Array[T]): SugarDefaultChainable[Boolean] = js.native
    
    def join(): SugarDefaultChainable[java.lang.String] = js.native
    def join(separator: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def last(): SugarDefaultChainable[T] = js.native
    def last(num: Double): SugarDefaultChainable[T] = js.native
    
    def lastIndexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
    
    def least[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](all: js.UndefOr[scala.Nothing], map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def least[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def map[U](
      map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], U]) | (mapFn[T, U])
    ): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
    def map[U](
      map: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], U]) | (mapFn[T, U]),
      context: js.Any
    ): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
    def map[U](map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
    def map[U](map: java.lang.String, context: js.Any): SugarDefaultChainable[typings.sugar.Array[U]] = js.native
    
    def mapFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def mapFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def mapFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def max[U](): SugarDefaultChainable[T] = js.native
    def max[U](all: js.UndefOr[scala.Nothing], map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def median[U](): SugarDefaultChainable[Double] = js.native
    def median[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def median[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def min[U](): SugarDefaultChainable[T] = js.native
    def min[U](all: js.UndefOr[scala.Nothing], map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def most[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](all: js.UndefOr[scala.Nothing], map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](all: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](all: Boolean, map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def most[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def none(search: T): SugarDefaultChainable[Boolean] = js.native
    def none(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
    def none(search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    def none(search: searchFn[T], context: js.Any): SugarDefaultChainable[Boolean] = js.native
    
    def pop(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    
    def push(items: T*): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    
    def reduceFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def reduceFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def reduceFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          T
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          T
        ],
      initialValue: T
    ): SugarDefaultChainable[T] = js.native
    
    def reduceRightFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def reduceRightFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def reduceRightFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    @JSName("reduceRight")
    def reduceRight_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    
    @JSName("reduce")
    def reduce_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.sugar.Array[T], 
          U
        ],
      initialValue: U
    ): SugarDefaultChainable[U] = js.native
    
    def remove(search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def remove(search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def removeAt(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def removeAt(start: Double, end: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def reverse(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def sample(): SugarDefaultChainable[T] = js.native
    def sample(num: js.UndefOr[scala.Nothing], remove: Boolean): SugarDefaultChainable[T] = js.native
    def sample(num: Double): SugarDefaultChainable[T] = js.native
    def sample(num: Double, remove: Boolean): SugarDefaultChainable[T] = js.native
    
    def shift(): SugarDefaultChainable[js.UndefOr[T]] = js.native
    
    def shuffle(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def slice(): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def slice(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def slice(start: Double, end: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def some(search: T): SugarDefaultChainable[Boolean] = js.native
    def some(search: T, context: js.Any): SugarDefaultChainable[Boolean] = js.native
    def some(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T]
    ): SugarDefaultChainable[Boolean] = js.native
    def some(
      search: (js.Function3[/* value */ T, /* index */ Double, /* array */ typings.sugar.Array[T], Boolean]) | searchFn[T],
      context: js.Any
    ): SugarDefaultChainable[Boolean] = js.native
    
    def someFromIndex(startIndex: Double, args: js.Any*): SugarDefaultChainable[T] = js.native
    def someFromIndex(startIndex: Double, loop: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[T] = js.native
    def someFromIndex(startIndex: Double, loop: Boolean, args: js.Any*): SugarDefaultChainable[T] = js.native
    
    def sort(): SugarDefaultChainable[this.type] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): SugarDefaultChainable[this.type] = js.native
    
    def sortBy[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def sortBy[U](map: js.UndefOr[scala.Nothing], desc: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def sortBy[U](map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def sortBy[U](map: java.lang.String, desc: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def sortBy[U](map: sortMapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def sortBy[U](map: sortMapFn[T, U], desc: Boolean): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def splice(start: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def subtract(item: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def subtract(item: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def sum[U](): SugarDefaultChainable[Double] = js.native
    def sum[U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def sum[U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def to(index: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def union(arr: typings.sugar.Array[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def unique[U](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def unique[U](map: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def unique[U](map: mapFn[T, U]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def unshift(items: T*): SugarDefaultChainable[Double] = js.native
    
    def zip(args: js.Any*): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[js.Object, typings.sugar.Array[js.Object]]]
       with Instantiable1[
          (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
          Chainable[js.Object, typings.sugar.Array[js.Object]]
        ]
       with Instantiable2[
          js.UndefOr[(/* obj */ ArrayLike[js.Object]) | (/* obj */ Double)], 
          /* clone */ Boolean, 
          Chainable[js.Object, typings.sugar.Array[js.Object]]
        ] {
    
    def apply[T](): Chainable[T, typings.sugar.Array[T]] = js.native
    def apply[T](obj: js.UndefOr[scala.Nothing], clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
    def apply[T](obj: Double): Chainable[T, typings.sugar.Array[T]] = js.native
    def apply[T](obj: Double, clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
    def apply[T](obj: ArrayLike[T]): Chainable[T, typings.sugar.Array[T]] = js.native
    def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typings.sugar.Array[T]] = js.native
    
    def add[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
    def add[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
    def add[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def add[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
    
    def append[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
    def append[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
    def append[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def append[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
    
    def at[T](instance: typings.sugar.Array[T], index: Double): T = js.native
    def at[T](instance: typings.sugar.Array[T], index: Double, loop: Boolean): T = js.native
    def at[T](instance: typings.sugar.Array[T], index: typings.sugar.Array[Double]): T = js.native
    def at[T](instance: typings.sugar.Array[T], index: typings.sugar.Array[Double], loop: Boolean): T = js.native
    
    def average[T, U](instance: typings.sugar.Array[T]): Double = js.native
    def average[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
    def average[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def clone[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    
    def compact[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def compact[T](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
    
    def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): typings.sugar.Array[T] = js.native
    
    def count[T](instance: typings.sugar.Array[T], search: T): Double = js.native
    def count[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Double = js.native
    def count[T](instance: typings.sugar.Array[T], search: searchFn[T]): Double = js.native
    def count[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
    
    def create[T](): typings.sugar.Array[T] = js.native
    def create[T](obj: js.UndefOr[scala.Nothing], clone: Boolean): typings.sugar.Array[T] = js.native
    def create[T](obj: Double): typings.sugar.Array[T] = js.native
    def create[T](obj: Double, clone: Boolean): typings.sugar.Array[T] = js.native
    def create[T](obj: ArrayLike[T]): typings.sugar.Array[T] = js.native
    def create[T](obj: ArrayLike[T], clone: Boolean): typings.sugar.Array[T] = js.native
    
    def every[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
    def every[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
    def every[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def every[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
    
    def everyFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def everyFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def everyFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def exclude[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
    def exclude[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
    
    def filter[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
    def filter[T](instance: typings.sugar.Array[T], search: T, context: js.Any): typings.sugar.Array[T] = js.native
    def filter[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
    def filter[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): typings.sugar.Array[T] = js.native
    
    def filterFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def filterFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def filterFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def find[T](instance: typings.sugar.Array[T], search: T): T = js.native
    def find[T](instance: typings.sugar.Array[T], search: T, context: js.Any): T = js.native
    def find[T](instance: typings.sugar.Array[T], search: searchFn[T]): T = js.native
    def find[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): T = js.native
    
    def findFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def findFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def findFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def findIndex[T](instance: typings.sugar.Array[T], search: T): Double = js.native
    def findIndex[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Double = js.native
    def findIndex[T](instance: typings.sugar.Array[T], search: searchFn[T]): Double = js.native
    def findIndex[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
    
    def findIndexFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def findIndexFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def findIndexFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def first[T](instance: typings.sugar.Array[T]): T = js.native
    def first[T](instance: typings.sugar.Array[T], num: Double): T = js.native
    
    def flatten[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def flatten[T](instance: typings.sugar.Array[T], limit: Double): typings.sugar.Array[T] = js.native
    
    def forEachFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def forEachFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def forEachFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def from[T](instance: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def groupBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String): js.Object = js.native
    def groupBy[T, U](
      instance: typings.sugar.Array[T],
      map: java.lang.String,
      groupFn: js.Function3[
          /* arr */ typings.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          Unit
        ]
    ): js.Object = js.native
    def groupBy[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): js.Object = js.native
    def groupBy[T, U](
      instance: typings.sugar.Array[T],
      map: mapFn[T, U],
      groupFn: js.Function3[
          /* arr */ typings.sugar.Array[T], 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          Unit
        ]
    ): js.Object = js.native
    
    def inGroups[T](instance: typings.sugar.Array[T], num: Double): typings.sugar.Array[T] = js.native
    def inGroups[T](instance: typings.sugar.Array[T], num: Double, padding: js.Any): typings.sugar.Array[T] = js.native
    
    def inGroupsOf[T](instance: typings.sugar.Array[T], num: Double): typings.sugar.Array[T] = js.native
    def inGroupsOf[T](instance: typings.sugar.Array[T], num: Double, padding: js.Any): typings.sugar.Array[T] = js.native
    
    def insert[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
    def insert[T](instance: typings.sugar.Array[T], item: T, index: Double): typings.sugar.Array[T] = js.native
    def insert[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def insert[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
    
    def intersect[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    
    def isEmpty[T](instance: typings.sugar.Array[T]): Boolean = js.native
    
    def isEqual[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): Boolean = js.native
    
    def last[T](instance: typings.sugar.Array[T]): T = js.native
    def last[T](instance: typings.sugar.Array[T], num: Double): T = js.native
    
    def least[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: java.lang.String): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
    def least[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    
    def map[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[U] = js.native
    def map[T, U](instance: typings.sugar.Array[T], map: java.lang.String, context: js.Any): typings.sugar.Array[U] = js.native
    def map[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[U] = js.native
    def map[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U], context: js.Any): typings.sugar.Array[U] = js.native
    
    def mapFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def mapFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def mapFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def max[T, U](instance: typings.sugar.Array[T]): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], all: Boolean): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], map: java.lang.String): T = js.native
    def max[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): T = js.native
    
    def median[T, U](instance: typings.sugar.Array[T]): Double = js.native
    def median[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
    def median[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def min[T, U](instance: typings.sugar.Array[T]): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], all: Boolean): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], map: java.lang.String): T = js.native
    def min[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): T = js.native
    
    def most[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: java.lang.String): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], all: Boolean): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], all: Boolean, map: java.lang.String): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
    def most[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    
    def none[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
    def none[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
    def none[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def none[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
    
    def reduceFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def reduceFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def reduceFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def reduceRightFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def reduceRightFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def reduceRightFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def remove[T](instance: typings.sugar.Array[T], search: T): typings.sugar.Array[T] = js.native
    def remove[T](instance: typings.sugar.Array[T], search: searchFn[T]): typings.sugar.Array[T] = js.native
    
    def removeAt[T](instance: typings.sugar.Array[T], start: Double): typings.sugar.Array[T] = js.native
    def removeAt[T](instance: typings.sugar.Array[T], start: Double, end: Double): typings.sugar.Array[T] = js.native
    
    def sample[T](instance: typings.sugar.Array[T]): T = js.native
    def sample[T](instance: typings.sugar.Array[T], num: js.UndefOr[scala.Nothing], remove: Boolean): T = js.native
    def sample[T](instance: typings.sugar.Array[T], num: Double): T = js.native
    def sample[T](instance: typings.sugar.Array[T], num: Double, remove: Boolean): T = js.native
    
    def setOption(name: java.lang.String, value: js.Any): Unit = js.native
    def setOption(options: ArrayOptions): Unit = js.native
    
    def shuffle[T](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    
    def some[T](instance: typings.sugar.Array[T], search: T): Boolean = js.native
    def some[T](instance: typings.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
    def some[T](instance: typings.sugar.Array[T], search: searchFn[T]): Boolean = js.native
    def some[T](instance: typings.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
    
    def someFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
    def someFromIndex[T](
      instance: typings.sugar.Array[T],
      startIndex: Double,
      loop: js.UndefOr[scala.Nothing],
      args: js.Any*
    ): T = js.native
    def someFromIndex[T](instance: typings.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
    
    def sortBy[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typings.sugar.Array[T], map: js.UndefOr[scala.Nothing], desc: Boolean): typings.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typings.sugar.Array[T], map: java.lang.String, desc: Boolean): typings.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typings.sugar.Array[T], map: sortMapFn[T, U]): typings.sugar.Array[T] = js.native
    def sortBy[T, U](instance: typings.sugar.Array[T], map: sortMapFn[T, U], desc: Boolean): typings.sugar.Array[T] = js.native
    
    def subtract[T](instance: typings.sugar.Array[T], item: T): typings.sugar.Array[T] = js.native
    def subtract[T](instance: typings.sugar.Array[T], item: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    
    def sum[T, U](instance: typings.sugar.Array[T]): Double = js.native
    def sum[T, U](instance: typings.sugar.Array[T], map: java.lang.String): Double = js.native
    def sum[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): Double = js.native
    
    def to[T](instance: typings.sugar.Array[T], index: Double): typings.sugar.Array[T] = js.native
    
    def union[T](instance: typings.sugar.Array[T], arr: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    
    def unique[T, U](instance: typings.sugar.Array[T]): typings.sugar.Array[T] = js.native
    def unique[T, U](instance: typings.sugar.Array[T], map: java.lang.String): typings.sugar.Array[T] = js.native
    def unique[T, U](instance: typings.sugar.Array[T], map: mapFn[T, U]): typings.sugar.Array[T] = js.native
    
    def zip[T](instance: typings.sugar.Array[T], args: js.Any*): typings.sugar.Array[T] = js.native
  }
  
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ Double, /* arr */ typings.sugar.Array[T], U]
  
  type searchFn[T] = js.Function3[/* el */ T, /* i */ Double, /* arr */ typings.sugar.Array[T], Boolean]
  
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
