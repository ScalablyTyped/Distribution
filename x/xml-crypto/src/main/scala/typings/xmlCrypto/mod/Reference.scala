package typings.xmlCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var digestAlgorithm: js.UndefOr[String] = js.native
  var digestValue: js.UndefOr[String] = js.native
  var inclusiveNamespacesPrefixList: js.UndefOr[String] = js.native
  var isEmptyUri: js.UndefOr[Boolean] = js.native
  var transforms: js.UndefOr[js.Array[String]] = js.native
  var uri: js.UndefOr[String] = js.native
  var xpath: String = js.native
}

object Reference {
  @scala.inline
  def apply(xpath: String): Reference = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
    @scala.inline
    def setDigestValue(value: String): Self = this.set("digestValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestValue: Self = this.set("digestValue", js.undefined)
    @scala.inline
    def setInclusiveNamespacesPrefixList(value: String): Self = this.set("inclusiveNamespacesPrefixList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusiveNamespacesPrefixList: Self = this.set("inclusiveNamespacesPrefixList", js.undefined)
    @scala.inline
    def setIsEmptyUri(value: Boolean): Self = this.set("isEmptyUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEmptyUri: Self = this.set("isEmptyUri", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: String*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[String]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

