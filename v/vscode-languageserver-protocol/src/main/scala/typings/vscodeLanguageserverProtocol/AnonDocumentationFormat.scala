package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentationFormat extends js.Object {
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  /**
    * Client capabilities specific to parameter information.
    */
  var parameterInformation: js.UndefOr[AnonLabelOffsetSupport] = js.undefined
}

object AnonDocumentationFormat {
  @scala.inline
  def apply(
    documentationFormat: js.Array[MarkupKind] = null,
    parameterInformation: AnonLabelOffsetSupport = null
  ): AnonDocumentationFormat = {
    val __obj = js.Dynamic.literal()
    if (documentationFormat != null) __obj.updateDynamic("documentationFormat")(documentationFormat.asInstanceOf[js.Any])
    if (parameterInformation != null) __obj.updateDynamic("parameterInformation")(parameterInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentationFormat]
  }
}

