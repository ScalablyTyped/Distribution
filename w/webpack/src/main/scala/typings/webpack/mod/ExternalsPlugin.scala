package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ExternalsPlugin")
@js.native
open class ExternalsPlugin protected () extends StObject {
  def this(`type`: String, externals: Externals) = this()
  def this(`type`: Unit, externals: Externals) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var externals: Externals = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
