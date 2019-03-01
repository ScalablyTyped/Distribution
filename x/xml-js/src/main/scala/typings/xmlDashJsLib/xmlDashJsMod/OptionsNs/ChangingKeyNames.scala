package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangingKeyNames extends js.Object {
  var attributesKey: js.UndefOr[java.lang.String] = js.undefined
  var cdataKey: js.UndefOr[java.lang.String] = js.undefined
  var commentKey: js.UndefOr[java.lang.String] = js.undefined
  var declarationKey: js.UndefOr[java.lang.String] = js.undefined
  var doctypeKey: js.UndefOr[java.lang.String] = js.undefined
  var elementsKey: js.UndefOr[java.lang.String] = js.undefined
  var instructionKey: js.UndefOr[java.lang.String] = js.undefined
  var nameKey: js.UndefOr[java.lang.String] = js.undefined
  var parentKey: js.UndefOr[java.lang.String] = js.undefined
  var textKey: js.UndefOr[java.lang.String] = js.undefined
  var typeKey: js.UndefOr[java.lang.String] = js.undefined
}

object ChangingKeyNames {
  @scala.inline
  def apply(
    attributesKey: java.lang.String = null,
    cdataKey: java.lang.String = null,
    commentKey: java.lang.String = null,
    declarationKey: java.lang.String = null,
    doctypeKey: java.lang.String = null,
    elementsKey: java.lang.String = null,
    instructionKey: java.lang.String = null,
    nameKey: java.lang.String = null,
    parentKey: java.lang.String = null,
    textKey: java.lang.String = null,
    typeKey: java.lang.String = null
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

