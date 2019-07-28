package typings.xmlbuilder.xmlbuilderMod

import typings.xmlbuilder.Anon_String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an element node.
  */
@JSImport("xmlbuilder", "XMLElement")
@js.native
class XMLElement () extends XMLNode {
  /**
    * Element attributes
    */
  var attribs: Anon_String = js.native
  /**
    * Element node name
    */
  var name: String = js.native
  /**
    * Removes an attribute.
    * 
    * @param name - attribute name
    * 
    * @returns the parent element node
    */
  def removeAttribute(name: String): XMLElement = js.native
  def removeAttribute(name: js.Array[String]): XMLElement = js.native
  def toString(options: XMLToStringOptions): String = js.native
}

