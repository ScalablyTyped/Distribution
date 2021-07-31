package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.Map
import typings.std.Partial
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialDeepMod {
  
  type PartialDeep[T] = js.UndefOr[
    js.Any | PartialObjectDeep[T] | T | PartialReadonlySetDeep[js.Any] | (PartialReadonlyMapDeep[js.Any, js.Any]) | PartialSetDeep[js.Any] | (PartialMapDeep[js.Any, js.Any]) | Partial[T]
  ]
  
  /**
  Same as `PartialDeep`, but accepts only `Map`s and  as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialMapDeep[KeyType, ValueType]
    extends StObject
       with Map[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `object`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialObjectDeep[ObjectType /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType ]:? type-fest.type-fest/source/partial-deep.PartialDeep<ObjectType[KeyType]>}
    */ typings.typeFest.typeFestStrings.PartialObjectDeep & TopLevel[ObjectType]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlyMapDeep[KeyType, ValueType]
    extends StObject
       with ReadonlyMap[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlySetDeep[T]
    extends StObject
       with ReadonlySet[PartialDeep[T]]
  
  /**
  Same as `PartialDeep`, but accepts only `Set`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialSetDeep[T]
    extends StObject
       with Set[PartialDeep[T]]
}
