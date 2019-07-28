package typings.xmlcreate.libNodesXmlDtdElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdElement", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlDtdElement[Parent] {
  def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  /* CompleteClass */
  override var _charData: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the text of this element declaration.
    */
  /**
    * Sets the text of this element declaration.
    */
  /* CompleteClass */
  override var charData: String = js.native
  /**
    * Returns the parent of this element declaration.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

