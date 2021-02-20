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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillsMod {
  
  @JSImport("three/src/polyfills", "error")
  @js.native
  def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("three/src/polyfills", "error")
  @js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  @JSImport("three/src/polyfills", "log")
  @js.native
  def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("three/src/polyfills", "log")
  @js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  @JSImport("three/src/polyfills", "warn")
  @js.native
  def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  @JSImport("three/src/polyfills", "warn")
  @js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
