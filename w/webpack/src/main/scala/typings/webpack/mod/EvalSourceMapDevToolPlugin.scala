package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "EvalSourceMapDevToolPlugin")
@js.native
open class EvalSourceMapDevToolPlugin protected () extends StObject {
  def this(inputOptions: String) = this()
  def this(inputOptions: SourceMapDevToolPluginOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var moduleFilenameTemplate: String | js.Function = js.native
  
  var namespace: String = js.native
  
  var options: SourceMapDevToolPluginOptions = js.native
  
  var sourceMapComment: String = js.native
}
