package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "EvalDevToolModulePlugin")
@js.native
open class EvalDevToolModulePlugin () extends StObject {
  def this(options: Any) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var moduleFilenameTemplate: Any = js.native
  
  var namespace: Any = js.native
  
  var sourceUrlComment: Any = js.native
}
