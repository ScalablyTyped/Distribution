package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "IgnorePlugin")
@js.native
open class IgnorePlugin protected () extends StObject {
  def this(options: IgnorePluginOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  /**
  	 * Note that if "contextRegExp" is given, both the "resourceRegExp"
  	 * and "contextRegExp" have to match.
  	 */
  def checkIgnore(resolveData: ResolveData): js.UndefOr[`false`] = js.native
  
  var options: IgnorePluginOptions = js.native
}
