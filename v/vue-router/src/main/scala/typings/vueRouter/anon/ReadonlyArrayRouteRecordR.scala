package typings.vueRouter.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import typings.vueRouter.mod.RouteRecordRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<vue-router.vue-router.RouteRecordRaw>> */
trait ReadonlyArrayRouteRecordR extends StObject {
  
  def at(index: Double): js.UndefOr[RouteRecordRaw]
  
  def concat(items: js.Array[RouteRecordRaw]*): js.Array[RouteRecordRaw]
  
  def copyWithin(target: Double, start: Double): this.type
  
  def entries(): IterableIterator[js.Tuple2[Double, RouteRecordRaw]]
  
  def every[S /* <: RouteRecordRaw */](
    predicate: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ]
  ): /* is std.Array<S> */ Boolean
  
  def fill(value: RouteRecordRaw): this.type
  
  def filter[S /* <: RouteRecordRaw */](
    predicate: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ]
  ): js.Array[S]
  
  def find[S /* <: RouteRecordRaw */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* obj */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S]
  
  def findIndex(
    predicate: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* obj */ js.Array[RouteRecordRaw], 
      Any
    ]
  ): Double
  
  def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
  
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      U | js.Array[U]
    ]
  ): js.Array[U]
  
  def forEach(
    callbackfn: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Unit
    ]
  ): Unit
  
  def includes(searchElement: RouteRecordRaw): Boolean
  
  def indexOf(searchElement: RouteRecordRaw): Double
  
  def join(): String
  
  def keys(): IterableIterator[Double]
  
  def lastIndexOf(searchElement: RouteRecordRaw): Double
  
  val length: Double
  
  def map[U](
    callbackfn: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      U
    ]
  ): js.Array[U]
  
  def pop(): js.UndefOr[RouteRecordRaw]
  
  def push(items: RouteRecordRaw*): Double
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ RouteRecordRaw, 
      /* currentValue */ RouteRecordRaw, 
      /* currentIndex */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      RouteRecordRaw
    ]
  ): RouteRecordRaw
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ RouteRecordRaw, 
      /* currentValue */ RouteRecordRaw, 
      /* currentIndex */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      RouteRecordRaw
    ]
  ): RouteRecordRaw
  
  def reverse(): js.Array[RouteRecordRaw]
  
  def shift(): js.UndefOr[RouteRecordRaw]
  
  def slice(): js.Array[RouteRecordRaw]
  
  def some(
    predicate: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Any
    ]
  ): Boolean
  
  def sort(): this.type
  
  def splice(start: Double): js.Array[RouteRecordRaw]
  
  def unshift(items: RouteRecordRaw*): Double
  
  def values(): IterableIterator[RouteRecordRaw]
}
object ReadonlyArrayRouteRecordR {
  
  inline def apply(
    at: Double => js.UndefOr[RouteRecordRaw],
    concat: /* repeated */ js.Array[RouteRecordRaw] => js.Array[RouteRecordRaw],
    copyWithin: (Double, Double) => ReadonlyArrayRouteRecordR,
    entries: () => IterableIterator[js.Tuple2[Double, RouteRecordRaw]],
    every: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ] => /* is std.Array<S> */ Boolean,
    fill: RouteRecordRaw => ReadonlyArrayRouteRecordR,
    filter: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ] => js.Array[Any],
    find: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* obj */ js.Array[RouteRecordRaw], 
      /* is S */ Boolean
    ] => js.UndefOr[Any],
    findIndex: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* obj */ js.Array[RouteRecordRaw], 
      Any
    ] => Double,
    flat: () => js.Array[FlatArray[Any, Any]],
    flatMap: js.ThisFunction3[
      Any, 
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Any | js.Array[Any]
    ] => js.Array[Any],
    forEach: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Unit
    ] => Unit,
    includes: RouteRecordRaw => Boolean,
    indexOf: RouteRecordRaw => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: RouteRecordRaw => Double,
    length: Double,
    map: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Any
    ] => js.Array[Any],
    pop: () => js.UndefOr[RouteRecordRaw],
    push: /* repeated */ RouteRecordRaw => Double,
    reduce: js.Function4[
      /* previousValue */ RouteRecordRaw, 
      /* currentValue */ RouteRecordRaw, 
      /* currentIndex */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      RouteRecordRaw
    ] => RouteRecordRaw,
    reduceRight: js.Function4[
      /* previousValue */ RouteRecordRaw, 
      /* currentValue */ RouteRecordRaw, 
      /* currentIndex */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      RouteRecordRaw
    ] => RouteRecordRaw,
    reverse: () => js.Array[RouteRecordRaw],
    shift: () => js.UndefOr[RouteRecordRaw],
    slice: () => js.Array[RouteRecordRaw],
    some: js.Function3[
      /* value */ RouteRecordRaw, 
      /* index */ Double, 
      /* array */ js.Array[RouteRecordRaw], 
      Any
    ] => Boolean,
    sort: () => ReadonlyArrayRouteRecordR,
    splice: Double => js.Array[RouteRecordRaw],
    unshift: /* repeated */ RouteRecordRaw => Double,
    values: () => IterableIterator[RouteRecordRaw]
  ): ReadonlyArrayRouteRecordR = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = js.Any.fromFunction0(flat), flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyArrayRouteRecordR]
  }
  
  extension [Self <: ReadonlyArrayRouteRecordR](x: Self) {
    
    inline def setAt(value: Double => js.UndefOr[RouteRecordRaw]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setConcat(value: /* repeated */ js.Array[RouteRecordRaw] => js.Array[RouteRecordRaw]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCopyWithin(value: (Double, Double) => ReadonlyArrayRouteRecordR): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, RouteRecordRaw]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEvery(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => /* is std.Array<S> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(value: RouteRecordRaw => ReadonlyArrayRouteRecordR): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => js.Array[Any]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => js.UndefOr[Any]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          Any
        ] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFlat(value: () => js.Array[FlatArray[Any, Any]]): Self = StObject.set(x, "flat", js.Any.fromFunction0(value))
    
    inline def setFlatMap(
      value: js.ThisFunction3[
          Any, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setForEach(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIncludes(value: RouteRecordRaw => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: RouteRecordRaw => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setLastIndexOf(value: RouteRecordRaw => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any
        ] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPop(value: () => js.UndefOr[RouteRecordRaw]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(value: /* repeated */ RouteRecordRaw => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ] => RouteRecordRaw
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ] => RouteRecordRaw
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(value: () => js.Array[RouteRecordRaw]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setShift(value: () => js.UndefOr[RouteRecordRaw]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setSlice(value: () => js.Array[RouteRecordRaw]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSome(
      value: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any
        ] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(value: () => ReadonlyArrayRouteRecordR): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSplice(value: Double => js.Array[RouteRecordRaw]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setUnshift(value: /* repeated */ RouteRecordRaw => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setValues(value: () => IterableIterator[RouteRecordRaw]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
