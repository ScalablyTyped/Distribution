package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an element in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDElement")
@js.native
class XMLDTDElement () extends js.Object {
  /**
    * The name of the element
    */
  var name: java.lang.String = js.native
  /**
    * Element content
    */
  var value: java.lang.String = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
}

