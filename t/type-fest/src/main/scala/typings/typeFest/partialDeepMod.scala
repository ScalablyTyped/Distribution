package typings.typeFest

import typings.std.Map
import typings.std.Partial
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/partial-deep", JSImport.Namespace)
@js.native
object partialDeepMod extends js.Object {
  /**
  Same as `PartialDeep`, but accepts only `Map`s and  as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialMapDeep[KeyType, ValueType] extends Map[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlyMap`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlyMapDeep[KeyType, ValueType] extends ReadonlyMap[PartialDeep[KeyType], PartialDeep[ValueType]]
  
  /**
  Same as `PartialDeep`, but accepts only `ReadonlySet`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialReadonlySetDeep[T] extends ReadonlySet[PartialDeep[T]]
  
  /**
  Same as `PartialDeep`, but accepts only `Set`s as inputs. Internal helper for `PartialDeep`.
  */
  @js.native
  trait PartialSetDeep[T] extends Set[PartialDeep[T]]
  
  type PartialDeep[T] = js.UndefOr[
    js.Any | PartialObjectDeep[T] | T | PartialReadonlySetDeep[js.Any] | (PartialReadonlyMapDeep[js.Any, js.Any]) | PartialSetDeep[js.Any] | (PartialMapDeep[js.Any, js.Any]) | Partial[T]
  ]
  /**
  Same as `PartialDeep`, but accepts only `object`s as inputs. Internal helper for `PartialDeep`.
  */
  type PartialObjectDeep[ObjectType /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType ]:? type-fest.type-fest/source/partial-deep.PartialDeep<ObjectType[KeyType]>}
    */ typings.typeFest.typeFestStrings.PartialObjectDeep with ObjectType
}

