package typings.typescriptTuple

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTuple
import typings.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typings.typescriptTuple.typescriptTupleStrings.`Cannot reverse an infinite tuple`
import typings.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CODENAME extends StObject {
    
    var CODENAME: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite
    
    var ERROR: `TupleSet is not finite`
  }
  object CODENAME {
    
    inline def apply(CODENAME: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite): CODENAME = {
      val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = "TupleSet is not finite")
      __obj.asInstanceOf[CODENAME]
    }
    
    extension [Self <: CODENAME](x: Self) {
      
      inline def setCODENAME(value: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `TupleSet is not finite`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    }
  }
  
  trait ERROR extends StObject {
    
    var CODENAME: InfiniteTuple
    
    var ERROR: `Cannot reverse an infinite tuple`
  }
  object ERROR {
    
    inline def apply(): ERROR = {
      val __obj = js.Dynamic.literal(CODENAME = "InfiniteTuple", ERROR = "Cannot reverse an infinite tuple")
      __obj.asInstanceOf[ERROR]
    }
    
    extension [Self <: ERROR](x: Self) {
      
      inline def setCODENAME(value: InfiniteTuple): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `Cannot reverse an infinite tuple`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    }
  }
  
  trait Empty[TupleSet /* <: js.Array[js.Array[Any]] */] extends StObject {
    
    var empty: js.Array[Any]
    
    var infinite: CODENAME
    
    var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: (_ : typescript-tuple.typescript-tuple/lib/utils.Reverse<TupleSet, []>): any extends (_ : infer Last, _1 : infer ReversedRest): any ? Last extends std.Array<any> ? ReversedRest extends std.Array<std.Array<any>> ? typescript-tuple.typescript-tuple/lib/utils.Concat<typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>>, Last> : never : never : never */ js.Any
  }
  object Empty {
    
    inline def apply[TupleSet /* <: js.Array[js.Array[Any]] */](
      empty: js.Array[Any],
      infinite: CODENAME,
      nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: (_ : typescript-tuple.typescript-tuple/lib/utils.Reverse<TupleSet, []>): any extends (_ : infer Last, _1 : infer ReversedRest): any ? Last extends std.Array<any> ? ReversedRest extends std.Array<std.Array<any>> ? typescript-tuple.typescript-tuple/lib/utils.Concat<typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>>, Last> : never : never : never */ js.Any
    ): Empty[TupleSet] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty[TupleSet]]
    }
    
    extension [Self <: Empty[?], TupleSet /* <: js.Array[js.Array[Any]] */](x: Self & Empty[TupleSet]) {
      
      inline def setEmpty(value: js.Array[Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyVarargs(value: Any*): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setInfinite(value: CODENAME): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (_ : typescript-tuple.typescript-tuple/lib/utils.Reverse<TupleSet, []>): any extends (_ : infer Last, _1 : infer ReversedRest): any ? Last extends std.Array<any> ? ReversedRest extends std.Array<std.Array<any>> ? typescript-tuple.typescript-tuple/lib/utils.Concat<typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>>, Last> : never : never : never */ js.Any
      ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmptyInfinite[Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */] extends StObject {
    
    var empty: Prefix
    
    var infinite: ERROR
    
    var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [infer First, ...infer Next] ? typescript-tuple.typescript-tuple/lib/utils.Reverse<Next, typescript-tuple.typescript-tuple/lib/utils.Prepend<Prefix, First>> : never */ js.Any
  }
  object EmptyInfinite {
    
    inline def apply[Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */](
      empty: Prefix,
      infinite: ERROR,
      nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [infer First, ...infer Next] ? typescript-tuple.typescript-tuple/lib/utils.Reverse<Next, typescript-tuple.typescript-tuple/lib/utils.Prepend<Prefix, First>> : never */ js.Any
    ): EmptyInfinite[Prefix, Tuple] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyInfinite[Prefix, Tuple]]
    }
    
    extension [Self <: EmptyInfinite[?, ?], Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */](x: Self & (EmptyInfinite[Prefix, Tuple])) {
      
      inline def setEmpty(value: Prefix): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setInfinite(value: ERROR): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [infer First, ...infer Next] ? typescript-tuple.typescript-tuple/lib/utils.Reverse<Next, typescript-tuple.typescript-tuple/lib/utils.Prepend<Prefix, First>> : never */ js.Any
      ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
  
  trait Equal[WhenEqual, Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] extends StObject {
    
    var equal: WhenEqual
    
    var shorterLeft: js.Tuple2[Left, Right]
    
    var shorterRight: js.Tuple2[Right, Left]
  }
  object Equal {
    
    inline def apply[WhenEqual, Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): Equal[WhenEqual, Left, Right] = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Equal[WhenEqual, Left, Right]]
    }
    
    extension [Self <: Equal[?, ?, ?], WhenEqual, Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */](x: Self & (Equal[WhenEqual, Left, Right])) {
      
      inline def setEqual(value: WhenEqual): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
      
      inline def setShorterLeft(value: js.Tuple2[Left, Right]): Self = StObject.set(x, "shorterLeft", value.asInstanceOf[js.Any])
      
      inline def setShorterRight(value: js.Tuple2[Right, Left]): Self = StObject.set(x, "shorterRight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Infinite[Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement] extends StObject {
    
    var empty: Holder
    
    var infinite: js.Array[Replacement]
    
    var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [any, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils.FillTuple<Rest, Replacement, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Replacement>> : never */ js.Any
  }
  object Infinite {
    
    inline def apply[Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement](
      empty: Holder,
      infinite: js.Array[Replacement],
      nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [any, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils.FillTuple<Rest, Replacement, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Replacement>> : never */ js.Any
    ): Infinite[Holder, Tuple, Replacement] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Infinite[Holder, Tuple, Replacement]]
    }
    
    extension [Self <: Infinite[?, ?, ?], Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement](x: Self & (Infinite[Holder, Tuple, Replacement])) {
      
      inline def setEmpty(value: Holder): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setInfinite(value: js.Array[Replacement]): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteVarargs(value: Replacement*): Self = StObject.set(x, "infinite", js.Array(value*))
      
      inline def setNonEmpty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Tuple extends [any, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils.FillTuple<Rest, Replacement, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Replacement>> : never */ js.Any
      ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
  
  trait NonEmpty[Longest, TupleSet /* <: js.Array[js.Array[Any]] */] extends StObject {
    
    var empty: Longest
    
    var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: (_ : TupleSet): any extends (_ : infer Head, _1 : infer Tail): any ? Tail extends std.Array<any> ? Longest extends std.Array<any> ? Head extends std.Array<any> ? Tail extends std.Array<Head> ? typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1] : typescript-tuple.typescript-tuple/lib/utils.LongestTuple<Tail, typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1]> : never : never : never : never */ js.Any
  }
  object NonEmpty {
    
    inline def apply[Longest, TupleSet /* <: js.Array[js.Array[Any]] */](
      empty: Longest,
      nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: (_ : TupleSet): any extends (_ : infer Head, _1 : infer Tail): any ? Tail extends std.Array<any> ? Longest extends std.Array<any> ? Head extends std.Array<any> ? Tail extends std.Array<Head> ? typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1] : typescript-tuple.typescript-tuple/lib/utils.LongestTuple<Tail, typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1]> : never : never : never : never */ js.Any
    ): NonEmpty[Longest, TupleSet] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonEmpty[Longest, TupleSet]]
    }
    
    extension [Self <: NonEmpty[?, ?], Longest, TupleSet /* <: js.Array[js.Array[Any]] */](x: Self & (NonEmpty[Longest, TupleSet])) {
      
      inline def setEmpty(value: Longest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (_ : TupleSet): any extends (_ : infer Head, _1 : infer Tail): any ? Tail extends std.Array<any> ? Longest extends std.Array<any> ? Head extends std.Array<any> ? Tail extends std.Array<Head> ? typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1] : typescript-tuple.typescript-tuple/lib/utils.LongestTuple<Tail, typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, Head, [Longest, Head]>[1]> : never : never : never : never */ js.Any
      ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
}
