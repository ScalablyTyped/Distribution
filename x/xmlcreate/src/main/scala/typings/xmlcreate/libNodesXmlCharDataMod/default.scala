package typings.xmlcreate.libNodesXmlCharDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCharData", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlCharData[Parent] {
  def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  /* CompleteClass */
  override var _charData: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _replaceInvalidCharsInCharData: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the text of this character data.
    */
  /**
    * Sets the text of this character data.
    */
  /* CompleteClass */
  override var charData: String = js.native
  /**
    * Returns the parent of this character data.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

