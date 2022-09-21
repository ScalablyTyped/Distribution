package typings.typescriptTuple

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTuple
import typings.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typings.typescriptTuple.typescriptTupleStrings.`Cannot reverse an infinite tuple`
import typings.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import typings.typescriptTuple.utilsMod.Concat
import typings.typescriptTuple.utilsMod.ConcatMultiple
import typings.typescriptTuple.utilsMod.FillTuple
import typings.typescriptTuple.utilsMod.LongestTuple
import typings.typescriptTuple.utilsMod.Prepend
import typings.typescriptTuple.utilsMod.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CODENAME extends StObject {
    
    var CODENAME: InfiniteTuple
    
    var ERROR: `Cannot reverse an infinite tuple`
  }
  object CODENAME {
    
    inline def apply(): CODENAME = {
      val __obj = js.Dynamic.literal(CODENAME = "InfiniteTuple", ERROR = "Cannot reverse an infinite tuple")
      __obj.asInstanceOf[CODENAME]
    }
    
    extension [Self <: CODENAME](x: Self) {
      
      inline def setCODENAME(value: InfiniteTuple): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `Cannot reverse an infinite tuple`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    }
  }
  
  trait ERROR extends StObject {
    
    var CODENAME: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite
    
    var ERROR: `TupleSet is not finite`
  }
  object ERROR {
    
    inline def apply(CODENAME: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite): ERROR = {
      val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = "TupleSet is not finite")
      __obj.asInstanceOf[ERROR]
    }
    
    extension [Self <: ERROR](x: Self) {
      
      inline def setCODENAME(value: InfiniteTupleSet & typings.typescriptTuple.typescriptTupleStrings.Infinite): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `TupleSet is not finite`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    }
  }
  
  trait Empty[Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */] extends StObject {
    
    var empty: Prefix
    
    var infinite: CODENAME
    
    var nonEmpty: Reverse[Any, Prepend[Prefix, Any]]
  }
  object Empty {
    
    inline def apply[Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */](empty: Prefix, infinite: CODENAME, nonEmpty: Reverse[Any, Prepend[Prefix, Any]]): Empty[Prefix, Tuple] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty[Prefix, Tuple]]
    }
    
    extension [Self <: Empty[?, ?], Prefix /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */](x: Self & (Empty[Prefix, Tuple])) {
      
      inline def setEmpty(value: Prefix): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setInfinite(value: CODENAME): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(value: Reverse[Any, Prepend[Prefix, Any]]): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmptyNonEmpty[Longest, TupleSet /* <: js.Array[js.Array[Any]] */] extends StObject {
    
    var empty: Longest
    
    var nonEmpty: (LongestTuple[
        Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any)
  }
  object EmptyNonEmpty {
    
    inline def apply[Longest, TupleSet /* <: js.Array[js.Array[Any]] */](
      empty: Longest,
      nonEmpty: (LongestTuple[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any)
    ): EmptyNonEmpty[Longest, TupleSet] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyNonEmpty[Longest, TupleSet]]
    }
    
    extension [Self <: EmptyNonEmpty[?, ?], Longest, TupleSet /* <: js.Array[js.Array[Any]] */](x: Self & (EmptyNonEmpty[Longest, TupleSet])) {
      
      inline def setEmpty(value: Longest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(
        value: (LongestTuple[
              Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
            ]) | (/* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any)
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
  
  trait Infinite[TupleSet /* <: js.Array[js.Array[Any]] */] extends StObject {
    
    var empty: js.Array[Any]
    
    var infinite: ERROR
    
    var nonEmpty: Concat[ConcatMultiple[Reverse[Any, js.Array[Any]]], Any]
  }
  object Infinite {
    
    inline def apply[TupleSet /* <: js.Array[js.Array[Any]] */](
      empty: js.Array[Any],
      infinite: ERROR,
      nonEmpty: Concat[ConcatMultiple[Reverse[Any, js.Array[Any]]], Any]
    ): Infinite[TupleSet] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Infinite[TupleSet]]
    }
    
    extension [Self <: Infinite[?], TupleSet /* <: js.Array[js.Array[Any]] */](x: Self & Infinite[TupleSet]) {
      
      inline def setEmpty(value: js.Array[Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyVarargs(value: Any*): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setInfinite(value: ERROR): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setNonEmpty(value: Concat[ConcatMultiple[Reverse[Any, js.Array[Any]]], Any]): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
      
      inline def setNonEmptyVarargs(value: (ConcatMultiple[Reverse[Any, js.Array[Any]]])*): Self = StObject.set(x, "nonEmpty", js.Array(value*))
    }
  }
  
  trait NonEmpty[Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement] extends StObject {
    
    var empty: Holder
    
    var infinite: js.Array[Replacement]
    
    var nonEmpty: FillTuple[Any, Replacement, Prepend[Holder, Replacement]]
  }
  object NonEmpty {
    
    inline def apply[Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement](
      empty: Holder,
      infinite: js.Array[Replacement],
      nonEmpty: FillTuple[Any, Replacement, Prepend[Holder, Replacement]]
    ): NonEmpty[Holder, Tuple, Replacement] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonEmpty[Holder, Tuple, Replacement]]
    }
    
    extension [Self <: NonEmpty[?, ?, ?], Holder /* <: js.Array[Any] */, Tuple /* <: js.Array[Any] */, Replacement](x: Self & (NonEmpty[Holder, Tuple, Replacement])) {
      
      inline def setEmpty(value: Holder): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setInfinite(value: js.Array[Replacement]): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteVarargs(value: Replacement*): Self = StObject.set(x, "infinite", js.Array(value*))
      
      inline def setNonEmpty(value: FillTuple[Any, Replacement, Prepend[Holder, Replacement]]): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    }
  }
}
