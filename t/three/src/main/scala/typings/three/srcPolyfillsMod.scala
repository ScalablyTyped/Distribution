package typings.three

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/polyfills", JSImport.Namespace)
@js.native
object srcPolyfillsMod extends js.Object {
  def error(): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}

