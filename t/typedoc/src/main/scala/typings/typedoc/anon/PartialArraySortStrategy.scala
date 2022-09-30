package typings.typedoc.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import typings.typedoc.sortMod.SortStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>> */
trait PartialArraySortStrategy extends StObject {
  
  var at: js.UndefOr[js.Function1[/* index */ Double, js.UndefOr[SortStrategy]]] = js.undefined
  
  var concat: js.UndefOr[js.Function1[/* repeated */ js.Array[SortStrategy], js.Array[SortStrategy]]] = js.undefined
  
  var copyWithin: js.UndefOr[js.Function2[/* target */ Double, /* start */ Double, this.type]] = js.undefined
  
  var entries: js.UndefOr[js.Function0[IterableIterator[js.Tuple2[Double, SortStrategy]]]] = js.undefined
  
  var every: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ SortStrategy, 
        /* index */ Double, 
        /* array */ js.Array[SortStrategy], 
        /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
      ], 
      /* is std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> */ Boolean
    ]
  ] = js.undefined
  
  var fill: js.UndefOr[js.Function1[/* value */ SortStrategy, this.type]] = js.undefined
  
  var filter: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* value */ SortStrategy, 
        /* index */ Double, 
        /* array */ js.Array[SortStrategy], 
        /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
      ], 
      js.Array[SortStrategy]
    ]
  ] = js.undefined
  
  var find: js.UndefOr[
    js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ SortStrategy, 
        /* index */ Double, 
        /* obj */ js.Array[SortStrategy], 
        /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
      ], 
      js.UndefOr[SortStrategy]
    ]
  ] = js.undefined
  
  var findIndex: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* obj */ js.Array[SortStrategy], Any], 
      Double
    ]
  ] = js.undefined
  
  var flat: js.UndefOr[
    js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.typedoc.typedocInts.`1`]]]
  ] = js.undefined
  
  var flatMap: js.UndefOr[
    js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ SortStrategy, 
        /* index */ Double, 
        /* array */ js.Array[SortStrategy], 
        Any | js.Array[Any]
      ], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var forEach: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Unit], 
      Unit
    ]
  ] = js.undefined
  
  var includes: js.UndefOr[js.Function1[/* searchElement */ SortStrategy, Boolean]] = js.undefined
  
  var indexOf: js.UndefOr[js.Function1[/* searchElement */ SortStrategy, Double]] = js.undefined
  
  var join: js.UndefOr[js.Function0[String]] = js.undefined
  
  var keys: js.UndefOr[js.Function0[IterableIterator[Double]]] = js.undefined
  
  var lastIndexOf: js.UndefOr[js.Function1[/* searchElement */ SortStrategy, Double]] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Any], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var pop: js.UndefOr[js.Function0[js.UndefOr[SortStrategy]]] = js.undefined
  
  var push: js.UndefOr[js.Function1[/* repeated */ SortStrategy, Double]] = js.undefined
  
  var reduce: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ SortStrategy, 
        /* currentValue */ SortStrategy, 
        /* currentIndex */ Double, 
        /* array */ js.Array[SortStrategy], 
        SortStrategy
      ], 
      SortStrategy
    ]
  ] = js.undefined
  
  var reduceRight: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ SortStrategy, 
        /* currentValue */ SortStrategy, 
        /* currentIndex */ Double, 
        /* array */ js.Array[SortStrategy], 
        SortStrategy
      ], 
      SortStrategy
    ]
  ] = js.undefined
  
  var reverse: js.UndefOr[js.Function0[js.Array[SortStrategy]]] = js.undefined
  
  var shift: js.UndefOr[js.Function0[js.UndefOr[SortStrategy]]] = js.undefined
  
  var slice: js.UndefOr[js.Function0[js.Array[SortStrategy]]] = js.undefined
  
  var some: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Any], 
      Boolean
    ]
  ] = js.undefined
  
  var sort: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var splice: js.UndefOr[js.Function1[/* start */ Double, js.Array[SortStrategy]]] = js.undefined
  
  @JSName("toLocaleString")
  var toLocaleString_FPartialArraySortStrategy: js.UndefOr[js.Function0[String]] = js.undefined
  
  @JSName("toString")
  var toString_FPartialArraySortStrategy: js.UndefOr[js.Function0[String]] = js.undefined
  
  var unshift: js.UndefOr[js.Function1[/* repeated */ SortStrategy, Double]] = js.undefined
  
  var values: js.UndefOr[js.Function0[IterableIterator[SortStrategy]]] = js.undefined
}
object PartialArraySortStrategy {
  
  inline def apply(): PartialArraySortStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArraySortStrategy]
  }
  
  extension [Self <: PartialArraySortStrategy](x: Self) {
    
    inline def setAt(value: /* index */ Double => js.UndefOr[SortStrategy]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setConcat(value: /* repeated */ js.Array[SortStrategy] => js.Array[SortStrategy]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => PartialArraySortStrategy): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
    
    inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, SortStrategy]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ SortStrategy, 
          /* index */ Double, 
          /* array */ js.Array[SortStrategy], 
          /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
        ] => /* is std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setFill(value: /* value */ SortStrategy => PartialArraySortStrategy): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ SortStrategy, 
          /* index */ Double, 
          /* array */ js.Array[SortStrategy], 
          /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
        ] => js.Array[SortStrategy]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ SortStrategy, 
          /* index */ Double, 
          /* obj */ js.Array[SortStrategy], 
          /* is typedoc.typedoc/dist/lib/utils/sort.SortStrategy */ Boolean
        ] => js.UndefOr[SortStrategy]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* obj */ js.Array[SortStrategy], Any] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFlat(value: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.typedoc.typedocInts.`1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ SortStrategy, 
          /* index */ Double, 
          /* array */ js.Array[SortStrategy], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Unit] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
    
    inline def setIncludes(value: /* searchElement */ SortStrategy => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIndexOf(value: /* searchElement */ SortStrategy => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLastIndexOf(value: /* searchElement */ SortStrategy => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Any] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPop(value: () => js.UndefOr[SortStrategy]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(value: /* repeated */ SortStrategy => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ SortStrategy, 
          /* currentValue */ SortStrategy, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SortStrategy], 
          SortStrategy
        ] => SortStrategy
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ SortStrategy, 
          /* currentValue */ SortStrategy, 
          /* currentIndex */ Double, 
          /* array */ js.Array[SortStrategy], 
          SortStrategy
        ] => SortStrategy
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    
    inline def setReverse(value: () => js.Array[SortStrategy]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setShift(value: () => js.UndefOr[SortStrategy]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setSlice(value: () => js.Array[SortStrategy]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setSome(
      value: /* predicate */ js.Function3[/* value */ SortStrategy, /* index */ Double, /* array */ js.Array[SortStrategy], Any] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
    
    inline def setSort(value: () => PartialArraySortStrategy): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSplice(value: /* start */ Double => js.Array[SortStrategy]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
    
    inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setUnshift(value: /* repeated */ SortStrategy => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
    
    inline def setValues(value: () => IterableIterator[SortStrategy]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
