package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncWebAssemblyModulesPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: Any = js.native
  
  def renderModule(): Any = js.native
  def renderModule(module: Any): Any = js.native
  def renderModule(module: Any, renderContext: Any): Any = js.native
  def renderModule(module: Any, renderContext: Any, hooks: Any): Any = js.native
  def renderModule(module: Any, renderContext: Unit, hooks: Any): Any = js.native
  def renderModule(module: Unit, renderContext: Any): Any = js.native
  def renderModule(module: Unit, renderContext: Any, hooks: Any): Any = js.native
  def renderModule(module: Unit, renderContext: Unit, hooks: Any): Any = js.native
}
