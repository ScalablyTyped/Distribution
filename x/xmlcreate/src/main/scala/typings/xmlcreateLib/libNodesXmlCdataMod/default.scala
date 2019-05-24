package typings
package xmlcreateLib.libNodesXmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Default)
@js.native
class default[Parent] protected () extends XmlCdata[Parent] {
  def this(parent: Parent, validation: scala.Boolean, options: IXmlCdataOptions) = this()
  /* CompleteClass */
  override var _charData: js.Any = js.native
  /* CompleteClass */
  override val _parent: js.Any = js.native
  /* CompleteClass */
  override val _replaceInvalidCharsInCharData: js.Any = js.native
  /* CompleteClass */
  override val _validation: js.Any = js.native
  /**
    * Gets the character data of this CDATA section.
    */
  /**
    * Sets the character data of this CDATA section.
    */
  /* CompleteClass */
  override var charData: java.lang.String = js.native
  /**
    * Returns the parent of this CDATA section.
    */
  /* CompleteClass */
  override def up(): Parent = js.native
}

