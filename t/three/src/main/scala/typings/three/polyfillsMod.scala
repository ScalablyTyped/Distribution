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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillsMod {
  
  @JSImport("three/src/polyfills", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def error(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def log(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warn(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(message: Unit, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
