package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.IterableIterator
import typings.std.Parameters
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyDeepMod {
  
  /**
  Test if the given function has multiple call signatures.
  Needed to handle the case of a single call signature with properties.
  Multiple call signatures cannot currently be supported due to a TypeScript limitation.
  @see https://github.com/microsoft/TypeScript/issues/29732
  */
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestBooleans.`false`
    - typings.typeFest.typeFestBooleans.`true`
  */
  trait HasMultipleCallSignatures[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
  
  type ReadonlyDeep[T] = Any | ReadonlyObjectDeep[T] | ReadonlySetDeep[Any] | (ReadonlyMapDeep[Any, Any]) | ((js.Function1[/* arguments */ Parameters[T], ReturnType[T]]) & ReadonlyObjectDeep[T]) | T
  
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
    
    extension [Self <: ReadonlyMapDeep[?, ?], KeyType, ValueType](x: Self & (ReadonlyMapDeep[KeyType, ValueType])) {
      
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
  type ReadonlyObjectDeep[ObjectType /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ KeyType in keyof ObjectType ]: type-fest.type-fest/source/readonly-deep.ReadonlyDeep<ObjectType[KeyType]>}
    */ typings.typeFest.typeFestStrings.ReadonlyObjectDeep & TopLevel[ObjectType]
  
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
    
    extension [Self <: ReadonlySetDeep[?], ItemType](x: Self & ReadonlySetDeep[ItemType]) {
      
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
