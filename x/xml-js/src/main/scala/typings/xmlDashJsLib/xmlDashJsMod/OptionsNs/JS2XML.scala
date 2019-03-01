package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JS2XML
  extends ChangingKeyNames
     with IgnoreOptions {
  var attributeNameFn: js.UndefOr[
    js.Function4[
      /* attributeName */ java.lang.String, 
      /* attributeValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var attributeValueFn: js.UndefOr[
    js.Function4[
      /* attributeValue */ java.lang.String, 
      /* attributeName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var attributesFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var cdataFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var commentFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var doctypeFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var elementNameFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var fullTagEmptyElement: js.UndefOr[scala.Boolean] = js.undefined
  var fullTagEmptyElementFn: js.UndefOr[
    js.Function2[
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var indentAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var indentCdata: js.UndefOr[scala.Boolean] = js.undefined
  var indentInstruction: js.UndefOr[scala.Boolean] = js.undefined
  var indentText: js.UndefOr[scala.Boolean] = js.undefined
  var instructionFn: js.UndefOr[
    js.Function4[
      /* instructionValue */ java.lang.String, 
      /* instructionName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var instructionNameFn: js.UndefOr[
    js.Function4[
      /* instructionName */ java.lang.String, 
      /* instructionValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var noQuotesForNativeAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var spaces: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textFn: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
}

object JS2XML {
  @scala.inline
  def apply(
    attributeNameFn: js.Function4[
      /* attributeName */ java.lang.String, 
      /* attributeValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    attributeValueFn: js.Function4[
      /* attributeValue */ java.lang.String, 
      /* attributeName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    attributesFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    attributesKey: java.lang.String = null,
    cdataFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    cdataKey: java.lang.String = null,
    commentFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    commentKey: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    declarationKey: java.lang.String = null,
    doctypeFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    doctypeKey: java.lang.String = null,
    elementNameFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    elementsKey: java.lang.String = null,
    fullTagEmptyElement: js.UndefOr[scala.Boolean] = js.undefined,
    fullTagEmptyElementFn: js.Function2[
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    ignoreAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreComment: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreText: js.UndefOr[scala.Boolean] = js.undefined,
    indentAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    indentCdata: js.UndefOr[scala.Boolean] = js.undefined,
    indentInstruction: js.UndefOr[scala.Boolean] = js.undefined,
    indentText: js.UndefOr[scala.Boolean] = js.undefined,
    instructionFn: js.Function4[
      /* instructionValue */ java.lang.String, 
      /* instructionName */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    instructionKey: java.lang.String = null,
    instructionNameFn: js.Function4[
      /* instructionName */ java.lang.String, 
      /* instructionValue */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    nameKey: java.lang.String = null,
    noQuotesForNativeAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    parentKey: java.lang.String = null,
    spaces: scala.Double | java.lang.String = null,
    textFn: js.Function3[
      /* value */ java.lang.String, 
      /* currentElementName */ java.lang.String, 
      /* currentElementObj */ js.Object, 
      scala.Unit
    ] = null,
    textKey: java.lang.String = null,
    typeKey: java.lang.String = null
  ): JS2XML = {
    val __obj = js.Dynamic.literal()
    if (attributeNameFn != null) __obj.updateDynamic("attributeNameFn")(attributeNameFn)
    if (attributeValueFn != null) __obj.updateDynamic("attributeValueFn")(attributeValueFn)
    if (attributesFn != null) __obj.updateDynamic("attributesFn")(attributesFn)
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (cdataFn != null) __obj.updateDynamic("cdataFn")(cdataFn)
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey)
    if (commentFn != null) __obj.updateDynamic("commentFn")(commentFn)
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey)
    if (doctypeFn != null) __obj.updateDynamic("doctypeFn")(doctypeFn)
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey)
    if (elementNameFn != null) __obj.updateDynamic("elementNameFn")(elementNameFn)
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey)
    if (!js.isUndefined(fullTagEmptyElement)) __obj.updateDynamic("fullTagEmptyElement")(fullTagEmptyElement)
    if (fullTagEmptyElementFn != null) __obj.updateDynamic("fullTagEmptyElementFn")(fullTagEmptyElementFn)
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes)
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata)
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment)
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration)
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype)
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction)
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText)
    if (!js.isUndefined(indentAttributes)) __obj.updateDynamic("indentAttributes")(indentAttributes)
    if (!js.isUndefined(indentCdata)) __obj.updateDynamic("indentCdata")(indentCdata)
    if (!js.isUndefined(indentInstruction)) __obj.updateDynamic("indentInstruction")(indentInstruction)
    if (!js.isUndefined(indentText)) __obj.updateDynamic("indentText")(indentText)
    if (instructionFn != null) __obj.updateDynamic("instructionFn")(instructionFn)
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey)
    if (instructionNameFn != null) __obj.updateDynamic("instructionNameFn")(instructionNameFn)
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey)
    if (!js.isUndefined(noQuotesForNativeAttributes)) __obj.updateDynamic("noQuotesForNativeAttributes")(noQuotesForNativeAttributes)
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (textFn != null) __obj.updateDynamic("textFn")(textFn)
    if (textKey != null) __obj.updateDynamic("textKey")(textKey)
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey)
    __obj.asInstanceOf[JS2XML]
  }
}

