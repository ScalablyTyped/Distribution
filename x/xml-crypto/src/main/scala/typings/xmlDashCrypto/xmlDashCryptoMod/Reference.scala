package typings.xmlDashCrypto.xmlDashCryptoMod

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
    val __obj = js.Dynamic.literal(xpath = xpath)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (digestValue != null) __obj.updateDynamic("digestValue")(digestValue)
    if (inclusiveNamespacesPrefixList != null) __obj.updateDynamic("inclusiveNamespacesPrefixList")(inclusiveNamespacesPrefixList)
    if (!js.isUndefined(isEmptyUri)) __obj.updateDynamic("isEmptyUri")(isEmptyUri)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Reference]
  }
}

