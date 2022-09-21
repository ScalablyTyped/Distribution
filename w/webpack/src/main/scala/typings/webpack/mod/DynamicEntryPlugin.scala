package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "DynamicEntryPlugin")
@js.native
open class DynamicEntryPlugin protected () extends StObject {
  def this(context: String, entry: js.Function0[js.Promise[EntryStaticNormalized]]) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var context: String = js.native
  
  def entry(): js.Promise[EntryStaticNormalized] = js.native
}
