package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputTextDiff")
@js.native
open class TabInputTextDiff protected () extends StObject {
  /**
    * Constructs a new text diff tab input with the given URIs.
    * @param original The uri of the original text resource.
    * @param modified The uri of the modified text resource.
    */
  def this(original: Uri, modified: Uri) = this()
  
  /**
    * The uri of the modified text resource.
    */
  val modified: Uri = js.native
  
  /**
    * The uri of the original text resource.
    */
  val original: Uri = js.native
}
