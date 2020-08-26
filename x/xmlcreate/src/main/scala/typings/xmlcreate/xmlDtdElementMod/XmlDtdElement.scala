package typings.xmlcreate.xmlDtdElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdElement[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the text of this element declaration.
    */
  def charData: String = js.native
  /**
    * Sets the text of this element declaration.
    */
  def charData_=(charData: String): Unit = js.native
  /**
    * Returns the parent of this element declaration.
    */
  def up(): Parent = js.native
}

