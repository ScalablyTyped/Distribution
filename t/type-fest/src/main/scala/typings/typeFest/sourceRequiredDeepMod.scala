package typings.typeFest

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceRequiredDeepMod {
  
  type ExcludeUndefined[T] = Exclude[T, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    E extends type-fest.type-fest/source/internal.BuiltIns ? E : E extends std.Map<infer KeyType, infer ValueType> ? std.Map<type-fest.type-fest/source/required-deep.RequiredDeep<KeyType, type-fest.type-fest/source/required-deep.ExcludeUndefined<KeyType>>, type-fest.type-fest/source/required-deep.RequiredDeep<ValueType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ValueType>>> : E extends std.Set<infer ItemType> ? std.Set<type-fest.type-fest/source/required-deep.RequiredDeep<ItemType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ItemType>>> : E extends std.ReadonlyMap<infer KeyType, infer ValueType> ? std.ReadonlyMap<type-fest.type-fest/source/required-deep.RequiredDeep<KeyType, type-fest.type-fest/source/required-deep.ExcludeUndefined<KeyType>>, type-fest.type-fest/source/required-deep.RequiredDeep<ValueType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ValueType>>> : E extends std.ReadonlySet<infer ItemType> ? std.ReadonlySet<type-fest.type-fest/source/required-deep.RequiredDeep<ItemType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ItemType>>> : E extends std.WeakMap<infer KeyType, infer ValueType> ? std.WeakMap<type-fest.type-fest/source/required-deep.RequiredDeep<KeyType, type-fest.type-fest/source/required-deep.ExcludeUndefined<KeyType>>, type-fest.type-fest/source/required-deep.RequiredDeep<ValueType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ValueType>>> : E extends std.WeakSet<infer ItemType> ? std.WeakSet<type-fest.type-fest/source/required-deep.RequiredDeep<ItemType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ItemType>>> : E extends std.Promise<infer ValueType> ? std.Promise<type-fest.type-fest/source/required-deep.RequiredDeep<ValueType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ValueType>>> : E extends (args : ...any): unknown ? {} extends type-fest.type-fest/source/required-deep.RequiredObjectDeep<E> ? E : type-fest.type-fest/source/internal.HasMultipleCallSignatures<E> extends true ? E : (arguments : std.Parameters<E>): std.ReturnType<E> & type-fest.type-fest/source/required-deep.RequiredObjectDeep<E> : E extends object ? E extends std.Array<infer ItemType> ? std.Array<ItemType> extends E ? std.Array<type-fest.type-fest/source/required-deep.RequiredDeep<ItemType, type-fest.type-fest/source/required-deep.ExcludeUndefined<ItemType>>> : type-fest.type-fest/source/required-deep.RequiredObjectDeep<E> : type-fest.type-fest/source/required-deep.RequiredObjectDeep<E> : unknown
    }}}
    */
  type RequiredDeep[T, E /* <: ExcludeUndefined[T] */] = E
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ KeyType in keyof ObjectType ]: -? type-fest.type-fest/source/required-deep.RequiredDeep<ObjectType[KeyType], type-fest.type-fest/source/required-deep.ExcludeUndefined<ObjectType[KeyType]>>}
    }}}
    */
  @js.native
  trait RequiredObjectDeep[ObjectType /* <: js.Object */] extends StObject
}
