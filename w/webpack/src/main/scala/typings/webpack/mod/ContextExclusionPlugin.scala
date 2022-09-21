package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ContextExclusionPlugin")
@js.native
open class ContextExclusionPlugin protected () extends StObject {
  def this(negativeMatcher: js.RegExp) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var negativeMatcher: js.RegExp = js.native
}
