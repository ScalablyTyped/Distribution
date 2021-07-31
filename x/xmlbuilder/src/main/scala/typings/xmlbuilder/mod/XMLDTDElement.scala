package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an element in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDElement")
@js.native
class XMLDTDElement () extends StObject {
  
  /**
    * The name of the element
    */
  var name: String = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
  
  /**
    * Element content
    */
  var value: String = js.native
}
