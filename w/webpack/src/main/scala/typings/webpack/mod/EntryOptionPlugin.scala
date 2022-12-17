package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "EntryOptionPlugin")
@js.native
open class EntryOptionPlugin () extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
}
object EntryOptionPlugin {
  
  @JSImport("webpack", "EntryOptionPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def applyEntryOption(compiler: Compiler, context: String, entry: EntryNormalized): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEntryOption")(compiler.asInstanceOf[js.Any], context.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def entryDescriptionToOptions(compiler: Compiler, name: String, desc: EntryDescriptionNormalized): EntryOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("entryDescriptionToOptions")(compiler.asInstanceOf[js.Any], name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[EntryOptions]
}
