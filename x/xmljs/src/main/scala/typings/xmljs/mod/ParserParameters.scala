package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserParameters extends js.Object {
  /**
    * Turn the tagsNames to lowercase
    */
  var lowercaseTagnames: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables xml namespaces
    */
  var noNamespaces: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not normalize whitespaces in text
    */
  var noNormalizeWhitespaces: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable position tracing of sax
    */
  var noTracing: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not trimtext and comment nodes
    */
  var noTrim: js.UndefOr[Boolean] = js.undefined
  /**
    * Whenever or not to use a strict parser
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow only predefined entities
    */
  var strictEntities: js.UndefOr[Boolean] = js.undefined
}

object ParserParameters {
  @scala.inline
  def apply(
    lowercaseTagnames: js.UndefOr[Boolean] = js.undefined,
    noNamespaces: js.UndefOr[Boolean] = js.undefined,
    noNormalizeWhitespaces: js.UndefOr[Boolean] = js.undefined,
    noTracing: js.UndefOr[Boolean] = js.undefined,
    noTrim: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    strictEntities: js.UndefOr[Boolean] = js.undefined
  ): ParserParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercaseTagnames)) __obj.updateDynamic("lowercaseTagnames")(lowercaseTagnames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noNamespaces)) __obj.updateDynamic("noNamespaces")(noNamespaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noNormalizeWhitespaces)) __obj.updateDynamic("noNormalizeWhitespaces")(noNormalizeWhitespaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTracing)) __obj.updateDynamic("noTracing")(noTracing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTrim)) __obj.updateDynamic("noTrim")(noTrim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictEntities)) __obj.updateDynamic("strictEntities")(strictEntities.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserParameters]
  }
}

