package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * Gets an node attribute by name
    * @param attrName  Name of the attribute
    * @param ignoreCase  whenever or not to ignore the name casing
    */
  def getAttribute(attrName: java.lang.String, ignoreCase: scala.Boolean): XmlAttribute
  /**
    * Traverses the XML Nodes and iterates through specified path
    * @param path  Node names to traverse down
    * @param ignoreCase  Ignore the casing of the path / node names
    */
  def path(path: js.Array[java.lang.String], ignoreCase: scala.Boolean): js.Array[XmlNode]
  /**
    * Recursively traverses the nodes and calls the given function in-order
    * @param fn Function to call for each node
    */
  def visit(fn: js.Function1[/* n */ this.type, scala.Unit]): scala.Unit
}

object Node {
  @scala.inline
  def apply(
    getAttribute: (java.lang.String, scala.Boolean) => XmlAttribute,
    path: (js.Array[java.lang.String], scala.Boolean) => js.Array[XmlNode],
    visit: js.Function1[Node, scala.Unit] => scala.Unit
  ): Node = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), path = js.Any.fromFunction2(path), visit = js.Any.fromFunction1(visit))
  
    __obj.asInstanceOf[Node]
  }
}

