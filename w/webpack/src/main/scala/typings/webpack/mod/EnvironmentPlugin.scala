package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "EnvironmentPlugin")
@js.native
open class EnvironmentPlugin protected () extends StObject {
  def this(keys: Any*) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var defaultValues: Any = js.native
  
  var keys: js.Array[Any] = js.native
}
