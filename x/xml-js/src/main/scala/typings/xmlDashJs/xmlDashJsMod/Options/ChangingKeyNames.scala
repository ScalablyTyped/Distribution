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
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey)
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey)
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey)
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey)
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey)
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey)
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey)
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey)
    __obj.asInstanceOf[ChangingKeyNames]
  }
}

