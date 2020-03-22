package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object basicMod {
  type Class[T, Arguments /* <: js.Array[_] */] = org.scalablytyped.runtime.Instantiable1[/* arguments_ */ Arguments, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.typeFest.basicMod.JsonObject
    - typings.typeFest.basicMod.JsonArray
  */
  type JsonValue = typings.typeFest.basicMod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type Primitive = js.UndefOr[
    scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol | typings.std.BigInt
  ]
  type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array | typings.std.BigInt64Array | typings.std.BigUint64Array
}
