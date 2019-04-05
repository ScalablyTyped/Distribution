package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashFestMod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* arguments_ (repeated) */ js.Any, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - JsonObject
    - JsonArray
  */
  type JsonValue = _JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with typeDashFestLib.Anon_)
  type Merge[FirstType, SecondType] = (Omit[FirstType, stdLib.Extract[java.lang.String, java.lang.String]]) with SecondType
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((typeDashFestLib.Without[FirstType, SecondType]) with SecondType) | ((typeDashFestLib.Without[SecondType, FirstType]) with FirstType)
  type Omit[ObjectType, KeysType /* <: java.lang.String */] = stdLib.Pick[ObjectType, stdLib.Exclude[java.lang.String, KeysType]]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol]
  type RequireAtLeastOne[ObjectType, KeysType /* <: java.lang.String */] = (/* import warning: ImportType.apply Failed type conversion: {[ Key in KeysType ]: std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (Omit[ObjectType, KeysType])
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
}
