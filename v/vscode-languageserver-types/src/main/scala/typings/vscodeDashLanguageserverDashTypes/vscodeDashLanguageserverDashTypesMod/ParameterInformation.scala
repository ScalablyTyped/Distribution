package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterInformation extends js.Object {
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkupContent] = js.undefined
  /**
    * The label of this parameter information.
    *
    * Either a string or inclusive start and exclusive end offsets within its containing
    * [signature label](#SignatureInformation.label). *Note*: A label of type string must be
    * a substring of its containing signature information's [label](#SignatureInformation.label).
    */
  var label: String | (js.Tuple2[Double, Double])
}

object ParameterInformation {
  @scala.inline
  def apply(label: String | (js.Tuple2[Double, Double]), documentation: String | MarkupContent = null): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
}

