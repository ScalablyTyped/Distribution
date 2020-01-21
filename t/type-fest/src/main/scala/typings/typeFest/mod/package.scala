package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.typeFest.mod.JsonObject
    - typings.typeFest.mod.JsonArray
  */
  type JsonValue = typings.typeFest.mod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: typings.typeFest.mod.Primitive */] = LiteralType | (BaseType with js.Object)
  type Merge[FirstType, SecondType] = (typings.typeFest.mod.Omit[FirstType, typings.std.Extract[java.lang.String, java.lang.String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((typings.typeFest.mod.Without[FirstType, SecondType]) with SecondType) | ((typings.typeFest.mod.Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: java.lang.String */] = typings.std.Pick[ObjectType, typings.std.Exclude[java.lang.String, KeysType]]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (typings.typeFest.mod.Omit[ObjectType, KeysType])
  type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typings.typeFest.typeFestStrings.Without with js.Any
}
