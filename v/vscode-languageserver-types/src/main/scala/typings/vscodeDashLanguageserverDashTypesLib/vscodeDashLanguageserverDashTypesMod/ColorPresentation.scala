package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPresentation extends js.Object {
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation. Edits must not overlap with the main [edit](#ColorPresentation.textEdit) nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: java.lang.String
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.  When `falsy` the [label](#ColorPresentation.label)
    * is used.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}

object ColorPresentation {
  @scala.inline
  def apply(label: java.lang.String, additionalTextEdits: js.Array[TextEdit] = null, textEdit: TextEdit = null): ColorPresentation = {
    val __obj = js.Dynamic.literal(label = label)
    if (additionalTextEdits != null) __obj.updateDynamic("additionalTextEdits")(additionalTextEdits)
    if (textEdit != null) __obj.updateDynamic("textEdit")(textEdit)
    __obj.asInstanceOf[ColorPresentation]
  }
}

