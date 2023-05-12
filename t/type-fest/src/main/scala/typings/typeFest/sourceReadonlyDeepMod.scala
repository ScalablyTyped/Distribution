package typings.typeFest

import typings.std.IterableIterator
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReadonlyDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.BuiltIns ? T : T extends (arguments : ...any): unknown ? {} extends type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> ? T : type-fest.type-fest/source/internal.HasMultipleCallSignatures<T> extends true ? T : (arguments : std.Parameters<T>): std.ReturnType<T> & type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> : T extends / * Inlined std.Readonly<std.ReadonlyMap<infer KeyType, infer ValueType>> * /
  {readonly entries (): std.IterableIterator<[infer KeyType, infer ValueType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer KeyType>, readonly forEach (callbackfn : (value : infer ValueType, key : infer KeyType, map : std.ReadonlyMap<infer KeyType, infer ValueType>): void): void, readonly has (key : infer KeyType): boolean, readonly values (): std.IterableIterator<infer ValueType>, readonly get (key : infer KeyType): infer ValueType | undefined} ? type-fest.type-fest/source/readonly-deep.ReadonlyMapDeep<KeyType, ValueType> : T extends / * Inlined std.Readonly<std.ReadonlySet<infer ItemType>> * /
  {readonly entries (): std.IterableIterator<[infer ItemType, infer ItemType]>,  readonly size :number, readonly keys (): std.IterableIterator<infer ItemType>, readonly forEach (callbackfn : (value : infer ItemType, value2 : infer ItemType, set : std.ReadonlySet<infer ItemType>): void): void, readonly has (value : infer ItemType): boolean, readonly values (): std.IterableIterator<infer ItemType>} ? type-fest.type-fest/source/readonly-deep.ReadonlySetDeep<ItemType> : T extends object ? type-fest.type-fest/source/readonly-deep.ReadonlyObjectDeep<T> : unknown
    }}}
    */
  type ReadonlyDeep[T] = T
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /* Inlined {} & std.Readonly<std.ReadonlyMap<type-fest.type-fest/source/readonly-deep.ReadonlyDeep<KeyType>, type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ValueType>>> */
  trait ReadonlyMapDeep[KeyType, ValueType] extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ ReadonlyDeep[ValueType], 
          /* key */ ReadonlyDeep[KeyType], 
          /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
          Unit
        ]
    ): Unit
    
    def get(key: ReadonlyDeep[KeyType]): js.UndefOr[ReadonlyDeep[ValueType]]
    
    def has(key: ReadonlyDeep[KeyType]): Boolean
    
    def keys(): IterableIterator[ReadonlyDeep[KeyType]]
    
    val size: Double
    
    def values(): IterableIterator[ReadonlyDeep[ValueType]]
  }
  object ReadonlyMapDeep {
    
    inline def apply[KeyType, ValueType](
      entries: () => IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]],
      forEach: js.Function3[
          /* value */ ReadonlyDeep[ValueType], 
          /* key */ ReadonlyDeep[KeyType], 
          /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
          Unit
        ] => Unit,
      get: ReadonlyDeep[KeyType] => js.UndefOr[ReadonlyDeep[ValueType]],
      has: ReadonlyDeep[KeyType] => Boolean,
      keys: () => IterableIterator[ReadonlyDeep[KeyType]],
      size: Double,
      values: () => IterableIterator[ReadonlyDeep[ValueType]]
    ): ReadonlyMapDeep[KeyType, ValueType] = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlyMapDeep[KeyType, ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyMapDeep[?, ?], KeyType, ValueType] (val x: Self & (ReadonlyMapDeep[KeyType, ValueType])) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ ReadonlyDeep[ValueType], 
              /* key */ ReadonlyDeep[KeyType], 
              /* map */ ReadonlyMap[ReadonlyDeep[KeyType], ReadonlyDeep[ValueType]], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: ReadonlyDeep[KeyType] => js.UndefOr[ReadonlyDeep[ValueType]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: ReadonlyDeep[KeyType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[ReadonlyDeep[KeyType]]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[ReadonlyDeep[ValueType]]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  /**
  Same as `ReadonlyDeep`, but accepts only `object`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ KeyType in keyof ObjectType ]: type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ObjectType[KeyType]>}
    }}}
    */
  @js.native
  trait ReadonlyObjectDeep[ObjectType /* <: js.Object */] extends StObject
  
  /**
  Same as `ReadonlyDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `ReadonlyDeep`.
  */
  /* Inlined {} & std.Readonly<std.ReadonlySet<type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ItemType>>> */
  trait ReadonlySetDeep[ItemType] extends StObject {
    
    def entries(): IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ ReadonlyDeep[ItemType], 
          /* value2 */ ReadonlyDeep[ItemType], 
          /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
          Unit
        ]
    ): Unit
    
    def has(value: ReadonlyDeep[ItemType]): Boolean
    
    def keys(): IterableIterator[ReadonlyDeep[ItemType]]
    
    val size: Double
    
    def values(): IterableIterator[ReadonlyDeep[ItemType]]
  }
  object ReadonlySetDeep {
    
    inline def apply[ItemType](
      entries: () => IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]],
      forEach: js.Function3[
          /* value */ ReadonlyDeep[ItemType], 
          /* value2 */ ReadonlyDeep[ItemType], 
          /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
          Unit
        ] => Unit,
      has: ReadonlyDeep[ItemType] => Boolean,
      keys: () => IterableIterator[ReadonlyDeep[ItemType]],
      size: Double,
      values: () => IterableIterator[ReadonlyDeep[ItemType]]
    ): ReadonlySetDeep[ItemType] = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[ReadonlySetDeep[ItemType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlySetDeep[?], ItemType] (val x: Self & ReadonlySetDeep[ItemType]) extends AnyVal {
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[ReadonlyDeep[ItemType], ReadonlyDeep[ItemType]]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ ReadonlyDeep[ItemType], 
              /* value2 */ ReadonlyDeep[ItemType], 
              /* set */ ReadonlySet[ReadonlyDeep[ItemType]], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHas(value: ReadonlyDeep[ItemType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[ReadonlyDeep[ItemType]]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[ReadonlyDeep[ItemType]]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
