package typings.xmlDashJs.xmlDashJsMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XML2JS
  extends ChangingKeyNames
     with IgnoreOptions {
  var addParent: js.UndefOr[Boolean] = js.undefined
  var alwaysArray: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var alwaysChildren: js.UndefOr[Boolean] = js.undefined
  var attributeNameFn: js.UndefOr[
    js.Function3[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.undefined
  var attributeValueFn: js.UndefOr[
    js.Function3[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.undefined
  var attributesFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ String, Unit]] = js.undefined
  var captureSpacesBetweenElements: js.UndefOr[Boolean] = js.undefined
  var cdataFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
  var commentFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var doctypeFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
  var elementNameFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
  var instructionFn: js.UndefOr[
    js.Function3[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.undefined
  var instructionHasAttributes: js.UndefOr[Boolean] = js.undefined
  var instructionNameFn: js.UndefOr[
    js.Function3[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* parentElement */ String, 
      Unit
    ]
  ] = js.undefined
  var nativeType: js.UndefOr[Boolean] = js.undefined
  var sanitize: js.UndefOr[Boolean] = js.undefined
  var textFn: js.UndefOr[js.Function2[/* value */ String, /* parentElement */ js.Object, Unit]] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object XML2JS {
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
    textFn: (/* value */ String, /* parentElement */ js.Object) => Unit = null,
    textKey: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    typeKey: String = null
  ): XML2JS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addParent)) __obj.updateDynamic("addParent")(addParent.asInstanceOf[js.Any])
    if (alwaysArray != null) __obj.updateDynamic("alwaysArray")(alwaysArray.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysChildren)) __obj.updateDynamic("alwaysChildren")(alwaysChildren.asInstanceOf[js.Any])
    if (attributeNameFn != null) __obj.updateDynamic("attributeNameFn")(js.Any.fromFunction3(attributeNameFn))
    if (attributeValueFn != null) __obj.updateDynamic("attributeValueFn")(js.Any.fromFunction3(attributeValueFn))
    if (attributesFn != null) __obj.updateDynamic("attributesFn")(js.Any.fromFunction2(attributesFn))
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (!js.isUndefined(captureSpacesBetweenElements)) __obj.updateDynamic("captureSpacesBetweenElements")(captureSpacesBetweenElements.asInstanceOf[js.Any])
    if (cdataFn != null) __obj.updateDynamic("cdataFn")(js.Any.fromFunction2(cdataFn))
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey.asInstanceOf[js.Any])
    if (commentFn != null) __obj.updateDynamic("commentFn")(js.Any.fromFunction2(commentFn))
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey.asInstanceOf[js.Any])
    if (doctypeFn != null) __obj.updateDynamic("doctypeFn")(js.Any.fromFunction2(doctypeFn))
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey.asInstanceOf[js.Any])
    if (elementNameFn != null) __obj.updateDynamic("elementNameFn")(js.Any.fromFunction2(elementNameFn))
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText.asInstanceOf[js.Any])
    if (instructionFn != null) __obj.updateDynamic("instructionFn")(js.Any.fromFunction3(instructionFn))
    if (!js.isUndefined(instructionHasAttributes)) __obj.updateDynamic("instructionHasAttributes")(instructionHasAttributes.asInstanceOf[js.Any])
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey.asInstanceOf[js.Any])
    if (instructionNameFn != null) __obj.updateDynamic("instructionNameFn")(js.Any.fromFunction3(instructionNameFn))
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeType)) __obj.updateDynamic("nativeType")(nativeType.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (textFn != null) __obj.updateDynamic("textFn")(js.Any.fromFunction2(textFn))
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XML2JS]
  }
}

