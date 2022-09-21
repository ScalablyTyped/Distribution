package typings.webpack.mod

import typings.webpack.anon.EntryOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "DllPlugin")
@js.native
open class DllPlugin protected () extends StObject {
  def this(options: DllPluginOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: EntryOnly = js.native
}
