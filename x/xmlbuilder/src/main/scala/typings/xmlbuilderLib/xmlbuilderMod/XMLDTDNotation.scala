package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a notation in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDNotation")
@js.native
class XMLDTDNotation () extends js.Object {
  /**
    * The name of the notation
    */
  var name: java.lang.String = js.native
  /**
    * Public identifier
    */
  var pubID: java.lang.String = js.native
  /**
    * System identifier
    */
  var sysID: java.lang.String = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
}

