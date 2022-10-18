package typings.typescriptTuple

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Left['length'] extends Right['length'] ? 'equal' : Left extends [] ? 'shorterLeft' : Right extends [] ? 'shorterRight' : typescript-tuple.typescript-tuple/lib/utils.CompareLength<typescript-tuple.typescript-tuple/lib/utils.Tail<Left>, typescript-tuple.typescript-tuple/lib/utils.Tail<Right>>
    }}}
    */
  @js.native
  trait CompareLength[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] extends StObject
  
  type Concat[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: Left */ js.Array[Left]
  
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[Any]] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Empty<TupleSet>[TupleSet extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<TupleSet, 'nonEmpty', 'infinite'>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [std.Array<any> extends Tuple ? true : false, number extends Quantity ? true : false] extends std.Array<true> ? Tuple : Tuple extends [] ? Tuple : Quantity extends Count['length'] ? Tuple : (args : Tuple): any extends (_ : any, _1 : infer Rest): any ? typescript-tuple.typescript-tuple/lib/utils.Drop<Rest, Quantity, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> : never
    }}}
    */
  @js.native
  trait Drop[Tuple /* <: js.Array[Any] */, Quantity /* <: Double */, Count /* <: js.Array[Any] */] extends StObject
  
  type FillTuple[Tuple /* <: js.Array[Any] */, Replacement, Holder /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Infinite<Holder, Tuple, Replacement>[Tuple extends [] ? 'empty' : typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'>] */ js.Any
  
  type FilterTuple[Tuple /* <: js.Array[Any] */, Mask] = ConcatMultiple[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Tuple ]: Tuple[K] extends Mask? [Tuple[K]] : []} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [any, ...std.Array<any>] ? Tuple[0] : Default
    }}}
    */
  @js.native
  trait First[Tuple /* <: js.Array[Any] */, Default] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [] ? Finite : Tuple extends std.Array<infer Element> ? std.Array<Element> extends Tuple ? Infinite : Tuple extends [any, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils.IsFinite<Rest, Finite, Infinite> : never : never
    }}}
    */
  @js.native
  trait IsFinite[Tuple /* <: js.Array[Any] */, Finite, Infinite] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [] ? Default : Tuple extends [infer SoleElement] ? SoleElement : Tuple extends std.Array<infer Element> ? std.Array<Element> extends Tuple ? Element : Tuple extends [any, ...infer Next] ? typescript-tuple.typescript-tuple/lib/utils.Last<Next, never> : Default : never
    }}}
    */
  @js.native
  trait Last[Tuple /* <: js.Array[Any] */, Default] extends StObject
  
  type LongestTuple[TupleSet /* <: js.Array[js.Array[Any]] */, Longest] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.NonEmpty<Longest, TupleSet>[TupleSet extends [] ? 'empty' : 'nonEmpty'] */ js.Any
  
  type Prepend[Tuple /* <: js.Array[Any] */, Addend] = /* import warning: importer.ImportType#apply c repeated non-array type: Tuple */ js.Array[Tuple]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Count extends never ? never : number extends Count ? std.Array<Type> : Holder['length'] extends Count ? Count extends Holder['length'] ? Holder : Count extends Holder['length'] | infer Rest ? Rest extends number ? typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> | typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Rest, []> : never : never : typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>>
    }}}
    */
  @js.native
  trait Repeat[Type, Count /* <: Double */, Holder /* <: js.Array[Any] */] extends StObject
  
  type Reverse[Tuple /* <: js.Array[Any] */, Prefix /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.EmptyInfinite<Prefix, Tuple>[Tuple extends [any, ...std.Array<any>] ? typescript-tuple.typescript-tuple/lib/utils.IsFinite<Tuple, 'nonEmpty', 'infinite'> : 'empty'] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TupleSet extends [] ? Shortest : (_ : TupleSet): any extends (_ : infer Head, _1 : infer Tail): any ? Tail extends std.Array<any> ? Head extends std.Array<any> ? Tail extends std.Array<Head> ? typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, Head, [Shortest, Head]>[0] : typescript-tuple.typescript-tuple/lib/utils.ShortestTuple<Tail, typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, Head, [Shortest, Head]>[0]> : never : never : never
    }}}
    */
  @js.native
  trait ShortestTuple[TupleSet /* <: js.Array[js.Array[Any]] */, Shortest /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [] ? typescript-tuple.typescript-tuple/lib/utils.Reverse<Holder, []> : Quantity extends Holder['length'] ? typescript-tuple.typescript-tuple/lib/utils.Reverse<Holder, []> : Start extends Count['length'] ? Tuple extends [infer First, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<Rest, Start, Quantity, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, First>, Count> : never : typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>>
    }}}
    */
  @js.native
  trait SliceStartQuantity[Tuple /* <: js.Array[Any] */, Start /* <: Double */, Quantity /* <: Double */, Holder /* <: js.Array[Any] */, Count /* <: js.Array[Any] */] extends StObject
  
  type SortTwoTuple[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */, WhenEqual] = /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Equal<WhenEqual, Left, Right>[typescript-tuple.typescript-tuple/lib/utils.CompareLength<Left, Right>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends std.Array<infer Element> ? std.Array<Element> extends Tuple ? [Tuple, Holder] : Tuple extends [infer First, ...infer Rest] ? typescript-tuple.typescript-tuple/lib/utils._SplitInfiniteTuple<Rest, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, First>> : never : never
    }}}
    */
  @js.native
  trait SplitInfiniteTuple[Tuple /* <: js.Array[Any] */, Holder /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    (args : Tuple): any extends (_ : any, _1 : infer Rest): any ? Rest : never
    }}}
    */
  @js.native
  trait Tail[Tuple /* <: js.Array[Any] */] extends StObject
}
