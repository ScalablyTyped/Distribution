package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookData")
@js.native
open class NotebookData protected () extends StObject {
  /**
  		 * Create new notebook data.
  		 *
  		 * @param cells An array of cell data.
  		 */
  def this(cells: js.Array[NotebookCellData]) = this()
  
  /**
  		 * The cell data of this notebook data.
  		 */
  var cells: js.Array[NotebookCellData] = js.native
  
  /**
  		 * Arbitrary metadata of notebook data.
  		 */
  var metadata: js.UndefOr[StringDictionary[Any]] = js.native
}
