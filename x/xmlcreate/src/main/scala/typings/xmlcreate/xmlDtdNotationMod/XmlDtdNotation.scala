package typings.xmlcreate.xmlDtdNotationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtdNotation[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the text of this notation declaration.
    */
  def charData(): String = js.native
  /**
    * Sets the text of this notation declaration.
    */
  def charData(charData: String): js.Any = js.native
  /**
    * Returns the parent of this notation declaration.
    */
  def up(): Parent = js.native
}

