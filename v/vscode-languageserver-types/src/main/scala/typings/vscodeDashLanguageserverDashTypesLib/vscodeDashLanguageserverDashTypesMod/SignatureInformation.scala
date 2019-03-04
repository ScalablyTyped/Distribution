package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[java.lang.String | MarkupContent] = js.undefined
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: java.lang.String
  /**
    * The parameters of this signature.
    */
  var parameters: js.UndefOr[js.Array[ParameterInformation]] = js.undefined
}

object SignatureInformation {
  @scala.inline
  def apply(
    label: java.lang.String,
    documentation: java.lang.String | MarkupContent = null,
    parameters: js.Array[ParameterInformation] = null
  ): SignatureInformation = {
    val __obj = js.Dynamic.literal(label = label)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[SignatureInformation]
  }
}

