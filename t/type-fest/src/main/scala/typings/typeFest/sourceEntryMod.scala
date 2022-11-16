package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceEntryMod {
  
  type ArrayEntry[BaseType /* <: js.Array[Any] */] = js.Tuple2[
    Double, 
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[number] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    BaseType extends std.Map<unknown, unknown> ? type-fest.type-fest/source/entry.MapEntry<BaseType> : BaseType extends std.Set<unknown> ? type-fest.type-fest/source/entry.SetEntry<BaseType> : BaseType extends std.Array<unknown> ? type-fest.type-fest/source/entry.ArrayEntry<BaseType> : BaseType extends object ? type-fest.type-fest/source/entry.ObjectEntry<BaseType> : never
    }}}
    */
  type Entry[BaseType] = MapEntry[BaseType]
  
  type MapEntry[BaseType] = js.Tuple2[MapKey[BaseType], MapValue[BaseType]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    BaseType extends std.Map<infer KeyType, unknown> ? KeyType : never
    }}}
    */
  @js.native
  trait MapKey[BaseType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    BaseType extends std.Map<unknown, infer ValueType> ? ValueType : never
    }}}
    */
  @js.native
  trait MapValue[BaseType] extends StObject
  
  type ObjectEntry[BaseType] = js.Tuple2[
    /* keyof BaseType */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[keyof BaseType] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    BaseType extends std.Set<infer ItemType> ? [ItemType, ItemType] : never
    }}}
    */
  @js.native
  trait SetEntry[BaseType] extends StObject
}
