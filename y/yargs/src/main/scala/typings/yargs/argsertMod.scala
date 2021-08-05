package typings.yargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsertMod {
  
  @JSImport("yargs/build/lib/argsert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argsert(callerArguments: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("argsert")(callerArguments.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def argsert(callerArguments: js.Array[js.Any], length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("argsert")(callerArguments.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def argsert(expected: String, callerArguments: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("argsert")(expected.asInstanceOf[js.Any], callerArguments.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def argsert(expected: String, callerArguments: js.Array[js.Any], length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("argsert")(expected.asInstanceOf[js.Any], callerArguments.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
