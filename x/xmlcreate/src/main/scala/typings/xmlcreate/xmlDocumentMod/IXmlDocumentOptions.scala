package typings.xmlcreate.xmlDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDocumentOptions extends js.Object {
  /**
    * Whether to throw an exception if basic XML validation fails while
    * building the document.
    */
  var validation: js.UndefOr[Boolean] = js.undefined
}

object IXmlDocumentOptions {
  @scala.inline
  def apply(validation: js.UndefOr[Boolean] = js.undefined): IXmlDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validation)) __obj.updateDynamic("validation")(validation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDocumentOptions]
  }
}

