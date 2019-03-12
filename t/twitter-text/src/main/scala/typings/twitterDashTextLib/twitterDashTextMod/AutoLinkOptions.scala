package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLinkOptions extends js.Object {
  var cashtagClass: js.UndefOr[java.lang.String] = js.undefined
  var cashtagUrlBase: js.UndefOr[java.lang.String] = js.undefined
  var hashtagClass: js.UndefOr[java.lang.String] = js.undefined
  var hashtagUrlBase: js.UndefOr[java.lang.String] = js.undefined
  var htmlAttrs: js.UndefOr[Attributes] = js.undefined
  var htmlEscapeNonEntities: js.UndefOr[scala.Boolean] = js.undefined
  var invisibleTagAttrs: js.UndefOr[java.lang.String] = js.undefined
  var linkAttributeBlock: js.UndefOr[
    js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, scala.Unit]
  ] = js.undefined
  var linkTextBlock: js.UndefOr[
    js.Function2[/* entity */ EntityWithIndices, /* text */ java.lang.String, scala.Unit]
  ] = js.undefined
  var listClass: js.UndefOr[java.lang.String] = js.undefined
  var listUrlBase: js.UndefOr[java.lang.String] = js.undefined
  var suppressNoFollow: js.UndefOr[scala.Boolean] = js.undefined
  var symbolTag: js.UndefOr[java.lang.String] = js.undefined
  var targetBlank: js.UndefOr[scala.Boolean] = js.undefined
  var textWithSymbolTag: js.UndefOr[java.lang.String] = js.undefined
  var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.undefined
  var usernameClass: js.UndefOr[java.lang.String] = js.undefined
  var usernameIncludeSymbol: js.UndefOr[scala.Boolean] = js.undefined
  var usernameUrlBase: js.UndefOr[java.lang.String] = js.undefined
}

object AutoLinkOptions {
  @scala.inline
  def apply(
    cashtagClass: java.lang.String = null,
    cashtagUrlBase: java.lang.String = null,
    hashtagClass: java.lang.String = null,
    hashtagUrlBase: java.lang.String = null,
    htmlAttrs: Attributes = null,
    htmlEscapeNonEntities: js.UndefOr[scala.Boolean] = js.undefined,
    invisibleTagAttrs: java.lang.String = null,
    linkAttributeBlock: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => scala.Unit = null,
    linkTextBlock: (/* entity */ EntityWithIndices, /* text */ java.lang.String) => scala.Unit = null,
    listClass: java.lang.String = null,
    listUrlBase: java.lang.String = null,
    suppressNoFollow: js.UndefOr[scala.Boolean] = js.undefined,
    symbolTag: java.lang.String = null,
    targetBlank: js.UndefOr[scala.Boolean] = js.undefined,
    textWithSymbolTag: java.lang.String = null,
    urlEntities: js.Array[UrlEntity] = null,
    usernameClass: java.lang.String = null,
    usernameIncludeSymbol: js.UndefOr[scala.Boolean] = js.undefined,
    usernameUrlBase: java.lang.String = null
  ): AutoLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (cashtagClass != null) __obj.updateDynamic("cashtagClass")(cashtagClass)
    if (cashtagUrlBase != null) __obj.updateDynamic("cashtagUrlBase")(cashtagUrlBase)
    if (hashtagClass != null) __obj.updateDynamic("hashtagClass")(hashtagClass)
    if (hashtagUrlBase != null) __obj.updateDynamic("hashtagUrlBase")(hashtagUrlBase)
    if (htmlAttrs != null) __obj.updateDynamic("htmlAttrs")(htmlAttrs)
    if (!js.isUndefined(htmlEscapeNonEntities)) __obj.updateDynamic("htmlEscapeNonEntities")(htmlEscapeNonEntities)
    if (invisibleTagAttrs != null) __obj.updateDynamic("invisibleTagAttrs")(invisibleTagAttrs)
    if (linkAttributeBlock != null) __obj.updateDynamic("linkAttributeBlock")(js.Any.fromFunction2(linkAttributeBlock))
    if (linkTextBlock != null) __obj.updateDynamic("linkTextBlock")(js.Any.fromFunction2(linkTextBlock))
    if (listClass != null) __obj.updateDynamic("listClass")(listClass)
    if (listUrlBase != null) __obj.updateDynamic("listUrlBase")(listUrlBase)
    if (!js.isUndefined(suppressNoFollow)) __obj.updateDynamic("suppressNoFollow")(suppressNoFollow)
    if (symbolTag != null) __obj.updateDynamic("symbolTag")(symbolTag)
    if (!js.isUndefined(targetBlank)) __obj.updateDynamic("targetBlank")(targetBlank)
    if (textWithSymbolTag != null) __obj.updateDynamic("textWithSymbolTag")(textWithSymbolTag)
    if (urlEntities != null) __obj.updateDynamic("urlEntities")(urlEntities)
    if (usernameClass != null) __obj.updateDynamic("usernameClass")(usernameClass)
    if (!js.isUndefined(usernameIncludeSymbol)) __obj.updateDynamic("usernameIncludeSymbol")(usernameIncludeSymbol)
    if (usernameUrlBase != null) __obj.updateDynamic("usernameUrlBase")(usernameUrlBase)
    __obj.asInstanceOf[AutoLinkOptions]
  }
}

