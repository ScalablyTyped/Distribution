package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSelection extends js.Object {
  /**
    * The selected block attribute key.
    */
  var attributeKey: js.UndefOr[String] = js.undefined
  /**
    * The selected block client ID.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The selected block attribute offset.
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object EditorSelection {
  @scala.inline
  def apply(attributeKey: String = null, clientId: String = null, offset: js.UndefOr[Double] = js.undefined): EditorSelection = {
    val __obj = js.Dynamic.literal()
    if (attributeKey != null) __obj.updateDynamic("attributeKey")(attributeKey.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSelection]
  }
}

