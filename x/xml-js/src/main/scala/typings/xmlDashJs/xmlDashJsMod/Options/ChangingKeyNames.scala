package typings.xmlDashJs.xmlDashJsMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangingKeyNames extends js.Object {
  var attributesKey: js.UndefOr[String] = js.undefined
  var cdataKey: js.UndefOr[String] = js.undefined
  var commentKey: js.UndefOr[String] = js.undefined
  var declarationKey: js.UndefOr[String] = js.undefined
  var doctypeKey: js.UndefOr[String] = js.undefined
  var elementsKey: js.UndefOr[String] = js.undefined
  var instructionKey: js.UndefOr[String] = js.undefined
  var nameKey: js.UndefOr[String] = js.undefined
  var parentKey: js.UndefOr[String] = js.undefined
  var textKey: js.UndefOr[String] = js.undefined
  var typeKey: js.UndefOr[String] = js.undefined
}

object ChangingKeyNames {
  @scala.inline
  def apply(
    attributesKey: String = null,
    cdataKey: String = null,
    commentKey: String = null,
    declarationKey: String = null,
    doctypeKey: String = null,
    elementsKey: String = null,
    instructionKey: String = null,
    nameKey: String = null,
    parentKey: String = null,
    textKey: String = null,
    typeKey: String = null
  ): ChangingKeyNames = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey.asInstanceOf[js.Any])
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey.asInstanceOf[js.Any])
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey.asInstanceOf[js.Any])
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey.asInstanceOf[js.Any])
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey.asInstanceOf[js.Any])
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey.asInstanceOf[js.Any])
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangingKeyNames]
  }
}

