package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLinkOptions extends js.Object {
  var cashtagClass: js.UndefOr[String] = js.undefined
  var cashtagUrlBase: js.UndefOr[String] = js.undefined
  var hashtagClass: js.UndefOr[String] = js.undefined
  var hashtagUrlBase: js.UndefOr[String] = js.undefined
  var htmlAttrs: js.UndefOr[Attributes] = js.undefined
  var htmlEscapeNonEntities: js.UndefOr[Boolean] = js.undefined
  var invisibleTagAttrs: js.UndefOr[String] = js.undefined
  var linkAttributeBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* attributes */ Attributes, Unit]] = js.undefined
  var linkTextBlock: js.UndefOr[js.Function2[/* entity */ EntityWithIndices, /* text */ String, Unit]] = js.undefined
  var listClass: js.UndefOr[String] = js.undefined
  var listUrlBase: js.UndefOr[String] = js.undefined
  var suppressNoFollow: js.UndefOr[Boolean] = js.undefined
  var symbolTag: js.UndefOr[String] = js.undefined
  var targetBlank: js.UndefOr[Boolean] = js.undefined
  var textWithSymbolTag: js.UndefOr[String] = js.undefined
  var urlEntities: js.UndefOr[js.Array[UrlEntity]] = js.undefined
  var usernameClass: js.UndefOr[String] = js.undefined
  var usernameIncludeSymbol: js.UndefOr[Boolean] = js.undefined
  var usernameUrlBase: js.UndefOr[String] = js.undefined
}

object AutoLinkOptions {
  @scala.inline
  def apply(
    cashtagClass: String = null,
    cashtagUrlBase: String = null,
    hashtagClass: String = null,
    hashtagUrlBase: String = null,
    htmlAttrs: Attributes = null,
    htmlEscapeNonEntities: js.UndefOr[Boolean] = js.undefined,
    invisibleTagAttrs: String = null,
    linkAttributeBlock: (/* entity */ EntityWithIndices, /* attributes */ Attributes) => Unit = null,
    linkTextBlock: (/* entity */ EntityWithIndices, /* text */ String) => Unit = null,
    listClass: String = null,
    listUrlBase: String = null,
    suppressNoFollow: js.UndefOr[Boolean] = js.undefined,
    symbolTag: String = null,
    targetBlank: js.UndefOr[Boolean] = js.undefined,
    textWithSymbolTag: String = null,
    urlEntities: js.Array[UrlEntity] = null,
    usernameClass: String = null,
    usernameIncludeSymbol: js.UndefOr[Boolean] = js.undefined,
    usernameUrlBase: String = null
  ): AutoLinkOptions = {
    val __obj = js.Dynamic.literal()
    if (cashtagClass != null) __obj.updateDynamic("cashtagClass")(cashtagClass.asInstanceOf[js.Any])
    if (cashtagUrlBase != null) __obj.updateDynamic("cashtagUrlBase")(cashtagUrlBase.asInstanceOf[js.Any])
    if (hashtagClass != null) __obj.updateDynamic("hashtagClass")(hashtagClass.asInstanceOf[js.Any])
    if (hashtagUrlBase != null) __obj.updateDynamic("hashtagUrlBase")(hashtagUrlBase.asInstanceOf[js.Any])
    if (htmlAttrs != null) __obj.updateDynamic("htmlAttrs")(htmlAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlEscapeNonEntities)) __obj.updateDynamic("htmlEscapeNonEntities")(htmlEscapeNonEntities.get.asInstanceOf[js.Any])
    if (invisibleTagAttrs != null) __obj.updateDynamic("invisibleTagAttrs")(invisibleTagAttrs.asInstanceOf[js.Any])
    if (linkAttributeBlock != null) __obj.updateDynamic("linkAttributeBlock")(js.Any.fromFunction2(linkAttributeBlock))
    if (linkTextBlock != null) __obj.updateDynamic("linkTextBlock")(js.Any.fromFunction2(linkTextBlock))
    if (listClass != null) __obj.updateDynamic("listClass")(listClass.asInstanceOf[js.Any])
    if (listUrlBase != null) __obj.updateDynamic("listUrlBase")(listUrlBase.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressNoFollow)) __obj.updateDynamic("suppressNoFollow")(suppressNoFollow.get.asInstanceOf[js.Any])
    if (symbolTag != null) __obj.updateDynamic("symbolTag")(symbolTag.asInstanceOf[js.Any])
    if (!js.isUndefined(targetBlank)) __obj.updateDynamic("targetBlank")(targetBlank.get.asInstanceOf[js.Any])
    if (textWithSymbolTag != null) __obj.updateDynamic("textWithSymbolTag")(textWithSymbolTag.asInstanceOf[js.Any])
    if (urlEntities != null) __obj.updateDynamic("urlEntities")(urlEntities.asInstanceOf[js.Any])
    if (usernameClass != null) __obj.updateDynamic("usernameClass")(usernameClass.asInstanceOf[js.Any])
    if (!js.isUndefined(usernameIncludeSymbol)) __obj.updateDynamic("usernameIncludeSymbol")(usernameIncludeSymbol.get.asInstanceOf[js.Any])
    if (usernameUrlBase != null) __obj.updateDynamic("usernameUrlBase")(usernameUrlBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLinkOptions]
  }
}

