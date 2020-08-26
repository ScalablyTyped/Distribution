package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNode extends Node {
  var localName: String = js.native
  var name: String = js.native
  var ns: String = js.native
  var prefix: String = js.native
  var text: String = js.native
}

object XmlNode {
  @scala.inline
  def apply(
    getAttribute: (String, Boolean) => XmlAttribute,
    localName: String,
    name: String,
    ns: String,
    path: (js.Array[String], Boolean) => js.Array[XmlNode],
    prefix: String,
    text: String,
    visit: js.Function1[XmlNode, Unit] => Unit
  ): XmlNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], path = js.Any.fromFunction2(path), prefix = prefix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[XmlNode]
  }
  @scala.inline
  implicit class XmlNodeOps[Self <: XmlNode] (val x: Self) extends AnyVal {
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
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

