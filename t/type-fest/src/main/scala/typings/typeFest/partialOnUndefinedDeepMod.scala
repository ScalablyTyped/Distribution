package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.typeFest.mergeMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialOnUndefinedDeepMod {
  
  type PartialOnUndefinedDeep[T, Options /* <: PartialOnUndefinedDeepOptions */] = T | (Merge[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof T as KeyType extends keyof any? never : KeyType ]: type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeepValue<T[KeyType], Options>}
    */ typings.typeFest.typeFestStrings.PartialOnUndefinedDeep & TopLevel[T], 
    Any
  ])
  
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
  type PartialOnUndefinedDeepValue[T, Options /* <: PartialOnUndefinedDeepOptions */] = Any | (PartialOnUndefinedDeep[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof T ]: type-fest.type-fest/source/partial-on-undefined-deep.PartialOnUndefinedDeep<T[Key], Options>}
    */ typings.typeFest.typeFestStrings.PartialOnUndefinedDeepValue & TopLevel[T]) | T, 
    Options
  ]) | T | (js.Array[PartialOnUndefinedDeep[Any, Options]])
}
