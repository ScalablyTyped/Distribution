package typings.xmlCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  var digestValue: js.UndefOr[String] = js.undefined
  var inclusiveNamespacesPrefixList: js.UndefOr[String] = js.undefined
  var isEmptyUri: js.UndefOr[Boolean] = js.undefined
  var transforms: js.UndefOr[js.Array[String]] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var xpath: String
}

object Reference {
  @scala.inline
  def apply(
    xpath: String,
    digestAlgorithm: String = null,
    digestValue: String = null,
    inclusiveNamespacesPrefixList: String = null,
    isEmptyUri: js.UndefOr[Boolean] = js.undefined,
    transforms: js.Array[String] = null,
    uri: String = null
  ): Reference = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (digestValue != null) __obj.updateDynamic("digestValue")(digestValue.asInstanceOf[js.Any])
    if (inclusiveNamespacesPrefixList != null) __obj.updateDynamic("inclusiveNamespacesPrefixList")(inclusiveNamespacesPrefixList.asInstanceOf[js.Any])
    if (!js.isUndefined(isEmptyUri)) __obj.updateDynamic("isEmptyUri")(isEmptyUri.get.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

