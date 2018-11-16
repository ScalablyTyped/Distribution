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

