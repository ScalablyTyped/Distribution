package typings.webpack.mod

import typings.std.Record
import typings.webpack.anon.Key
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "DefinePlugin")
@js.native
open class DefinePlugin protected () extends StObject {
  /**
  	 * Create a new define plugin
  	 */
  def this(definitions: Record[String, CodeValue]) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var definitions: Record[String, CodeValue] = js.native
}
object DefinePlugin {
  
  @JSImport("webpack", "DefinePlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def runtimeValue(fn: js.Function1[/* arg0 */ Key, CodeValuePrimitive]): RuntimeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("runtimeValue")(fn.asInstanceOf[js.Any]).asInstanceOf[RuntimeValue]
  inline def runtimeValue(fn: js.Function1[/* arg0 */ Key, CodeValuePrimitive], options: js.Array[String]): RuntimeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("runtimeValue")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RuntimeValue]
  inline def runtimeValue(fn: js.Function1[/* arg0 */ Key, CodeValuePrimitive], options: RuntimeValueOptions): RuntimeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("runtimeValue")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RuntimeValue]
  
  inline def runtimeValue_true(fn: js.Function1[/* arg0 */ Key, CodeValuePrimitive], options: `true`): RuntimeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("runtimeValue")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RuntimeValue]
}
