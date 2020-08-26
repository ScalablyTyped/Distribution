package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * XML Attribute, an attribute with a namespace
  */
@js.native
trait XmlAttribute extends Attribute {
  var ns: String = js.native
}

object XmlAttribute {
  @scala.inline
  def apply(name: String, ns: String, text: String): XmlAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAttribute]
  }
  @scala.inline
  implicit class XmlAttributeOps[Self <: XmlAttribute] (val x: Self) extends AnyVal {
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
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
  }
  
}

