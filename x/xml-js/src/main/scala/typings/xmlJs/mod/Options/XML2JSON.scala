package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XML2JSON extends XML2JS {
  var spaces: js.UndefOr[Double | String] = js.undefined
}

object XML2JSON {
  @scala.inline
  def apply(
    addParent: js.UndefOr[Boolean] = js.undefined,
    alwaysArray: Boolean | js.Array[String] = null,
    alwaysChildren: js.UndefOr[Boolean] = js.undefined,
    attributeNameFn: (/* attributeName */ String, /* attributeValue */ String, /* parentElement */ String) => Unit = null,
    attributeValueFn: (/* attributeValue */ String, /* attributeName */ String, /* parentElement */ String) => Unit = null,
    attributesFn: (/* value */ String, /* parentElement */ String) => Unit = null,
    attributesKey: String = null,
    captureSpacesBetweenElements: js.UndefOr[Boolean] = js.undefined,
    cdataFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    cdataKey: String = null,
    commentFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    commentKey: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    declarationKey: String = null,
    doctypeFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    doctypeKey: String = null,
    elementNameFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    elementsKey: String = null,
    ignoreAttributes: js.UndefOr[Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[Boolean] = js.undefined,
    ignoreComment: js.UndefOr[Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[Boolean] = js.undefined,
    ignoreText: js.UndefOr[Boolean] = js.undefined,
    instructionFn: (/* instructionValue */ String, /* instructionName */ String, /* parentElement */ String) => Unit = null,
    instructionHasAttributes: js.UndefOr[Boolean] = js.undefined,
    instructionKey: String = null,
    instructionNameFn: (/* instructionName */ String, /* instructionValue */ String, /* parentElement */ String) => Unit = null,
    nameKey: String = null,
    nativeType: js.UndefOr[Boolean] = js.undefined,
    parentKey: String = null,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    spaces: Double | String = null,
    textFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    textKey: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    typeKey: String = null
  ): XML2JSON = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addParent)) __obj.updateDynamic("addParent")(addParent.get.asInstanceOf[js.Any])
    if (alwaysArray != null) __obj.updateDynamic("alwaysArray")(alwaysArray.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysChildren)) __obj.updateDynamic("alwaysChildren")(alwaysChildren.get.asInstanceOf[js.Any])
    if (attributeNameFn != null) __obj.updateDynamic("attributeNameFn")(js.Any.fromFunction3(attributeNameFn))
    if (attributeValueFn != null) __obj.updateDynamic("attributeValueFn")(js.Any.fromFunction3(attributeValueFn))
    if (attributesFn != null) __obj.updateDynamic("attributesFn")(js.Any.fromFunction2(attributesFn))
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (!js.isUndefined(captureSpacesBetweenElements)) __obj.updateDynamic("captureSpacesBetweenElements")(captureSpacesBetweenElements.get.asInstanceOf[js.Any])
    if (cdataFn != null) __obj.updateDynamic("cdataFn")(js.Any.fromFunction2(cdataFn))
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey.asInstanceOf[js.Any])
    if (commentFn != null) __obj.updateDynamic("commentFn")(js.Any.fromFunction2(commentFn))
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey.asInstanceOf[js.Any])
    if (doctypeFn != null) __obj.updateDynamic("doctypeFn")(js.Any.fromFunction2(doctypeFn))
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey.asInstanceOf[js.Any])
    if (elementNameFn != null) __obj.updateDynamic("elementNameFn")(js.Any.fromFunction2(elementNameFn))
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText.get.asInstanceOf[js.Any])
    if (instructionFn != null) __obj.updateDynamic("instructionFn")(js.Any.fromFunction3(instructionFn))
    if (!js.isUndefined(instructionHasAttributes)) __obj.updateDynamic("instructionHasAttributes")(instructionHasAttributes.get.asInstanceOf[js.Any])
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey.asInstanceOf[js.Any])
    if (instructionNameFn != null) __obj.updateDynamic("instructionNameFn")(js.Any.fromFunction3(instructionNameFn))
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeType)) __obj.updateDynamic("nativeType")(nativeType.get.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.get.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (textFn != null) __obj.updateDynamic("textFn")(js.Any.fromFunction2(textFn))
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XML2JSON]
  }
}

