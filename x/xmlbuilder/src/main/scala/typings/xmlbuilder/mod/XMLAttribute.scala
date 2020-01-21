package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an XML attribute.
  */
@JSImport("xmlbuilder", "XMLAttribute")
@js.native
class XMLAttribute () extends js.Object {
  /** 
    * Attribute name 
    */
  var name: String = js.native
  /** 
    * Parent element node 
    */
  var parent: XMLElement = js.native
  /** 
    * Type of the node 
    */
  var `type`: NodeType_ = js.native
  /** 
    * Attribute value 
    */
  var value: String = js.native
  def toString(options: XMLToStringOptions): String = js.native
}

