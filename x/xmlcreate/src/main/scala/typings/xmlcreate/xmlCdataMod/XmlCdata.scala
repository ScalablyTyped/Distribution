package typings.xmlcreate.xmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlCdata[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _replaceInvalidCharsInCharData: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the character data of this CDATA section.
    */
  def charData: String = js.native
  /**
    * Sets the character data of this CDATA section.
    */
  def charData(charData: String): js.Any = js.native
  /**
    * Returns the parent of this CDATA section.
    */
  def up(): Parent = js.native
}

