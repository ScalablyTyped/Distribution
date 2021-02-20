package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a notation in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDNotation")
@js.native
class XMLDTDNotation () extends StObject {
  
  /**
    * The name of the notation
    */
  var name: String = js.native
  
  /**
    * Public identifier
    */
  var pubID: String = js.native
  
  /**
    * System identifier
    */
  var sysID: String = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
}
