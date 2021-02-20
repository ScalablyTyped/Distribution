package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Hover")
@js.native
class Hover protected () extends StObject {
  def this(contents: js.Array[MarkedString]) = this()
  /**
    * Creates a new hover object.
    *
    * @param contents The contents of the hover.
    * @param range The range to which the hover applies.
    */
  def this(contents: MarkedString) = this()
  def this(contents: js.Array[MarkedString], range: Range) = this()
  def this(contents: MarkedString, range: Range) = this()
  
  /**
    * The contents of this hover.
    */
  var contents: js.Array[MarkedString] = js.native
  
  /**
    * The range to which this hover applies. When missing, the
    * editor will use the range at the current position or the
    * current position itself.
    */
  var range: js.UndefOr[Range] = js.native
}
