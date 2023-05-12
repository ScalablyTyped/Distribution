package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "LoaderOptionsPlugin")
@js.native
open class LoaderOptionsPlugin () extends StObject {
  def this(options: LoaderOptionsPluginOptions & MatchObject) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: LoaderOptionsPluginOptions & MatchObject = js.native
}
