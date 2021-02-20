package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "ColorPresentation")
@js.native
class ColorPresentation protected () extends StObject {
  /**
    * Creates a new color presentation.
    *
    * @param label The label of this color presentation.
    */
  def this(label: String) = this()
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation. Edits must not overlap with the main [edit](#ColorPresentation.textEdit) nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String = js.native
  
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.  When `falsy` the [label](#ColorPresentation.label)
    * is used.
    */
  var textEdit: js.UndefOr[TextEdit] = js.native
}
