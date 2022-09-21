package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputText")
@js.native
open class TabInputText protected () extends StObject {
  /**
    * Constructs a text tab input with the given URI.
    * @param uri The URI of the tab.
    */
  def this(uri: Uri) = this()
  
  /**
    * The uri represented by the tab.
    */
  val uri: Uri = js.native
}
