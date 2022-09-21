package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ProvidePlugin")
@js.native
open class ProvidePlugin protected () extends StObject {
  def this(definitions: Record[String, String | js.Array[String]]) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var definitions: Record[String, String | js.Array[String]] = js.native
}
