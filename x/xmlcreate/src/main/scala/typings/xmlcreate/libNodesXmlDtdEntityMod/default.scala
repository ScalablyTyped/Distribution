package typings.xmlcreate.libNodesXmlDtdEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdEntity", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlDtdEntity[Parent] {
  def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  /* CompleteClass */
  override var _charData: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the text of this entity declaration.
    */
  /**
    * Sets the text of this entity declaration.
    */
  /* CompleteClass */
  override var charData: String = js.native
  /**
    * Returns the parent of this entity declaration.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

