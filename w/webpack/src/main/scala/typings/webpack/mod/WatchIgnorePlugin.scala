package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "WatchIgnorePlugin")
@js.native
open class WatchIgnorePlugin protected () extends StObject {
  def this(options: WatchIgnorePluginOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var paths: js.Array[String | js.RegExp] = js.native
}
