package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialDeepMod {
  
  type PartialDeep[T, Options /* <: PartialDeepOptions */] = js.UndefOr[
    Any | (PartialObjectDeep[T, Options]) | T | js.Array[Any] | (PartialReadonlySetDeep[Any, Options]) | (PartialReadonlyMapDeep[Any, Any, Options]) | (PartialSetDeep[Any, Options]) | (PartialMapDeep[Any, Any, Options])
  ]
  
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
  @js.native
  trait PartialMapDeep[KeyType, ValueType, Options /* <: PartialDeepOptions */]
    extends StObject
       with Map[PartialDeep[KeyType, Options], PartialDeep[ValueType, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `object`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialObjectDeep[ObjectType /* <: js.Object */, Options /* <: PartialDeepOptions */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType ]:? type-fest.type-fest/source/partial-deep.PartialDeep<ObjectType[KeyType], Options>}
    */ typings.typeFest.typeFestStrings.PartialObjectDeep & TopLevel[ObjectType]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlyMapDeep[KeyType, ValueType, Options /* <: PartialDeepOptions */]
    extends StObject
       with ReadonlyMap[PartialDeep[KeyType, Options], PartialDeep[ValueType, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlySetDeep[T, Options /* <: PartialDeepOptions */]
    extends StObject
       with ReadonlySet[PartialDeep[T, Options]]
  
  /**
  Same as `PartialDeep`, but accepts only `Set`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialSetDeep[T, Options /* <: PartialDeepOptions */]
    extends StObject
       with Set[PartialDeep[T, Options]]
}
