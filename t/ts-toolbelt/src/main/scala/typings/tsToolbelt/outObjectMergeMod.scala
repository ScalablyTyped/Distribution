package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectMergeMod {
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? L1 extends unknown ? {  0 :0,   1 :1}[ts-toolbelt.ts-toolbelt/out/Union/Has.Has<ts-toolbelt.ts-toolbelt/out/List/RequiredKeys.RequiredKeys<L>, ts-toolbelt.ts-toolbelt/out/List/RequiredKeys.RequiredKeys<L1>>] : never : never
    }}}
    */
  @js.native
  trait Longer[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  type Merge[O /* <: js.Object */, O1 /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepMergeDeep<O, O1, ignore, fill>[depth] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? O1 extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<O, O1, ignore, fill, 'x', 'y'> : never : never
    }}}
    */
  @js.native
  trait MergeDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [OK] extends [never] ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : [O1K] extends [never] ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : OK extends ignore ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : O1K extends ignore ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : OK extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? O1K extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepList<OK, O1K, ignore, fill> : ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : OK extends object ? O1K extends object ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepObject<OK, O1K, ignore, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<OK>> : ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K> : ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<OK, O1K, fill, OOKeys, K>
    }}}
    */
  @js.native
  trait MergeDeepChoice[OK, O1K, ignore /* <: js.Object */, fill, OOKeys /* <: Key */, K /* <: Key */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<L | L1> ? std.Array<ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<L[number], L1[number], ignore, fill, never, any>> : ts-toolbelt.ts-toolbelt/out/Object/Merge.Longer<L, L1> extends 1 ? {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, ignore, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<L>, K>} : {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], ignore, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<L>, K>}
    }}}
    */
  @js.native
  trait MergeDeepList[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/_Internal.Anyfy<O> & O1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, ignore, fill, OOKeys, K>}
    }}}
    */
  @js.native
  trait MergeDeepObject[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill, OOKeys /* <: Key */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? O1 extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeFlatChoice<O, O1, ignore, fill> : never : never
    }}}
    */
  @js.native
  trait MergeFlat[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends ignore ? O : O1 extends ignore ? O : O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? O1 extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeFlatList<O, O1, ignore, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<O>> : ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeFlatObject<O, O1, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<O>> : ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeFlatObject<O, O1, fill, ts-toolbelt.ts-toolbelt/out/Object/OptionalKeys._OptionalKeys<O>>
    }}}
    */
  @js.native
  trait MergeFlatChoice[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<L | L1> ? std.Array<ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeFlatChoice<L[number], L1[number], ignore, fill>> : ts-toolbelt.ts-toolbelt/out/Object/Merge.Longer<L, L1> extends 1 ? {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, fill, LOK, K>} : {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], fill, LOK, K>}
    }}}
    */
  @js.native
  trait MergeFlatList[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, ignore /* <: js.Object */, fill, LOK /* <: Key */] extends StObject
  
  /**
    * @hidden
    */
  type MergeFlatObject[O /* <: js.Object */, O1 /* <: js.Object */, fill, OOKeys /* <: Key */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/_Internal.Anyfy<O> & O1 ]: ts-toolbelt.ts-toolbelt/out/Object/Merge.MergeProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, fill, OOKeys, K>} */ js.Any) & js.Object
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends OOKeys ? ts-toolbelt.ts-toolbelt/out/Union/Exclude.Exclude<OK, undefined> | O1K : [OK] extends [never] ? O1K : OK extends fill ? O1K : OK
    }}}
    */
  @js.native
  trait MergeProp[OK, O1K, fill, OOKeys /* <: Key */, K /* <: Key */] extends StObject
}
