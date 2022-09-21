package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "LibraryTemplatePlugin")
@js.native
open class LibraryTemplatePlugin protected () extends StObject {
  def this(
    name: LibraryName,
    target: String,
    umdNamedDefine: Boolean,
    auxiliaryComment: AuxiliaryComment,
    exportProperty: LibraryExport
  ) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var library: typings.webpack.anon.AuxiliaryComment = js.native
}
