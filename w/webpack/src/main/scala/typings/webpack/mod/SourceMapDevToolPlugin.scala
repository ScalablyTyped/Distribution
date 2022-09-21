package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "SourceMapDevToolPlugin")
@js.native
open class SourceMapDevToolPlugin () extends StObject {
  def this(options: SourceMapDevToolPluginOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var fallbackModuleFilenameTemplate: String | js.Function = js.native
  
  var moduleFilenameTemplate: String | js.Function = js.native
  
  var namespace: String = js.native
  
  var options: SourceMapDevToolPluginOptions = js.native
  
  var sourceMapFilename: String | `false` = js.native
  
  var sourceMappingURLComment: String | `false` = js.native
}
