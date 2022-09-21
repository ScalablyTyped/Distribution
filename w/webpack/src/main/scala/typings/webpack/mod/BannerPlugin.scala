package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "BannerPlugin")
@js.native
open class BannerPlugin protected () extends StObject {
  def this(options: BannerPluginArgument) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  def banner(data: typings.webpack.anon.Chunk): String = js.native
  
  var options: BannerPluginOptions = js.native
}
