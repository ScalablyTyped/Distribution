package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an XML attribute.
  */
@JSImport("xmlbuilder", "XMLAttribute")
@js.native
class XMLAttribute () extends StObject {
  
  /** 
    * Attribute name 
    */
  var name: String = js.native
  
  /** 
    * Parent element node 
    */
  var parent: XMLElement = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
  
  /** 
    * Type of the node 
    */
  var `type`: NodeType_ = js.native
  
  /** 
    * Attribute value 
    */
  var value: String = js.native
}
