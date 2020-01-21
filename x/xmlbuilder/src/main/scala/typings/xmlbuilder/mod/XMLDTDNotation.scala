package typings.xmlbuilder.mod

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

