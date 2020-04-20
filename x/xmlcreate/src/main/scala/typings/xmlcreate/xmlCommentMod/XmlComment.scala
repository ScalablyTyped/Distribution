package typings.xmlcreate.xmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlComment[Parent] extends js.Object {
  var _charData: js.Any = js.native
  val _parent: js.Any = js.native
  val _replaceInvalidCharsInCharData: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the text of this comment.
    */
  def charData: String = js.native
  /**
    * Sets the text of this comment.
    */
  def charData(charData: String): js.Any = js.native
  /**
    * Returns the parent of this comment.
    */
  def up(): Parent = js.native
}

