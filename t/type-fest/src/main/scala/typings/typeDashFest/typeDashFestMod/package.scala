package typings.typeDashFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashFestMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.std.Exclude
  import typings.std.Extract
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Pick
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type Class[T] = Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.typeDashFest.typeDashFestMod.JsonObject
    - typings.typeDashFest.typeDashFestMod.JsonArray
  */
  type JsonValue = _JsonValue | String | Double | Boolean | Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with js.Object)
  type Merge[FirstType, SecondType] = (Omit[FirstType, Extract[String, String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((Without[FirstType, SecondType]) with SecondType) | ((Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: String */] = Pick[ObjectType, Exclude[String, KeysType]]
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: String */] = (/* import warning: ImportType.apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (Omit[ObjectType, KeysType])
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typings.typeDashFest.typeDashFestStrings.Without with js.Any
}
