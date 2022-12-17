package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "HotModuleReplacementPlugin")
@js.native
open class HotModuleReplacementPlugin () extends StObject {
  def this(options: Any) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: Any = js.native
}
object HotModuleReplacementPlugin {
  
  @JSImport("webpack", "HotModuleReplacementPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getParserHooks(parser: JavascriptParser): HMRJavascriptParserHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getParserHooks")(parser.asInstanceOf[js.Any]).asInstanceOf[HMRJavascriptParserHooks]
}
