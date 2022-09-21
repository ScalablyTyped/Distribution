package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "PrefetchPlugin")
@js.native
open class PrefetchPlugin () extends StObject {
  def this(context: Any) = this()
  def this(context: Any, request: Any) = this()
  def this(context: Unit, request: Any) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var context: Any = js.native
  
  var request: Any = js.native
}
