package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "NormalModuleReplacementPlugin")
@js.native
open class NormalModuleReplacementPlugin protected () extends StObject {
  /**
  	 * Create an instance of the plugin
  	 */
  def this(resourceRegExp: js.RegExp, newResource: String) = this()
  def this(resourceRegExp: js.RegExp, newResource: js.Function1[/* arg0 */ js.UndefOr[Any], Unit]) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var newResource: String | (js.Function1[/* arg0 */ js.UndefOr[Any], Unit]) = js.native
  
  var resourceRegExp: js.RegExp = js.native
}
