package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlNode extends Node {
  var localName: String
  var name: String
  var ns: String
  var prefix: String
  var text: String
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
}

