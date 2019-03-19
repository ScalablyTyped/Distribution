package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashFestMod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type JSONValue = _JSONValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type Merge[FirstType, SecondType] = (Omit[FirstType, stdLib.Extract[java.lang.String, java.lang.String]]) with SecondType
  type Omit[ObjectType, KeysType /* <: java.lang.String */] = stdLib.Pick[ObjectType, stdLib.Exclude[java.lang.String, KeysType]]
  type Primitive = js.UndefOr[scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol]
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
}
