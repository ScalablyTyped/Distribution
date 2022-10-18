package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPatchMod {
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? L1 extends unknown ? {  0 :0,   1 :1}[ts-toolbelt.ts-toolbelt/out/Union/Has.Has<keyof L, keyof L1>] : never : never
    }}}
    */
  @js.native
  trait Longer[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  type Patch[O /* <: js.Object */, O1 /* <: js.Object */, depth /* <: Depth */, ignore /* <: js.Object */, fill /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepPatchDeep<O, O1, ignore, fill>[depth] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? O1 extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<O, O1, ignore, fill, 'x', 'y'> : never : never
    }}}
    */
  @js.native
  trait PatchDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [OK] extends [never] ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : [O1K] extends [never] ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : OK extends ignore ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : O1K extends ignore ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : OK extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? O1K extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepList<OK, O1K, ignore, fill> : ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : OK extends object ? O1K extends object ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepObject<OK, O1K, ignore, fill, keyof OK> : ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K> : ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<OK, O1K, fill, OKeys, K>
    }}}
    */
  @js.native
  trait PatchDeepChoice[OK, O1K, ignore /* <: js.Object */, fill, OKeys /* <: Key */, K /* <: Key */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<L | L1> ? std.Array<ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<L[number], L1[number], ignore, fill, never, any>> : ts-toolbelt.ts-toolbelt/out/Object/Patch.Longer<L, L1> extends 1 ? {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, ignore, fill, keyof L, K>} : {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], ignore, fill, keyof L, K>}
    }}}
    */
  @js.native
  trait PatchDeepList[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O & ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O1, OKeys> ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchDeepChoice<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, ignore, fill, OKeys, K>}
    }}}
    */
  @js.native
  trait PatchDeepObject[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill, OKeys /* <: Key */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? O1 extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<O, O1, ignore, fill> : never : never
    }}}
    */
  @js.native
  trait PatchFlat[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends ignore ? O : O1 extends ignore ? O : O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? O1 extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatList<O, O1, ignore, fill> : ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatObject<O, O1, fill, keyof O> : ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatObject<O, O1, fill, keyof O>
    }}}
    */
  @js.native
  trait PatchFlatChoice[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<L | L1> ? std.Array<ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchFlatChoice<L[number], L1[number], ignore, fill>> : ts-toolbelt.ts-toolbelt/out/Object/Patch.Longer<L, L1> extends 1 ? {[ K in keyof L ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<L[K], ts-toolbelt.ts-toolbelt/out/Any/At.At<L1, K>, fill, keyof L, K>} : {[ K in keyof L1 ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<L, K>, L1[K], fill, keyof L, K>}
    }}}
    */
  @js.native
  trait PatchFlatList[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, ignore /* <: js.Object */, fill] extends StObject
  
  /**
    * @hidden
    */
  type PatchFlatObject[O /* <: js.Object */, O1 /* <: js.Object */, fill, OKeys /* <: Key */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O & ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O1, OKeys> ]: ts-toolbelt.ts-toolbelt/out/Object/Patch.PatchProp<ts-toolbelt.ts-toolbelt/out/Any/At.At<O, K>, ts-toolbelt.ts-toolbelt/out/Any/At.At<O1, K>, fill, OKeys, K>} */ js.Any) & js.Object
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends OKeys ? OK extends fill ? O1K : OK : O1K
    }}}
    */
  @js.native
  trait PatchProp[OK, O1K, fill, OKeys /* <: Key */, K /* <: Key */] extends StObject
}
