package typings.xmltojson.xmltojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attrKey: js.UndefOr[String] = js.undefined
  var attrsAsObject: js.UndefOr[Boolean] = js.undefined
  var cdataKey: js.UndefOr[String] = js.undefined
  var childrenAsArray: js.UndefOr[Boolean] = js.undefined
  var grokAttr: js.UndefOr[Boolean] = js.undefined
  var grokText: js.UndefOr[Boolean] = js.undefined
  var mergeCDATA: js.UndefOr[Boolean] = js.undefined
  var namespaceKey: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var stripAttrPrefix: js.UndefOr[Boolean] = js.undefined
  var stripElemPrefix: js.UndefOr[Boolean] = js.undefined
  var textKey: js.UndefOr[String] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
  var xmlns: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attrKey: String = null,
    attrsAsObject: js.UndefOr[Boolean] = js.undefined,
    cdataKey: String = null,
    childrenAsArray: js.UndefOr[Boolean] = js.undefined,
    grokAttr: js.UndefOr[Boolean] = js.undefined,
    grokText: js.UndefOr[Boolean] = js.undefined,
    mergeCDATA: js.UndefOr[Boolean] = js.undefined,
    namespaceKey: String = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    stripAttrPrefix: js.UndefOr[Boolean] = js.undefined,
    stripElemPrefix: js.UndefOr[Boolean] = js.undefined,
    textKey: String = null,
    valueKey: String = null,
    xmlns: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attrKey != null) __obj.updateDynamic("attrKey")(attrKey)
    if (!js.isUndefined(attrsAsObject)) __obj.updateDynamic("attrsAsObject")(attrsAsObject)
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey)
    if (!js.isUndefined(childrenAsArray)) __obj.updateDynamic("childrenAsArray")(childrenAsArray)
    if (!js.isUndefined(grokAttr)) __obj.updateDynamic("grokAttr")(grokAttr)
    if (!js.isUndefined(grokText)) __obj.updateDynamic("grokText")(grokText)
    if (!js.isUndefined(mergeCDATA)) __obj.updateDynamic("mergeCDATA")(mergeCDATA)
    if (namespaceKey != null) __obj.updateDynamic("namespaceKey")(namespaceKey)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(stripAttrPrefix)) __obj.updateDynamic("stripAttrPrefix")(stripAttrPrefix)
    if (!js.isUndefined(stripElemPrefix)) __obj.updateDynamic("stripElemPrefix")(stripElemPrefix)
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[Options]
  }
}

