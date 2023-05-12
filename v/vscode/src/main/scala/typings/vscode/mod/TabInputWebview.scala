package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputWebview")
@js.native
open class TabInputWebview protected () extends StObject {
  /**
  		 * Constructs a webview tab input with the given view type.
  		 * @param viewType The type of webview. Maps to {@linkcode WebviewPanel.viewType WebviewPanel's viewType}
  		 */
  def this(viewType: String) = this()
  
  /**
  		 * The type of webview. Maps to {@linkcode WebviewPanel.viewType WebviewPanel's viewType}
  		 */
  val viewType: String = js.native
}
