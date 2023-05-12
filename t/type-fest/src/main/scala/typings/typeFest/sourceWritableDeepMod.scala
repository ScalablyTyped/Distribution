package typings.typeFest

import typings.std.Map
import typings.std.Set
import typings.typeFest.sourceWritableMod.Writable
import typings.typeFest.typeFestStrings.add
import typings.typeFest.typeFestStrings.clear
import typings.typeFest.typeFestStrings.delete
import typings.typeFest.typeFestStrings.entries
import typings.typeFest.typeFestStrings.forEach
import typings.typeFest.typeFestStrings.get
import typings.typeFest.typeFestStrings.has
import typings.typeFest.typeFestStrings.keys
import typings.typeFest.typeFestStrings.set
import typings.typeFest.typeFestStrings.size
import typings.typeFest.typeFestStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWritableDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.BuiltIns ? T : T extends (arguments : ...any): unknown ? {} extends type-fest.type-fest/source/writable-deep.WritableObjectDeep<T> ? T : type-fest.type-fest/source/internal.HasMultipleCallSignatures<T> extends true ? T : (arguments : std.Parameters<T>): std.ReturnType<T> & type-fest.type-fest/source/writable-deep.WritableObjectDeep<T> : T extends / * Inlined std.Readonly<std.ReadonlyMap<infer KeyType, infer ValueType>> * /
  {readonly entries (): std.IterableIterator<[infer KeyType, infer ValueType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer KeyType>, readonly forEach (callbackfn : (value : infer ValueType, key : infer KeyType, map : std.ReadonlyMap<infer KeyType, infer ValueType>): void): void, readonly has (key : infer KeyType): boolean, readonly values (): std.IterableIterator<infer ValueType>, readonly get (key : infer KeyType): infer ValueType | undefined} ? type-fest.type-fest/source/writable-deep.WritableMapDeep<KeyType, ValueType> : T extends / * Inlined std.Readonly<std.ReadonlySet<infer ItemType>> * /
  {readonly entries (): std.IterableIterator<[infer ItemType, infer ItemType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer ItemType>, readonly forEach (callbackfn : (value : infer ItemType, value2 : infer ItemType, set : std.ReadonlySet<infer ItemType>): void): void, readonly has (value : infer ItemType): boolean, readonly values (): std.IterableIterator<infer ItemType>} ? type-fest.type-fest/source/writable-deep.WritableSetDeep<ItemType> : T extends object ? type-fest.type-fest/source/writable-deep.WritableObjectDeep<T> : unknown
    }}}
    */
  type WritableDeep[T] = T
  
  /**
  Same as `WritableDeep`, but accepts only `Map`s as inputs. Internal helper for `WritableDeep`.
  */
  type WritableMapDeep[KeyType, ValueType] = Writable[
    Map[WritableDeep[KeyType], WritableDeep[ValueType]], 
    /* keyof std.Map<type-fest.type-fest/source/writable-deep.WritableDeep<KeyType>, type-fest.type-fest/source/writable-deep.WritableDeep<ValueType>> */ clear | delete | forEach | get | has | set | size | entries | keys | values
  ]
  
  /**
  Same as `WritableDeep`, but accepts only `object`s as inputs. Internal helper for `WritableDeep`.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {-readonly [ KeyType in keyof ObjectType ]: type-fest.type-fest/source/writable-deep.WritableDeep<ObjectType[KeyType]>}
    }}}
    */
  @js.native
  trait WritableObjectDeep[ObjectType /* <: js.Object */] extends StObject
  
  /**
  Same as `WritableDeep`, but accepts only `Set`s as inputs. Internal helper for `WritableDeep`.
  */
  type WritableSetDeep[ItemType] = Writable[
    Set[WritableDeep[ItemType]], 
    /* keyof std.Set<type-fest.type-fest/source/writable-deep.WritableDeep<ItemType>> */ add | clear | delete | forEach | has | size | entries | keys | values
  ]
}
