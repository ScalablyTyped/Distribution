package typings.xmlcreate.xmlCharDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCharData[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _replaceInvalidCharsInCharData: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the text of this character data.
    */
  def charData: String = js.native
  /**
    * Sets the text of this character data.
    */
  def charData_=(charData: String): Unit = js.native
  /**
    * Returns the parent of this character data.
    */
  def up(): Parent = js.native
}

