package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an entity in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDEntity")
@js.native
class XMLDTDEntity () extends js.Object {
  /**
    * Notation declaration
    */
  var nData: java.lang.String = js.native
  /**
    * The name of the entity
    */
  var name: java.lang.String = js.native
  /** 
    * Determines whether this is a parameter entity (`true`) or a 
    * general entity (`false`).
    */
  var pe: scala.Boolean = js.native
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

