package typings.xmlcreate.libNodesXmlCommentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlComment", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlComment[Parent] {
  def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  /* CompleteClass */
  override var _charData: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _replaceInvalidCharsInCharData: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the text of this comment.
    */
  /**
    * Sets the text of this comment.
    */
  /* CompleteClass */
  override var charData: String = js.native
  /**
    * Returns the parent of this comment.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

