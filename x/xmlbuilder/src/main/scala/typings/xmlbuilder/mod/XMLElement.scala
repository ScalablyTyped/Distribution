package typings.xmlbuilder.mod

import typings.xmlbuilder.anon.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an element node.
  */
@JSImport("xmlbuilder", "XMLElement")
@js.native
open class XMLElement () extends XMLNode {
  
  /**
    * Element attributes
    */
  var attribs: String = js.native
  
  /**
    * Element node name
    */
  var name: java.lang.String = js.native
  
  /**
    * Removes an attribute.
    * 
    * @param name - attribute name
    * 
    * @returns the parent element node
    */
  def removeAttribute(name: java.lang.String): XMLElement = js.native
  def removeAttribute(name: js.Array[java.lang.String]): XMLElement = js.native
  
  def toString(options: XMLToStringOptions): java.lang.String = js.native
}
