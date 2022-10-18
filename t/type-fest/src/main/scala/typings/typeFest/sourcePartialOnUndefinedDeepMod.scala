package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePartialOnUndefinedDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Record<any, any> | undefined ? {[ KeyType in keyof T as undefined extends T[KeyType]? KeyType : never ]:? type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeepValue<T[KeyType], Options>} extends infer U ? type-fest.type-fest/source/merge.Merge<{[ KeyType in keyof T as KeyType extends keyof U? never : KeyType ]: type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeepValue<T[KeyType], Options>}, U> : never : T
    }}}
    */
  @js.native
  trait PartialOnUndefinedDeep[T, Options /* <: PartialOnUndefinedDeepOptions */] extends StObject
  
  trait PartialOnUndefinedDeepOptions extends StObject {
    
    /**
    	Whether to affect the individual elements of arrays and tuples.
    	@default false
    	*/
    val recurseIntoArrays: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOnUndefinedDeepOptions {
    
    inline def apply(): PartialOnUndefinedDeepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOnUndefinedDeepOptions]
    }
    
    extension [Self <: PartialOnUndefinedDeepOptions](x: Self) {
      
      inline def setRecurseIntoArrays(value: Boolean): Self = StObject.set(x, "recurseIntoArrays", value.asInstanceOf[js.Any])
      
      inline def setRecurseIntoArraysUndefined: Self = StObject.set(x, "recurseIntoArrays", js.undefined)
    }
  }
  
  /**
  Utility type to get the value type by key and recursively call `PartialOnUndefinedDeep` to transform sub-objects.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/internal.BuiltIns | (arguments : ...any): unknown ? T : T extends std.ReadonlyArray<infer U> ? Options['recurseIntoArrays'] extends true ? std.Array<U> extends T ? std.Array<U> extends T ? std.ReadonlyArray<type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<U, Options>> : std.Array<type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<U, Options>> : type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<{[ Key in keyof T ]: type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<T[Key], Options>}, Options> : T : T extends std.Record<any, any> | undefined ? type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<T, Options> : unknown
    }}}
    */
  @js.native
  trait PartialOnUndefinedDeepValue[T, Options /* <: PartialOnUndefinedDeepOptions */] extends StObject
}
