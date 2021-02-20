package typings.wouter.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import typings.wouter.wouterNumbers.`1`
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Array<wouter.wouter.Path>> */
@js.native
trait ReadonlyArrayPathConcat extends StObject {
  
  val concat: js.Function1[/* repeated */ js.Array[Path], js.Array[Path]] = js.native
  
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type] = js.native
  
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, Path]]] = js.native
  
  val every: js.Function1[
    /* predicate */ js.Function3[
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ], 
    /* is std.Array<wouter.wouter/use-location.Path> */ Boolean
  ] = js.native
  
  val fill: js.Function1[/* value */ Path, this.type] = js.native
  
  val filter: js.Function1[
    /* predicate */ js.Function3[
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ], 
    js.Array[Path]
  ] = js.native
  
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ], 
    js.UndefOr[Path]
  ] = js.native
  
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _], 
    Double
  ] = js.native
  
  val flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]] = js.native
  
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ] = js.native
  
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit], 
    Unit
  ] = js.native
  
  val includes: js.Function1[/* searchElement */ Path, Boolean] = js.native
  
  val indexOf: js.Function1[/* searchElement */ Path, Double] = js.native
  
  val join: js.Function0[String] = js.native
  
  val keys: js.Function0[IterableIterator[Double]] = js.native
  
  val lastIndexOf: js.Function1[/* searchElement */ Path, Double] = js.native
  
  val length: Double = js.native
  
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _], 
    js.Array[_]
  ] = js.native
  
  val pop: js.Function0[js.UndefOr[Path]] = js.native
  
  val push: js.Function1[/* repeated */ Path, Double] = js.native
  
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ], 
    Path
  ] = js.native
  
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ], 
    Path
  ] = js.native
  
  val reverse: js.Function0[js.Array[Path]] = js.native
  
  val shift: js.Function0[js.UndefOr[Path]] = js.native
  
  val slice: js.Function0[js.Array[Path]] = js.native
  
  val some: js.Function1[
    /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _], 
    Boolean
  ] = js.native
  
  val sort: js.Function0[this.type] = js.native
  
  val splice: js.Function1[/* start */ Double, js.Array[Path]] = js.native
  
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayPathConcat: js.Function0[String] = js.native
  
  @JSName("toString")
  val toString_FReadonlyArrayPathConcat: js.Function0[String] = js.native
  
  val unshift: js.Function1[/* repeated */ Path, Double] = js.native
  
  val values: js.Function0[IterableIterator[Path]] = js.native
}
object ReadonlyArrayPathConcat {
  
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[Path] => js.Array[Path],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArrayPathConcat,
    entries: () => IterableIterator[js.Tuple2[Double, Path]],
    every: /* predicate */ js.Function3[
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ] => /* is std.Array<wouter.wouter/use-location.Path> */ Boolean,
    fill: /* value */ Path => ReadonlyArrayPathConcat,
    filter: /* predicate */ js.Function3[
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ] => js.Array[Path],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Path, 
      /* index */ Double, 
      /* obj */ js.Array[Path], 
      /* is wouter.wouter/use-location.Path */ Boolean
    ] => js.UndefOr[Path],
    findIndex: /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _] => Double,
    flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ Path, 
      /* index */ Double, 
      /* array */ js.Array[Path], 
      _ | js.Array[_]
    ] => js.Array[_],
    forEach: /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit] => Unit,
    includes: /* searchElement */ Path => Boolean,
    indexOf: /* searchElement */ Path => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: /* searchElement */ Path => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _] => js.Array[_],
    pop: () => js.UndefOr[Path],
    push: /* repeated */ Path => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ] => Path,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ Path, 
      /* currentValue */ Path, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Path], 
      Path
    ] => Path,
    reverse: () => js.Array[Path],
    shift: () => js.UndefOr[Path],
    slice: () => js.Array[Path],
    some: /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _] => Boolean,
    sort: () => ReadonlyArrayPathConcat,
    splice: /* start */ Double => js.Array[Path],
    toLocaleString: () => String,
    toString_ : () => String,
    unshift: /* repeated */ Path => Double,
    values: () => IterableIterator[Path]
  ): ReadonlyArrayPathConcat = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
    __obj.asInstanceOf[ReadonlyArrayPathConcat]
  }
  
  @scala.inline
  implicit class ReadonlyArrayPathConcatMutableBuilder[Self <: ReadonlyArrayPathConcat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcat(value: /* repeated */ js.Array[Path] => js.Array[Path]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyWithin(value: (/* target */ Double, /* start */ Double) => ReadonlyArrayPathConcat): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[Double, Path]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvery(
      value: /* predicate */ js.Function3[
          /* value */ Path, 
          /* index */ Double, 
          /* array */ js.Array[Path], 
          /* is wouter.wouter/use-location.Path */ Boolean
        ] => /* is std.Array<wouter.wouter/use-location.Path> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFill(value: /* value */ Path => ReadonlyArrayPathConcat): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(
      value: /* predicate */ js.Function3[
          /* value */ Path, 
          /* index */ Double, 
          /* array */ js.Array[Path], 
          /* is wouter.wouter/use-location.Path */ Boolean
        ] => js.Array[Path]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Path, 
          /* index */ Double, 
          /* obj */ js.Array[Path], 
          /* is wouter.wouter/use-location.Path */ Boolean
        ] => js.UndefOr[Path]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindIndex(
      value: /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* obj */ js.Array[Path], _] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlat(value: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, `1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ js.UndefOr[scala.Nothing], 
          /* value */ Path, 
          /* index */ Double, 
          /* array */ js.Array[Path], 
          _ | js.Array[_]
        ] => js.Array[_]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(
      value: /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], Unit] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludes(value: /* searchElement */ Path => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOf(value: /* searchElement */ Path => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastIndexOf(value: /* searchElement */ Path => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(
      value: /* callbackfn */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _] => js.Array[_]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => js.UndefOr[Path]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: /* repeated */ Path => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Path, 
          /* currentValue */ Path, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Path], 
          Path
        ] => Path
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Path, 
          /* currentValue */ Path, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Path], 
          Path
        ] => Path
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverse(value: () => js.Array[Path]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShift(value: () => js.UndefOr[Path]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlice(value: () => js.Array[Path]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSome(
      value: /* predicate */ js.Function3[/* value */ Path, /* index */ Double, /* array */ js.Array[Path], _] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: () => ReadonlyArrayPathConcat): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplice(value: /* start */ Double => js.Array[Path]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnshift(value: /* repeated */ Path => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => IterableIterator[Path]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
