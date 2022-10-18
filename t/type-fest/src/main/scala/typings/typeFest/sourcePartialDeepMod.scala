package typings.typeFest

import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePartialDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.BuiltIns ? T : T extends std.Map<infer KeyType, infer ValueType> ? type-fest.type-fest/source/partial-deep.PartialMapDeep<KeyType, ValueType, Options> : T extends std.Set<infer ItemType> ? type-fest.type-fest/source/partial-deep.PartialSetDeep<ItemType, Options> : T extends std.ReadonlyMap<infer KeyType, infer ValueType> ? type-fest.type-fest/source/partial-deep.PartialReadonlyMapDeep<KeyType, ValueType, Options> : T extends std.ReadonlySet<infer ItemType> ? type-fest.type-fest/source/partial-deep.PartialReadonlySetDeep<ItemType, Options> : T extends (arguments : ...any): unknown ? T | undefined : T extends object ? T extends std.ReadonlyArray<infer ItemType> ? Options['recurseIntoArrays'] extends true ? std.Array<ItemType> extends T ? std.Array<ItemType> extends T ? std.ReadonlyArray<type-fest.type-fest/source/partial-deep.PartialDeep<ItemType | undefined, Options>> : std.Array<type-fest.type-fest/source/partial-deep.PartialDeep<ItemType | undefined, Options>> : type-fest.type-fest/source/partial-deep.PartialObjectDeep<T, Options> : T : type-fest.type-fest/source/partial-deep.PartialObjectDeep<T, Options> : unknown
    }}}
    */
  @js.native
  trait PartialDeep[T, Options /* <: PartialDeepOptions */] extends StObject
  
  trait PartialDeepOptions extends StObject {
    
    /**
    	Whether to affect the individual elements of arrays and tuples.
    	@default false
    	*/
    val recurseIntoArrays: js.UndefOr[Boolean] = js.undefined
  }
  object PartialDeepOptions {
    
    inline def apply(): PartialDeepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeepOptions]
    }
    
    extension [Self <: PartialDeepOptions](x: Self) {
      
      inline def setRecurseIntoArrays(value: Boolean): Self = StObject.set(x, "recurseIntoArrays", value.asInstanceOf[js.Any])
      
      inline def setRecurseIntoArraysUndefined: Self = StObject.set(x, "recurseIntoArrays", js.undefined)
    }
  }
  
  /**
  Same as `PartialDeep`, but accepts only `Map`s and as inputs. Internal helper for `PartialDeep`.
  */
  type PartialMapDeep[KeyType, ValueType, Options /* <: PartialDeepOptions */] = Map[PartialDeep[KeyType, Options], PartialDeep[ValueType, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `object`s as inputs. Internal helper for `PartialDeep`.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ KeyType in keyof ObjectType ]:? type-fest.type-fest/source/partial-deep.PartialDeep<ObjectType[KeyType], Options>}
    }}}
    */
  @js.native
  trait PartialObjectDeep[ObjectType /* <: js.Object */, Options /* <: PartialDeepOptions */] extends StObject
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialReadonlyMapDeep[KeyType, ValueType, Options /* <: PartialDeepOptions */] = ReadonlyMap[PartialDeep[KeyType, Options], PartialDeep[ValueType, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialReadonlySetDeep[T, Options /* <: PartialDeepOptions */] = ReadonlySet[PartialDeep[T, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `Set`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialSetDeep[T, Options /* <: PartialDeepOptions */] = Set[PartialDeep[T, Options]]
}
