package typings.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDecryptionTransform extends js.Object {
  var XmlDecryptionTransform: String = js.native
  var XmlDsigBase64Transform: String = js.native
  var XmlDsigC14NTransform: String = js.native
  var XmlDsigC14NWithCommentsTransform: String = js.native
  var XmlDsigEnvelopedSignatureTransform: String = js.native
  var XmlDsigExcC14NTransform: String = js.native
  var XmlDsigExcC14NWithCommentsTransform: String = js.native
  var XmlDsigXPathTransform: String = js.native
  var XmlDsigXsltTransform: String = js.native
  var XmlLicenseTransform: String = js.native
}

object XmlDecryptionTransform {
  @scala.inline
  def apply(
    XmlDecryptionTransform: String,
    XmlDsigBase64Transform: String,
    XmlDsigC14NTransform: String,
    XmlDsigC14NWithCommentsTransform: String,
    XmlDsigEnvelopedSignatureTransform: String,
    XmlDsigExcC14NTransform: String,
    XmlDsigExcC14NWithCommentsTransform: String,
    XmlDsigXPathTransform: String,
    XmlDsigXsltTransform: String,
    XmlLicenseTransform: String
  ): XmlDecryptionTransform = {
    val __obj = js.Dynamic.literal(XmlDecryptionTransform = XmlDecryptionTransform.asInstanceOf[js.Any], XmlDsigBase64Transform = XmlDsigBase64Transform.asInstanceOf[js.Any], XmlDsigC14NTransform = XmlDsigC14NTransform.asInstanceOf[js.Any], XmlDsigC14NWithCommentsTransform = XmlDsigC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigEnvelopedSignatureTransform = XmlDsigEnvelopedSignatureTransform.asInstanceOf[js.Any], XmlDsigExcC14NTransform = XmlDsigExcC14NTransform.asInstanceOf[js.Any], XmlDsigExcC14NWithCommentsTransform = XmlDsigExcC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigXPathTransform = XmlDsigXPathTransform.asInstanceOf[js.Any], XmlDsigXsltTransform = XmlDsigXsltTransform.asInstanceOf[js.Any], XmlLicenseTransform = XmlLicenseTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDecryptionTransform]
  }
  @scala.inline
  implicit class XmlDecryptionTransformOps[Self <: XmlDecryptionTransform] (val x: Self) extends AnyVal {
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
    def setXmlDecryptionTransform(value: String): Self = this.set("XmlDecryptionTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigBase64Transform(value: String): Self = this.set("XmlDsigBase64Transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigC14NTransform(value: String): Self = this.set("XmlDsigC14NTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigC14NWithCommentsTransform(value: String): Self = this.set("XmlDsigC14NWithCommentsTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigEnvelopedSignatureTransform(value: String): Self = this.set("XmlDsigEnvelopedSignatureTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigExcC14NTransform(value: String): Self = this.set("XmlDsigExcC14NTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigExcC14NWithCommentsTransform(value: String): Self = this.set("XmlDsigExcC14NWithCommentsTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigXPathTransform(value: String): Self = this.set("XmlDsigXPathTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlDsigXsltTransform(value: String): Self = this.set("XmlDsigXsltTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlLicenseTransform(value: String): Self = this.set("XmlLicenseTransform", value.asInstanceOf[js.Any])
  }
  
}

