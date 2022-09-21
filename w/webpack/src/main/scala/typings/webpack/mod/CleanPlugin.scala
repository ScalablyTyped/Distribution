package typings.webpack.mod

import typings.webpack.anon.Dry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "CleanPlugin")
@js.native
open class CleanPlugin () extends StObject {
  def this(options: CleanOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: Dry = js.native
}
object CleanPlugin {
  
  @JSImport("webpack", "CleanPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getCompilationHooks(compilation: Compilation): CleanPluginCompilationHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilationHooks")(compilation.asInstanceOf[js.Any]).asInstanceOf[CleanPluginCompilationHooks]
}
