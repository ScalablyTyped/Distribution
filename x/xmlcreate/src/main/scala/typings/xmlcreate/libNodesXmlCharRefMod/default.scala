package typings.xmlcreate.libNodesXmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCharRef", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlCharRef[Parent] {
  def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  /* CompleteClass */
  override var _char: js.Any = js.native
  /* CompleteClass */
  override var _hex: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the character of this character reference.
    */
  /**
    * Sets the character of this character reference.
    */
  /* CompleteClass */
  override var char: String = js.native
  /**
    * Gets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  /**
    * Sets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  /* CompleteClass */
  override var hex: Boolean = js.native
  /**
    * Returns the parent of this character reference.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

