package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XML2JSON extends XML2JS {
  var spaces: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object XML2JSON {
  @scala.inline
  def apply(
    addParent: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysArray: scala.Boolean | js.Array[java.lang.String] = null,
    alwaysChildren: js.UndefOr[scala.Boolean] = js.undefined,
    attributeNameFn: (/* attributeName */ java.lang.String, /* attributeValue */ java.lang.String, /* parentElement */ java.lang.String) => scala.Unit = null,
    attributeValueFn: (/* attributeValue */ java.lang.String, /* attributeName */ java.lang.String, /* parentElement */ java.lang.String) => scala.Unit = null,
    attributesFn: (/* value */ java.lang.String, /* parentElement */ java.lang.String) => scala.Unit = null,
    attributesKey: java.lang.String = null,
    captureSpacesBetweenElements: js.UndefOr[scala.Boolean] = js.undefined,
    cdataFn: (/* value */ java.lang.String, /* parentElement */ js.Object) => scala.Unit = null,
    cdataKey: java.lang.String = null,
    commentFn: (/* value */ java.lang.String, /* parentElement */ js.Object) => scala.Unit = null,
    commentKey: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    declarationKey: java.lang.String = null,
    doctypeFn: (/* value */ java.lang.String, /* parentElement */ js.Object) => scala.Unit = null,
    doctypeKey: java.lang.String = null,
    elementNameFn: (/* value */ java.lang.String, /* parentElement */ js.Object) => scala.Unit = null,
    elementsKey: java.lang.String = null,
    ignoreAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreComment: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreText: js.UndefOr[scala.Boolean] = js.undefined,
    instructionFn: (/* instructionValue */ java.lang.String, /* instructionName */ java.lang.String, /* parentElement */ java.lang.String) => scala.Unit = null,
    instructionHasAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    instructionKey: java.lang.String = null,
    instructionNameFn: (/* instructionName */ java.lang.String, /* instructionValue */ java.lang.String, /* parentElement */ java.lang.String) => scala.Unit = null,
    nameKey: java.lang.String = null,
    nativeType: js.UndefOr[scala.Boolean] = js.undefined,
    parentKey: java.lang.String = null,
    sanitize: js.UndefOr[scala.Boolean] = js.undefined,
    spaces: scala.Double | java.lang.String = null,
    textFn: (/* value */ java.lang.String, /* parentElement */ js.Object) => scala.Unit = null,
    textKey: java.lang.String = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    typeKey: java.lang.String = null
  ): XML2JSON = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addParent)) __obj.updateDynamic("addParent")(addParent)
    if (alwaysArray != null) __obj.updateDynamic("alwaysArray")(alwaysArray.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysChildren)) __obj.updateDynamic("alwaysChildren")(alwaysChildren)
    if (attributeNameFn != null) __obj.updateDynamic("attributeNameFn")(js.Any.fromFunction3(attributeNameFn))
    if (attributeValueFn != null) __obj.updateDynamic("attributeValueFn")(js.Any.fromFunction3(attributeValueFn))
    if (attributesFn != null) __obj.updateDynamic("attributesFn")(js.Any.fromFunction2(attributesFn))
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (!js.isUndefined(captureSpacesBetweenElements)) __obj.updateDynamic("captureSpacesBetweenElements")(captureSpacesBetweenElements)
    if (cdataFn != null) __obj.updateDynamic("cdataFn")(js.Any.fromFunction2(cdataFn))
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey)
    if (commentFn != null) __obj.updateDynamic("commentFn")(js.Any.fromFunction2(commentFn))
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey)
    if (doctypeFn != null) __obj.updateDynamic("doctypeFn")(js.Any.fromFunction2(doctypeFn))
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey)
    if (elementNameFn != null) __obj.updateDynamic("elementNameFn")(js.Any.fromFunction2(elementNameFn))
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey)
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes)
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata)
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment)
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration)
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype)
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction)
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText)
    if (instructionFn != null) __obj.updateDynamic("instructionFn")(js.Any.fromFunction3(instructionFn))
    if (!js.isUndefined(instructionHasAttributes)) __obj.updateDynamic("instructionHasAttributes")(instructionHasAttributes)
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey)
    if (instructionNameFn != null) __obj.updateDynamic("instructionNameFn")(js.Any.fromFunction3(instructionNameFn))
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey)
    if (!js.isUndefined(nativeType)) __obj.updateDynamic("nativeType")(nativeType)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (textFn != null) __obj.updateDynamic("textFn")(js.Any.fromFunction2(textFn))
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey)
    __obj.asInstanceOf[XML2JSON]
  }
}

