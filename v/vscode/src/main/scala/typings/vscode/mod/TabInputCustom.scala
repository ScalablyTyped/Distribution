package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputCustom")
@js.native
open class TabInputCustom protected () extends StObject {
  /**
  		 * Constructs a custom editor tab input.
  		 * @param uri The uri of the tab.
  		 * @param viewType The viewtype of the custom editor.
  		 */
  def this(uri: Uri, viewType: String) = this()
  
  /**
  		 * The uri that the tab is representing.
  		 */
  val uri: Uri = js.native
  
  /**
  		 * The type of custom editor.
  		 */
  val viewType: String = js.native
}
