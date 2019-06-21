package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlNode extends Node {
  var localName: java.lang.String
  var name: java.lang.String
  var ns: java.lang.String
  var prefix: java.lang.String
  var text: java.lang.String
}

object XmlNode {
  @scala.inline
  def apply(
    getAttribute: (java.lang.String, scala.Boolean) => XmlAttribute,
    localName: java.lang.String,
    name: java.lang.String,
    ns: java.lang.String,
    path: (js.Array[java.lang.String], scala.Boolean) => js.Array[XmlNode],
    prefix: java.lang.String,
    text: java.lang.String,
    visit: js.Function1[XmlNode, scala.Unit] => scala.Unit
  ): XmlNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), localName = localName, name = name, ns = ns, path = js.Any.fromFunction2(path), prefix = prefix, text = text, visit = js.Any.fromFunction1(visit))
  
    __obj.asInstanceOf[XmlNode]
  }
}

