package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "EntryPlugin")
@js.native
open class EntryPlugin protected () extends StObject {
  /**
  	 * An entry plugin which will handle
  	 * creation of the EntryDependency
  	 */
  def this(context: String, entry: String) = this()
  def this(context: String, entry: String, options: String) = this()
  def this(context: String, entry: String, options: EntryOptions) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var context: String = js.native
  
  var entry: String = js.native
  
  var options: String | EntryOptions = js.native
}
object EntryPlugin {
  
  @JSImport("webpack", "EntryPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createDependency(entry: String, options: String): EntryDependency = (^.asInstanceOf[js.Dynamic].applyDynamic("createDependency")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EntryDependency]
  inline def createDependency(entry: String, options: EntryOptions): EntryDependency = (^.asInstanceOf[js.Dynamic].applyDynamic("createDependency")(entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EntryDependency]
}
